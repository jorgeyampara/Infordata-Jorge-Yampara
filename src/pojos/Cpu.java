package pojos;

import java.util.Date;

public class Cpu extends Tecnologico{

    private int memoriaPrincipal;


    public Cpu(String codigo, String modelo, int memoriaPrincipal, String paisOrigen, Date fechaFabricacion,Empresa fabricante) {
        super(codigo, modelo,paisOrigen,fechaFabricacion,fabricante);
        this.setMemoriaPrincipal(memoriaPrincipal);
    }

    public int getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    @Override
    public String toString() {
        return "Cpu:   " +
                "memoriaPrincipal:" + memoriaPrincipal +
                ", paisOrigen:'" + paisOrigen + '\'' +
                ", fechaFabricacion:" + fechaFabricacion +
                ", fabricante:" + fabricante +
                ", codigo:'" + codigo + '\'' +
                ", modelo:'" + modelo + '\'' ;
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }
}
