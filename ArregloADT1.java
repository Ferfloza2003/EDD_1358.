package TareasED;
import java.util.Arrays;
/**
 *
 * @author Fernando
 */
public class ArregloADT1 {
    int tamanio;
    Object lista[] = new Object[tamanio];
        
    
    public ArregloADT1(int tamanio){
    this.tamanio = tamanio;
    
    }
    
    public int gettamanio() {       
        return tamanio;
    }
    
    public void setelemento(int índice, Object item) {
        lista[índice] = item;        
    }
    
    public Object getelemento(int índice) {
        return lista[índice];        
    }
    
    public void limpiar(){
    for (int i = 0; i < tamanio; i++) {
            lista[i] = null;      
        }
    }
    @Override
    public String toString(){
    return Arrays.toString(lista);
    }
}
