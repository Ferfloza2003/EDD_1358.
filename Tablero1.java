package TareasED;

public class Tablero1
{
    private byte[][] Tablero1;
    
    public Tablero1(){
        this.Tablero1 = new byte[Config.alto][Config.ancho];
    }
    
    public void set_coords(int x,int y,byte value){ 
        try{this.Tablero1[x][y] = value; }
        catch(ArrayIndexOutOfBoundsException e){ System.out.println("Not valid coords");}
    }
    public byte get_coords(int x,int y){ return this.Tablero1[x][y]; }
           
    // Receives coords of interested point
    public int numcelvivas(int x,int y){
        int cont = 0;
        try{ if(this.Tablero1[x-1][y-1]==1) cont++; }
        catch(Exception e){}
        try{ if(this.Tablero1[x+1][y-1]==1) cont++; }
        catch(Exception e){}
        try{ if(this.Tablero1[x-1][y]==1) cont++; }
        catch(Exception e){}
        try{ if(this.Tablero1[x+1][y]==1) cont++; }
        catch(Exception e){}
        try{ if(this.Tablero1[x][y-1]==1) cont++; }
        catch(Exception e){}
        try{ if(this.Tablero1[x][y+1]==1) cont++; }
        catch(Exception e){}
        try{ if(this.Tablero1[x+1][y+1]==1) cont++; }
        catch(Exception e){}
        try{ if(this.Tablero1[x-1][y+1]==1) cont++; }
        catch(Exception e){}
        return cont;
    }
    
    public void estadoactual(){
        for(int x=0;x<Config.alto;x++){
            for(int y=0;y<Config.ancho;y++){
                if(this.Tablero1[x][y]==1) System.out.print("*");
                else System.out.print("0");
            }
            System.out.println();
        }
    }    
}