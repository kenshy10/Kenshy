package basura2;
	 /**
    2  * Esta clase comprueba que el usuario introduce un email correcto.
    3  *
    4  * @author Kenshy Salinas - EjM5
    5  * @version 06.03.2018
    6  * @since 1.0
       * @see <a href = "" /> EjercicioM5Java </a>
       */	  
import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
	public class basura2 {
		 /**
	 17    * @param String 
	       */	
		public static void main(String[] arg	) {
			// TODO Auto-generated method stub
			mail();	
		} 
		private static void mail() {
			// TODO Auto-generated method stub
			
			int arroba=0;
			   boolean bandera=false;
		        String mail = JOptionPane.showInputDialog("Introduce mail");
				for( int i=0; i<mail.length();i++) {
					
					if(mail.length() <7 && mail.length() <= 0 && mail.chars() != null) {
						System.out.println("No valido");
						System.exit(0);
					}
					if(mail.charAt(i)=='@' ) {	
						arroba++;
						
						}
					if (mail.charAt(i)=='.') {
						bandera=true;
					}
				}
				
		        if(arroba==1 && bandera==true) {
		        	System.out.println("L’ e-mail introduït és vàlid");
		        }
		        else {
		        	System.out.println("L’ e-mail introduït no és vàlid");
		        }
			}

		 /** Object para casos de prueba
	 17    * @param String string
	       */	


		public static Object mail(String string) {
			// TODO Auto-generated method stub
			return null;
		}
		}

