
package tareasED;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Fernando
 */
public class ContadorPalabras{

	public static void main(String[] args) {
		
		int contador = 0;
                char letractual;
                        int contador_a= 0;
                        int contador_b= 0;
                        int contador_c= 0;
                        int contador_d= 0;
                        int contador_e= 0;
                        int contador_f= 0;
                        int contador_g= 0;
                        int contador_h= 0;
                        int contador_i= 0;
                        int contador_j= 0;
                        int contador_k= 0;
                        int contador_l= 0;
                        int contador_m= 0;
                        int contador_n= 0;
                        int contador_o= 0;
                        int contador_p= 0;
                        int contador_q= 0;
                        int contador_r= 0;
                        int contador_s= 0;
                        int contador_t= 0;
                        int contador_u= 0;
                        int contador_v= 0;
                        int contador_w= 0;
                        int contador_x= 0;
                        int contador_y= 0;
                        int contador_z= 0;
                        //mayúsculas
                        int contador_A= 0;
                        int contador_B= 0;
                        int contador_C= 0;
                        int contador_D= 0;
                        int contador_E= 0;
                        int contador_F= 0;
                        int contador_G= 0;
                        int contador_H= 0;
                        int contador_I= 0;
                        int contador_J= 0;
                        int contador_K= 0;
                        int contador_L= 0;
                        int contador_M= 0;
                        int contador_N= 0;
                        int contador_O= 0;
                        int contador_P= 0;
                        int contador_Q= 0;
                        int contador_R= 0;
                        int contador_S= 0;
                        int contador_T= 0;
                        int contador_U= 0;
                        int contador_V= 0;
                        int contador_W= 0;
                        int contador_X= 0;
                        int contador_Y= 0;
                        int contador_Z= 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/laloe/Downloads/el_quijote.txt"));

			System.out.println("TEXTO LEIDO");
			System.out.println("----- -----\n");
			

			String linea = br.readLine();
			while (linea != null) {
System.out.println(linea);
                                for (int contadorlínea = 0; contadorlínea < linea.length(); contadorlínea++) {
                     
                                letractual = linea.charAt(contadorlínea);

                                    if (letractual == 'a') {
                                        contador_a++;     
                                        continue;
                                    }
                                    if (letractual == 'b') {
                                        contador_b++;     
                                        continue;
                                    }
                                    if (letractual == 'c') {
                                        contador_c++;     
                                        continue;
                                    }
                                    if (letractual == 'd') {
                                        contador_d++;     
                                        continue;
                                    }
                                    if (letractual == 'e') {
                                        contador_e++;
                                        continue;
                                    }
                                    if (letractual == 'f') {
                                        contador_f++;  
                                        continue;
                                    }
                                    if (letractual == 'g') {
                                        contador_g++;   
                                        continue;
                                    }
                                    if (letractual == 'h') {
                                        contador_h++;  
                                        continue;
                                    }
                                    if (letractual == 'i') {
                                        contador_i++;  
                                        continue;
                                    }
                                    if (letractual == 'j') {
                                        contador_j++;  
                                        continue;
                                    }
                                    if (letractual == 'k') {
                                        contador_k++;
                                        continue;
                                    }
                                    if (letractual == 'l') {
                                        contador_l++;    
                                        continue;
                                    }
                                    if (letractual == 'm') {
                                        contador_m++;  
                                        continue;
                                    }
                                    if (letractual == 'n') {
                                        contador_n++;    
                                        continue;
                                    }
                                    if (letractual == 'o') {
                                        contador_o++;   
                                        continue;
                                    }
                                    if (letractual == 'p') {
                                        contador_p++;    
                                        continue;
                                    }
                                    if (letractual == 'q') {
                                        contador_q++;   
                                        continue;
                                    }
                                    if (letractual == 'r') {
                                        contador_r++;    
                                        continue;
                                    }
                                    if (letractual == 's') {
                                        contador_s++;   
                                        continue;
                                    }
                                    if (letractual == 't') {
                                        contador_t++;  
                                        continue;
                                    }
                                    if (letractual == 'u') {
                                        contador_u++;     
                                        continue;
                                    }
                                    if (letractual == 'v') {
                                        contador_v++;     
                                        continue;
                                    }
                                    if (letractual == 'w') {
                                        contador_w++;     
                                        continue;
                                    }
                                    if (letractual == 'x') {
                                        contador_x++;  
                                        continue;
                                    }
                                    if (letractual == 'y') {
                                        contador_y++;     
                                        continue;
                                    }
                                    if (letractual == 'z') {
                                        contador_z++;     
                                        continue;
                                    }
                                    
                                    
                                    //mayúsculas
                                    
                                     if (letractual == 'A') {
                                        contador_A++;   
                                        continue;
                                    }
                                    if (letractual == 'B') {
                                        contador_B++;     
                                        continue;
                                    }
                                    if (letractual == 'C') {
                                        contador_C++;   
                                        continue;
                                    }
                                    if (letractual == 'D') {
                                        contador_D++;  
                                        continue;
                                    }
                                    if (letractual == 'E') {
                                        contador_E++;   
                                        continue;
                                    }
                                    if (letractual == 'F') {
                                        contador_F++;   
                                        continue;
                                    }
                                    if (letractual == 'G') {
                                        contador_G++;    
                                        continue;
                                    }
                                    if (letractual == 'H') {
                                        contador_H++;  
                                        continue;
                                    }
                                    if (letractual == 'I') {
                                        contador_I++;  
                                        continue;
                                    }
                                    if (letractual == 'J') {
                                        contador_J++;  
                                        continue;
                                    }
                                    if (letractual == 'K') {
                                        contador_K++;    
                                        continue;
                                    }
                                    if (letractual == 'L') {
                                        contador_L++;  
                                        continue;
                                    }
                                    if (letractual == 'M') {
                                        contador_M++;  
                                        continue;
                                    }
                                    if (letractual == 'N') {
                                        contador_N++;    
                                        continue;
                                    }
                                    if (letractual == 'O') {
                                        contador_O++;  
                                        continue;
                                    }
                                    if (letractual == 'P') {
                                        contador_P++;   
                                        continue;
                                    }
                                    if (letractual == 'Q') {
                                        contador_Q++;   
                                        continue;
                                    }
                                    if (letractual == 'R') {
                                        contador_R++;  
                                        continue;
                                    }
                                    if (letractual == 'S') {
                                        contador_S++;  
                                        continue;
                                    }
                                    if (letractual == 'T') {
                                        contador_T++;    
                                        continue;
                                    }
                                    if (letractual == 'U') {
                                        contador_U++;  
                                        continue;
                                    }
                                    if (letractual == 'V') {
                                        contador_V++;
                                        continue;
                                    }
                                    if (letractual == 'W') {
                                        contador_W++; 
                                        continue;
                                    }
                                    if (letractual == 'X') {
                                        contador_X++; 
                                        continue;
                                    }
                                    if (letractual == 'Y') {
                                        contador_Y++;   
                                        continue;
                                    }
                                    if (letractual == 'Z') {
                                        contador_Z++;   
                                        
                                    }
                                    
                                    
				//Leemos siguiente línea
				
			}
                                linea = br.readLine();

                        }
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nPalabras contadas: " + contador);
                System.out.println("letras a contadas: " + contador_a);
                System.out.println("letras b contadas: " + contador_b);
                System.out.println("letras c contadas: " + contador_c);
                System.out.println("letras d contadas: " + contador_d);
                System.out.println("letras e contadas: " + contador_e);
                System.out.println("letras f contadas: " + contador_f);
                System.out.println("letras g contadas: " + contador_g);
                System.out.println("letras h contadas: " + contador_h);
                System.out.println("letras i contadas: " + contador_i);
                System.out.println("letras j contadas: " + contador_j);
                System.out.println("letras k contadas: " + contador_k);
                System.out.println("letras l contadas: " + contador_l);
                System.out.println("letras m contadas: " + contador_m);
                System.out.println("letras n contadas: " + contador_n);
                System.out.println("letras o contadas: " + contador_o);
                System.out.println("letras p contadas: " + contador_p);
                System.out.println("letras q contadas: " + contador_q);
                System.out.println("letras r contadas: " + contador_r);
                System.out.println("letras s contadas: " + contador_s);
                System.out.println("letras t contadas: " + contador_t);
                System.out.println("letras u contadas: " + contador_u);
                System.out.println("letras v contadas: " + contador_v);
                System.out.println("letras w contadas: " + contador_w);
                System.out.println("letras x contadas: " + contador_x);
                System.out.println("letras y contadas: " + contador_y);
                System.out.println("letras z contadas: " + contador_z);
                //mayus
                System.out.println("letras A contadas: " + contador_A);
                System.out.println("letras B contadas: " + contador_B);
                System.out.println("letras C contadas: " + contador_C);
                System.out.println("letras D contadas: " + contador_D);
                System.out.println("letras E contadas: " + contador_E);
                System.out.println("letras F contadas: " + contador_F);
                System.out.println("letras G contadas: " + contador_G);
                System.out.println("letras H contadas: " + contador_H);
                System.out.println("letras I contadas: " + contador_I);
                System.out.println("letras J contadas: " + contador_J);
                System.out.println("letras K contadas: " + contador_K);
                System.out.println("letras L contadas: " + contador_L);
                System.out.println("letras M contadas: " + contador_M);
                System.out.println("letras N contadas: " + contador_N);
                System.out.println("letras O contadas: " + contador_O);
                System.out.println("letras P contadas: " + contador_P);
                System.out.println("letras Q contadas: " + contador_Q);
                System.out.println("letras R contadas: " + contador_R);
                System.out.println("letras S contadas: " + contador_S);
                System.out.println("letras T contadas: " + contador_T);
                System.out.println("letras U contadas: " + contador_U);
                System.out.println("letras V contadas: " + contador_V);
                System.out.println("letras W contadas: " + contador_W);
                System.out.println("letras X contadas: " + contador_X);
                System.out.println("letras Y contadas: " + contador_Y);
                System.out.println("letras Z contadas: " + contador_Z);

	}

}