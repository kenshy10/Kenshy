package basura2;
import org.junit.BeforeClass;
import org.junit.Test;
 
public class Emailtest {
 
    private static String[] validEmails, invalidEmails;
 
    /**
     * AQUEST SON ELS CASOS DE PROVES.
     */
    @BeforeClass
    public static void emailProviderText() {
        validEmails = new String[] { "guauguau@hotmail.com",
                "guauguau-101@hotmail.com", "guauguau.101@hotmail.com",
                "guauguau101@hotmail.com", "guauguau_101@hotmail.com",
                "guauguau-101@hotmail.net", "guauguau.100@hotmail.com.au", "guauguau@e.com",
                "guauguau@1.com", "guauguau@ehotmail.com.com", "guauguau+101@example.com",
                "101@hotmail.com", "guauguau-101@example-guauguau.com", "guauguau@gmail.com",
                "guauguau-101@gmail.com", "guauguau.101@gmail.com",
                "guauguau101@gmail.com", "guauguau_101@gyahoo.com",
                "guauguau-101@gmail.net", "guauguau.100@gmail.com.au", "guauguau@e.com",
                "guauguau@1.com", "guauguau@gmail.com.com", "guauguau+101@outlook.com",
                "101@yahoo.com", "guauguau@outlook.com",
                "guauguau-101@yahoo.com", "guauguau.101@yahoo.com",
                "guauguau101@outlook", "guauguau_101@yahoo.com",
                "guauguau-101@outlook.net", "guauguau.100@outlook.com.au", "guauguau@e.com",
                "guauguau@1.com", "guauguau@yahoo.com.com", "guauguau+101@outlook.com",
                "101@yahoo.com", };
 
        invalidEmails = new String[] { "guauguau", "guauguau@.com.com",
                "guauguau101@gmail.a", "guauguau101@.com", ".guauguau@yahoo.com",
                "guauguau**()@gmail.com", "guauguau@%*.com",
                "guauguau..101@gmail.com", "guauguau.@outlook.com",
                "test@guauguaue_101.com", "guauguau@outlook@outlook.com",
                "guauguau@gmail.com.a5" };
    }
 
    /**
     * Para validar una matrix de emails vàlidos
     */
    @Test
    public void validEmailTest() {
 
        for (String temp : validEmails) {
 
            // Verificar si el correo electrónico es válido usando nuestro método.
            boolean valid = ValidatorUtil.validateEmail(temp);
            System.out.println("Email is valid : " + temp + " , " + valid);
 
            // Todos los correos electrónicos de esta prueba deben ser válidos.
            Assert.assertEquals(valid, true);
        }
 
    }
 
    /**
     * Para validar una matrix de emails vàlidos
     */
    @Test
    public void invalidEmailTest() {
 
        for (String temp : invalidEmails) {
 
            // Verificar si el correo electrónico es válido usando nuestro método.
        	
            boolean valid = ValidatorUtil.validateEmail(temp);
            System.out.println("Email is valid : " + temp + " , " + valid);
 
            // Todos los correos electrónicos de esta prueba deben ser inválidos.
            Assert.assertEquals(valid, false);
        }
 
    }
 
}