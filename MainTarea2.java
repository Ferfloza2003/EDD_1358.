package TareasED;

public class MainTarea2 {

    /**
     * Author Fernando
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("ArregloADT Tarea 2");
        ArregloADT arregloADT = new ArregloADT(5);
        System.out.println("el tamaño del arreglo es: ");
        System.out.println(arregloADT.gettamanio());
        arregloADT.setelemento(0, "Este es un");
        arregloADT.setelemento(1, "Arreglo");
        arregloADT.setelemento(2, "Mejorado");
        arregloADT.setelemento(3, "Con");
        arregloADT.setelemento(4, "Objetos");
        System.out.println("invocando al método to string:");
        System.out.println(arregloADT.toString());
        System.out.println("imprimiendo la casilla 4");
        System.out.println(arregloADT.getelemento(4));
        System.out.println("vaciando el arreglo");
        arregloADT.limpiar();
        System.out.println("imprimiendo arreglo vacío");
        System.out.println(arregloADT.toString());


    
        
    }
}
