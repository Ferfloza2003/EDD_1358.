
package Unidad;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class TrabajadorADT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] MATRIZ = CONVERTIR("C:/Users/Fer/Downloads/junio.dat");

        if (MATRIZ != null) { 

            System.out.println("Archivo leído");

            for (int fil = 0; fil < MATRIZ[fil].length; fil++) {

                if (MATRIZ[fil][0] != null) { 
                    for (int colnm = 0; colnm < MATRIZ[colnm].length; colnm++) {
                        System.out.print(MATRIZ[fil][colnm] + " ");

                    }

                    System.out.println();

                }

            }

        } else {

            System.out.println("Error");
        }
        ArrayList<Trabajadorv2> Trabajadores = new ArrayList();
        Object object = new Object();
        for (int i = 1; i < MATRIZ.length; i++) {
            if (MATRIZ[i][0]==null) {
break;                
            }

            Trabajadores.add(new Trabajadorv2(Integer.parseInt(MATRIZ[i][0]), MATRIZ[i][1], MATRIZ[i][2], MATRIZ[i][3], Integer.parseInt(MATRIZ[i][4]), Double.parseDouble(MATRIZ[i][5]), Integer.parseInt(MATRIZ[i][6])));      
            
        }
        System.out.println("\n\n\n\n");
        System.out.println("salarios");
        for (Trabajadorv2 item: Trabajadores) {
            System.out.println(item);
}
        System.out.println("\n\n\n\n");
        System.out.println("");
        System.out.println("");
        System.out.println("salarios actualizados  con horas extra");
        for (Trabajadorv2 item: Trabajadores) {
            ((Trabajadorv2)item).sueldo();
            System.out.println(item);
}
Trabajadorv2.AntiguoYReciente(Trabajadores);
        System.out.println("\n\n\n\n");
System.out.println("bonificación");
        for (Trabajadorv2 item: Trabajadores) {
          
            System.out.println(item);
}
    }

    private static String[][] CONVERTIR(String rutaCSV) {

        try {

            Scanner lector = new Scanner(new File(rutaCSV));

            String[][] matriz = new String[110][100];

            int fil = 0;

            String linea = lector.nextLine();

            while (lector.hasNextLine()) {

                if (matriz[fil].toString().endsWith(",")) {
                    fil++;
                } else {
                    matriz[fil] = linea.split(","); 

                }

                fil++; 

                linea = lector.nextLine(); 
            }

            matriz[fil] = linea.split(",");
            lector.close();

            return matriz;

        } catch (FileNotFoundException e) {

            System.out.println("No se encuentra : " + rutaCSV);

            return null;

        }

    }

}
