package Unidad;

import java.util.ArrayList;

public class Trabajadorv2 {
private String nombre, Apaterno, Amaterno;
    private int numtrabajador, horasextra, añoingreso;
    
    private double sueldo;

    public Trabajadorv2(int numtrabajador, String nombre, String Apaterno, String Amaterno, int horasextra, double sueldo, int añoingreso) {

        this.numtrabajador = numtrabajador;
        this.horasextra = horasextra;
        this.Apaterno = Apaterno;
        this.Amaterno = Amaterno;
        this.sueldo = sueldo;
        this.añoingreso = añoingreso;
        this.nombre = nombre;

    }

    public void setnumtrabajador(int numtrabajador) {
        this.numtrabajador = numtrabajador;
    }

    public int getnumtrabajador() {
        return numtrabajador;
    }

    public int getHorasextra() {
        return horasextra;
    }

    public void setHorasextra(int horasextra) {
        this.horasextra = horasextra;
    }

    public void setAñoingreso(int añoingreso) {
        this.añoingreso = añoingreso;
    }

    public int getAñoingreso() {
        return añoingreso;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnombre() {
        return nombre;
    }

    public void setApaterno(String Apaterno) {
        this.Apaterno = Apaterno;
    }

    public String getApaterno() {
        return Apaterno;
    }

    public String getAmaterno() {
        return Amaterno;
    }

    public void setAmaterno(String Amaterno) {
        this.Amaterno = Amaterno;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public static void AntiguoYReciente(ArrayList trabajoslist) {
        int contador = 0;
        int año = 0;
        int mayor = 0;
        int inmy = 0;

        for (Object item : trabajoslist) {

            año = ((Trabajadorv2) item).getAñoingreso();

            if (contador == 0) {
                mayor = año;
            }

            if (año > mayor) {
                mayor = año;
                inmy = contador;

            }

            contador += 1;
        }

       
        System.out.println("el trabajador más reciente es " + ((Trabajadorv2) trabajoslist.get(inmy)).getnombre() + " " + ((Trabajadorv2) trabajoslist.get(inmy)).getApaterno() + " eres el empleado más nuevo");
        System.out.println("El número mayor es " + mayor);
        contador = 0;
        int imen = 0;
        int menor = 0;
        for (Object item : trabajoslist) {

            año = ((Trabajadorv2) item).getAñoingreso();

            if (contador == 0) {
                menor = año;
            }

            if (año < menor) {
                menor = año;
                imen = contador;

            }

            contador += 1;
        }

        double sueldobonus = ((Trabajadorv2) trabajoslist.get(imen)).getSueldo();
        ((Trabajadorv2) trabajoslist.get(imen)).setSueldo(sueldobonus + sueldobonus * .03);
        System.out.println("el trabajador más antiguo es: " + ((Trabajadorv2) trabajoslist.get(imen)).getnombre() + " " + ((Trabajadorv2) trabajoslist.get(imen)).getApaterno());
    }

    public double sueldo() {
        double sueldofinal;
        sueldofinal = sueldo + (276.5 * horasextra);
        this.setSueldo(sueldofinal);
        return sueldofinal;
    }

    @Override
    public String toString() {
        return "Número de trabajador: " + numtrabajador + ", horasextra: " + horasextra + ", a\u00f1o de ingreso=" + añoingreso + ", nombre=" + nombre + ", apellido Apaterno: " + Apaterno + ", apellido Amaterno: " + Amaterno + ", sueldo: " + sueldo;
    }

}
