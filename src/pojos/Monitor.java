package pojos;

public class Monitor extends Alquilable{
    private String resolucionMaxima;

    public Monitor(String codigo, String modelo,double precioHora, String resolucionMaxima) {
        super(codigo, modelo,precioHora);
        this.setResolucionMaxima(resolucionMaxima);
    }

    public String getResolucionMaxima() {
        return resolucionMaxima;
    }

    @Override
    public String toString() {
        return "Monitor:   " +
                "resolucionMaxima:'" + resolucionMaxima + '\'' +
                ", precioHora:" + precioHora +
                ", codigo:'" + codigo + '\'' +
                ", modelo:'" + modelo + '\'' ;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }
}
