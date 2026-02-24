package Models;

public class Orden {

    private int folio;
    private String estado;
    private String cliente;

    public Orden() {}

    public Orden(int folio, String estado, String cliente) {
        this.folio = folio;
        this.estado = estado;
        this.cliente = cliente;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}