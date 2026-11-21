package org.example.Dtos;

public class EquiposRedDTO {

    private int idEquipo;
    private String hostname;
    private String tipo;
    private String ipGestion;
    private String estado;
    private String fechaAlta;
    private int idSede;

    public EquiposRedDTO() {
    }

    public EquiposRedDTO(int idEquipo, String hostname, String tipo, String ipGestion, String estado, String fechaAlta, int idSede) {
        this.idEquipo = idEquipo;
        this.hostname = hostname;
        this.tipo = tipo;
        this.ipGestion = ipGestion;
        this.estado = estado;
        this.fechaAlta = fechaAlta;
        this.idSede = idSede;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIpGestion() {
        return ipGestion;
    }

    public void setIpGestion(String ipGestion) {
        this.ipGestion = ipGestion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }
}
