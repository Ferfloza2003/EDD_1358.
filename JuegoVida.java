
package TareasED;
import java.util.Scanner;
public class JuegoVida
{
   private Tablero1 Tablero1;
   private byte[][] aux_Tablero1;
   private Scanner sc_key;
   
   public JuegoVida(){
       this.Tablero1       = new Tablero1();
       this.aux_Tablero1   = new byte[Config.alto][Config.ancho];
       this.sc_key      = new Scanner(System.in);
       this.print_banner();
       this.set_Tablero1_user();
       this.generaciones();
   }
   
   private void print_banner(){
       System.out.println("bienvenidos al juego de la vida");
       System.out.println("para configurar el juego, modifique el archivo Config.java, ahora introduzca una configuración de casillas");
       System.out.println("\t\tAlgunos ejemplos:\n\t\t2 3\n\t\t0 0\n");
       System.out.println("para terminar, inserte una configuración inválida como: -1 -1 :)");
       System.out.println("presione una tecla cualquiera");
       this.sc_key.nextLine();
       this.clear_window();
    }  
   
   private void set_Tablero1_user(){
       int x,y = 0;
       boolean flag = false;
       do{
           System.out.println("Configuración actual: "); this.Tablero1.estadoactual();
           System.out.println("\n\nCoordenadas:\t");
           x = this.sc_key.nextInt();
           y = this.sc_key.nextInt();
           flag = x>=0 && x<=Config.alto && y>=0 && y<=Config.ancho;
           if(flag) this.Tablero1.set_coords(x,y,(byte)1);
       }while(flag);
   }
       
   private void generaciones(){
       int numcelvivas = 0;
       this.Tablero1.estadoactual();
       while(true){
           try{ Thread.sleep(Config.ciclos); }
           catch(InterruptedException e){}
           finally{
               for(int x=0;x<Config.alto;x++){
                   for(int y=0;y<Config.ancho;y++){
                       numcelvivas = Tablero1.numcelvivas(x,y);
                       if(this.Tablero1.get_coords(x,y)==1){
                           if(numcelvivas>=Config.celvivs0 && numcelvivas<=Config.celvivs1){ aux_Tablero1[x][y] = (byte)1;}
                           else if(numcelvivas<Config.celvivs0 || numcelvivas>Config.celvivs1){ aux_Tablero1[x][y] = (byte)0;}
                           }
                   else if(numcelvivas==Config.celvivs2){ aux_Tablero1[x][y] = (byte)1;} 
                   }             
               }
           }
           if(this.check_break_flag()) break;
           this.copy_Tablero1s();
           this.clear_window();
           this.Tablero1.estadoactual();                  
       }
    }
    
   private boolean check_break_flag(){
       for(int i=0;i<Config.alto;i++) for(int j=0;j<Config.ancho;j++) if(this.aux_Tablero1[i][j]!=this.Tablero1.get_coords(i,j)) return false;
       return true;
   }
   
   private void copy_Tablero1s(){ for(int i=0;i<Config.alto;i++) for(int j=0;j<Config.ancho;j++) this.Tablero1.set_coords(i,j,this.aux_Tablero1[i][j]); }
   
   private void clear_window(){for(int i=0;i<50;++i,System.out.println());}
   
   
   public static void main(String args[]){
       
       
       
       JuegoVida juego = new JuegoVida();
      
   }

}