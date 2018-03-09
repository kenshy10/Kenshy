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
		public class Basura {
			public static void main(String[] arg	) {
				// TODO Auto-generated method stub
				/**
			    20      * @param Pattern: a restrict li donem un valor null
				21      * @param restrict són els caràcters generals que poden ser utilitzats per introduïr un e-mail.
				18      */
				
				Pattern restrict = null;
				restrict  = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})");
                                     		
		/**
	    17      * Constructor.
		33      * @param int arroba: 0.
		34      * @param boolean bandera: se initzialitza en false.
		35      * @String De nom mail, mostrara una pantalla (JOptionPane)per demanar a l'usuari introduir un valor per teclat    
        38        * @param if: si la longitud del mail no supera els 7 caràcter(mínim), si es menor que 0 o si no hi ha res, surt del programa.	
		47      * @return true si el valor introduït per teclat conté un arroba i un punt.
		47      * @return false si el valor introduït per teclat no conté un arroba o un punt.
		31      */
				 
			   int arroba=0;
			   boolean bandera=false;
		        String mail = JOptionPane.showInputDialog("Introduce mail");
				for( int i=0; i<mail.length();i++) {
					
					if(mail.length() <7 && mail.length() <= 0 && mail.chars() != null) {
						System.out.println("No valido");
						System.exit(0);
					}
					if(mail.charAt(i)=='@') {	
						arroba++;
						
						}
					if (mail.charAt(i)=='.') {
						bandera=true;
					}
				}
				/**
			    51      * Constructor.
				57      * @param if: comproba el contador i comproba la bandera, si es compleixen "Es correcte"
				60      * @param else: comprova si les condicions del paràmetre if es compleixen, si no, retorna "No es correcte"
				54      */		
				
				
		        if(arroba==1 && bandera==true) {
		        	System.out.println("L’ e-mail introduït és vàlid");
		        }
		        else {
		        	System.out.println("L’ e-mail introduït no és vàlid");
		        }
			}

}
