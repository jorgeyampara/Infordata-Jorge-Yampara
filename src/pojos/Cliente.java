package pojos;

public class Cliente {
    private int dni;
    private int telefono;
    private String domicilio;

    public Cliente(int dni, int telefono, String domicilio) {
        this.setDni(dni);
        this.setTelefono(telefono);
        this.setDomicilio(domicilio);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
