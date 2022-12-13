package TareasED;

/**
 *
 * @author Fernando
 */
import java.util.*;

public class MainArraylist {

public static void main(String args[]) {
//Crea un lista
ArrayList<String> list = new ArrayList<String>();           

// Agrega items a la lista
list.add("item1");
list.add("item2");
list.add(2, "item3"); // agrega el item3 en la posición 2
list.add("item4");

// usando el to string
System.out.println("La lista tiene los siguientes items: " + list);

// usando iterator
Iterator<String> itr=list.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}

//limpiando el arraylist
list.clear();
System.out.println("La lista tiene los siguientes items despues de clear(): " + list);

//llenando la lista
list.add("item1");
list.add("item2");
list.add("item4");
//añadiendo en posición específica
list.add(2, "item3");
list.add("item2");

// El último indice de un item
int ultimo = list.lastIndexOf("item2");
System.out.println("El valor índice item2 es: " + ultimo);

// Se clona el objeto list 
Object listClone = list.clone();        
System.out.println("Objeto clonado: " + listClone);

// Verifica si el arreglo está vacío
boolean check = list.isEmpty();
System.out.println("¿Está vacío el array: " + check);

//Obtiene el indice de un item
int pos = list.indexOf("item2");
System.out.println("El índice del item2 es: " + pos);


// buscando un ite,
boolean element = list.contains("item5");
System.out.println("Checa si un item esta en la list item5: " + element);

// Obtener un item con un índice
String item = list.get(0);
System.out.println("El item en el índice 0 es: " + item);


// Reemplazando un item

// Borrando el item 0
list.remove(0);

// Borraando el item3
list.remove("item3");
// Borrando el índice 2
list.remove(2);


System.out.println("El arraylist tiene los siguintes items: " + list);
    System.out.println("el tamaño del arraylist es");
    System.out.println(list.size());
}

}