package pojos;

public class Prooveedor {
    private String nit;
    private String direccion;

    public Prooveedor(String nit, String direccion) {
        this.setNit(nit);
        this.setDireccion(direccion);
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
