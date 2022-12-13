
package TareasED;

import java.util.Stack;

/**
 *
 * @author Fernando
 */
public class MainStack {
    public static void main(String[] args) {
        
    Stack<String> pila= new Stack<>();
   

        // añadir
        pila.push("Juan");
        pila.push("caballo");
        pila.push("Pegamento");
        pila.push("Avión");
        pila.push("Servilleta");
        pila.push("Camión");
        pila.push("Goma");
        //to string
        System.out.println("imprimiendo pila: " + pila);

        // eliminar
        String item = pila.pop();
        System.out.println("item eliminado: " + item);
        System.out.println("capacidad: " + pila.capacity());
      
        //peek
        System.out.println("operación peek");
        System.out.println(pila.peek());
        //buscar
        if (pila.contains("caballo")) {
            System.out.println("la pila contiene \"caballo\" ");
            
        }else{
        System.out.println("la pila no contiene \"caballo\" ");
        }
            //más operaciones
        System.out.println("primer item");
        System.out.println(pila.firstElement());
        System.out.println("último item");
        System.out.println(pila.lastElement());
        System.out.println(pila.toString());
        pila.clear();
        if (pila.isEmpty()) {
            System.out.println("la lista está vacía");
        }
        
}
    
}
