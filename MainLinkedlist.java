package TareasED;

/**
 *
 * @author Fernando
 */


import java.util.*;
public class MainLinkedlist {
public static void main(String args[]) {

LinkedList<String> lista = new LinkedList<String>();

//llenando la lista
lista.add("Item1");
lista.add("Item5");
lista.add("Item3");
lista.add("Item6");
lista.add("Item2");
//imprimiendo lista
System.out.println("lista ligada: " +lista);

//agregando al prinicipio y final de la lista
lista.addFirst("Primer item");
lista.addLast("Último item");
System.out.println("LinkedList despues de agrar items: " +lista);
//tamaño
System.out.println("tamaño de lista: " + lista.size() );
//buscando un elemento
if (lista.contains("Item random")){
    
System.out.println("El Item random está en la lista");
}else{
System.out.println("El Item random no está en la lista");
}
/*Obtención y recuperacion de items*/
Object item = lista.get(0);
System.out.println("Primer item: " +item);
lista.set(0, "cambiando por el primero");
Object item2 = lista.get(0);
System.out.println("Primer item despues de actualizar : " + item2);

//borrando en primer y último índice
lista.removeFirst();
lista.removeLast();
System.out.println("LinkedList despues de borrae el primer y último item: " +lista);

//eliminando con un índice
lista.add(0, "Nuevo item");
lista.remove(2);
System.out.println("lista: " +lista); 
//posición de un item
System.out.println("posición del Item 2");
lista.indexOf("Item2");
lista.set(4, "item nuevo");
    System.out.println("lista actualizada");
    System.out.println(lista);
lista.removeAll(lista);
    System.out.println("lista vaciada");
    lista.add(0, "casi vacía");
    System.out.println(lista.toString());
}

}