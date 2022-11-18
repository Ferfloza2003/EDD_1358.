
package TareasED;

/**
 *
 * @author Fernando
 */
public class NodO {
    String dato;
	int posicion;
	NodO siguiente;
	
	
	public NodO(){}
	
	public NodO(int posicion){
		 siguiente=null;
		 this.dato=" ";
		 this.posicion=posicion;
	}
	public NodO (String dato, int posicion)
	    {
	       siguiente=null;	
		   this.dato=dato;
		   this.posicion=posicion;
		}
		
	
	public NodO(String dato,int posicion, NodO sigue)
		{
		  this.dato=dato;
		  this.posicion=posicion;
		  this.siguiente=sigue;
		}
		
		  	
	public String Obtener_Cadena()
		{
			return dato;
		}
		
	public int Obtener_Posicion()
		{
			return posicion;
		}	
			
}
