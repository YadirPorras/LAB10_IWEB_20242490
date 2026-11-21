package org.example.daos;

import org.example.Dtos.EquiposRedDTO;
import org.example.Dtos.SedesDTO;
import java.sql.*;
import java.util.ArrayList;

public class EquiposRedDAO extends DaoBase{

    public ArrayList<EquiposRedDTO> listarEquiposRed() {

        ArrayList<EquiposRedDTO> lista = new ArrayList<>();
        String sql = "SELECT id_equipo, hostname, tipo, ip_gestion, estado, fecha_alta,  id_sede FROM equipos_red";
        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                EquiposRedDTO ls = new EquiposRedDTO();
                ls.setIdEquipo(rs.getInt(1));
                ls.setHostname(rs.getString(2));
                ls.setTipo(rs.getString(3));
                ls.setIpGestion(rs.getString(4));
                ls.setEstado(rs.getString(5));
                ls.setFechaAlta(rs.getString(6));
                ls.setIdSede(rs.getInt(7));
                lista.add(ls);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public void crearEquiposRed(String hostname, String tipo, String estado, String fechaAlta, int idSede) {

        String sql = "INSERT INTO equipos_red (hostname, tipo, estado, fechaAlta, idSede) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = this.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, hostname);
            pstmt.setString(2, tipo);
            pstmt.setString(3, estado);
            pstmt.setString(4, fechaAlta);
            pstmt.setInt(5, idSede);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
