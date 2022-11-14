
package TareasED;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Fernando
 */
public class MainCola{

static int n=0,elemento=0;
 
 public static void main(String[] args)throws Exception {
  Cola k=new Cola();
  BufferedReader b=new BufferedReader
    (new InputStreamReader(System.in));
 
  
  do{
   System.out.println("1. Ingresar elementos");
   System.out.println("2. Eliminar elementos");// CONTROLAR Q SI ELIMINA SE PERCATE DE Q NO ESTE VACIA 
   System.out.println("3. Ver si la cola esta vacia");
   System.out.println("4. Ver el frente de la cola");// SI NO HAY ELEMENTOS QUE DESPLIGUE UN MENSAJE Q NO HAY ELEMENTOS
   System.out.println("5. Borrar");
   System.out.println("6. Ver si la cola esta  llena");
   System.out.println("7. SALIR");
   n=Integer.parseInt(b.readLine());
   if(n==1){
    if(k.ColaLlena()){
     System.out.println("cola llena");
    }else
    System.err.print("ingrese un elemento");
    elemento=Integer.parseInt(b.readLine());
    k.insertarQ(elemento);
   }
   if(n==2){
    if(k.ColaVacia()){
     System.err.println("si la cola està vacìa, no hay nada què eliminar");
    }else
    System.out.println(k.eliminarQ());
   }
   if(n==3){
    if(k.ColaVacia()){
     System.out.println("la cola està vacìa");
    }else
     System.out.println("la cola no està vacìa ");
   }
   if(n==4){
    if(k.ColaVacia()){
     System.err.println("no hay siguiente elemento, la cola està vacìa");
    }else
    System.out.println("el elemento siguiente es: "+k.frenteQ());
    
   }
   if(n==5){
    k.BorrarQ();
    
   }
   if(n==6){
    k.ColaLlena();
    if(k.ColaLlena()){
     System.out.println("la cola està llena");
    }else
     System.out.println("la cola no està llena");
   }
   if(n==7){
    System.exit(0);
   }
   
   
   
  }while(n!=7);
  
  
  
 }

}
    

