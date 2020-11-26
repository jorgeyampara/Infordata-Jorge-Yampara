import pojos.*;

import java.util.Calendar;

public class Main {

    public static void main(String[] args){
        //producto

        Producto producto = new Producto("324","mouse inalambrico");
        System.out.println(producto);

        //alquilabre
        Alquilable alquilable = new Alquilable("M647","monitor LG", 8.7);
        System.out.println(alquilable);

        //tecnologico
        Empresa empresa = new Empresa("HP","lanza #342",378);
        Tecnologico tecnologico = new Tecnologico("Y56","rocket500","Bolivia", Calendar.getInstance().getTime(),empresa);
        System.out.println(tecnologico);

        //monitor

        Monitor monitor = new Monitor("L67","Monitor 26",10.50,"1080p");
        System.out.println(monitor);

        //Cpu
        Empresa samsung = new Empresa("Samsung","New York",344);
        Cpu cpu = new Cpu("B78","Satelite",32,"USA",Calendar.getInstance().getTime(),samsung);
        System.out.println(cpu);
    }


}
