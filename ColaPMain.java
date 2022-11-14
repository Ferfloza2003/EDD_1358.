/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TareasED;

/**
 *
 * @author Fernando
 */
public class ColaPMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ColaPrioridad colaPrioridad = new ColaPrioridad();
        System.out.println("jerarquía de la iglesia en una cola de prioridad");
        colaPrioridad.inserta("El papa", 1);
        colaPrioridad.inserta("un sacerdote", 2);
        colaPrioridad.inserta("Jesucristo", 0);
        colaPrioridad.inserta("un no creyente", 4);
        colaPrioridad.inserta("un creyente", 3);


        System.out.println(colaPrioridad);
        
    }
    
}
