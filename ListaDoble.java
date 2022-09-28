
package TareasED;
public class ListaDoble<T> {

    Nodoble<T> head;
    int rozmiar;

    public ListaDoble() {
        this.head = null;
        this.rozmiar = 0;
    }

    public boolean estaVacia() {
        return this.head == null;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void agregarAlFinal(T valor) {
        Nodoble<T> Nuevo = new Nodoble(valor);
        if (this.estaVacia()) {
            this.head = Nuevo;
        } else {
            Nodoble<T> Aux = this.head;
            while (Aux.getSig() != null) {
                Aux = Aux.getSig();
                Nuevo.setant(Aux);
            }
            Aux.setSig(Nuevo);
 Aux = null;
            Nuevo = null;
        }
    }

    public void agregarAlInicio(T valor) {
        Nodoble<T> Aux = new Nodoble(valor);
        if (this.estaVacia()) {
            this.head = Aux;
        } else {
            Aux.setSig(head);
            head = Aux;
        }
    }

    public void agregarDespuesDe(int posición, T valor) {
        Nodoble Aux = new Nodoble(valor);
        Nodoble Tem = this.head;
        for (int contador = 1; contador <= posición - 1; contador++) {
            Tem = Tem.getSig();
        }
        Aux.setSig(Tem.getSig());
        Tem.setSig(Aux);
        Tem.setant(Tem.getant());
    }

    public void eliminar(int posición) {
        Nodoble Aux = head;
        if (this.estaVacia()) {
            System.out.println("Lista vacia, llénala primero alcornoque");
        } else {
            if (posición > head.toString().length()) {
                System.out.println("La posición introducida no existe en esta lista, alcornoque");
            } else {
                for (int contador = 1; contador < posición - 1; contador++) {
                    Aux = Aux.getSig();
                }
            }
        }

        Aux.setSig(Aux.getSig().getSig());
        Aux.setant(Aux.getant());
    }

    public void eliminarElPrimero() {
        Nodoble Aux = head;
        if (this.estaVacia()) {
            head = Aux;
        } else {
            head = Aux.getSig();
        }
    }

    public void eliminarElFinal() {
        Nodoble Aux = head;
        if (this.estaVacia()) {
            head = Aux;
        } else {
            while (Aux.getSig().getSig() != null) {
                Aux = Aux.getSig();
            }
            Aux.setSig(null);
        }
    }

    public int buscarValor(T valor) {
        Nodoble Aux = head;
        int posición = 1;
       
            while (Aux.getDato() != valor) {
                
                Aux = Aux.getSig();
                posición++;
                if (Aux ==null) {
                System.out.println("no pudimos encontrar el valor");
                return 0;
              
               
            }
                
            }
            System.out.println("encontramos el valor en la posición");
        return posición;
        
    }

   public void actualizarValor(T valor, T actualizado) {
        Nodoble Aux = head;
      Aux = head;
        while (Aux.getDato() != valor) {
         
        System.out.println(Aux);
             Aux = Aux.getSig();
            if (Aux ==null) {
                System.out.println("no pudimos encontrar el valor para actualizar");
                break;
               
            }
           
        }
         if (Aux ==null) {
    
            }else
        if(Aux.getDato() == valor){
            Aux.setDato(actualizado);
        System.out.println("dato actualizado");
            }
        
    }

    public void transversal() {
        Nodoble nodo_actual = this.head;
        while (nodo_actual != null) {
            System.out.print(nodo_actual);
            nodo_actual = nodo_actual.getSig();
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        ListaDoble head = new ListaDoble();
        head.agregarAlInicio(3);
        head.agregarAlFinal(184);
        head.agregarAlFinal(34);
        head.agregarAlFinal(381);
        head.agregarAlFinal(2837);
        head.agregarAlFinal(52);
        head.transversal();
        head.actualizarValor(52, 1818);
        head.eliminarElFinal();
        head.transversal();
        head.eliminarElPrimero();
        System.out.println("nueva lista doble");
        head.transversal();
        head.eliminar(3);
        System.out.println("nueva lista doble:");
        head.transversal();
        head.agregarDespuesDe(2, 145);
        System.out.println("nueva lista doble:");
        head.transversal();
        head.agregarAlFinal(12);
        head.agregarAlInicio(56);
        System.out.println("nueva lista doble:");
        head.transversal();
        System.out.println(head.buscarValor(34));
    }

}