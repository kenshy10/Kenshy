package basura;

import static org.junit.Assert.*;

import org.junit.Test;

public class Emailtest2 {

	@Test
	public void test() {
		
		assertEquals(true, basura.mail("pepito@hotmail.com"));
		assertEquals(true, basura.mail("pepito_101@hotmail.com"));
		assertEquals(true, basura.mail("pepito10@hotmail.com"));
		assertEquals(true, basura.mail("100pepito@hotmail.com"));
		assertEquals(true, basura.mail("pepito_1_1@hotmail.com"));
		assertEquals(true, basura.mail("pepito23123@hotmail.com"));
		assertEquals(true, basura.mail("guauguau@gmail.com.com"));
		assertEquals(true, basura.mail("guauguau@outlook.com"));
		assertEquals(true, basura.mail("guauguau.100@outlook.com.au"));
		assertEquals(true, basura.mail("emailProviderText"));
		assertEquals(true, basura.mail("101@yahoo.co"));
		assertEquals(false, basura.mail("guauguau"));
		assertEquals(false, basura.mail("guauguau@.com.com"));
		assertEquals(false, basura.mail("guauguau101@.com"));
		assertEquals(false, basura.mail("guauguau101@gmail.a"));
		assertEquals(false, basura.mail(".guauguau@yahoo.com"));
		assertEquals(false, basura.mail("guauguau@%*.com"));
		assertEquals(false, basura.mail("guauguau@gmail.com.com"));
		assertEquals(false, basura.mail("guauguau@outlook@outlook.com"));
		assertEquals(false, basura.mail("guauguau..101@gmail.com"));
		assertEquals(false, basura.mail("guauguau@outlook@outlook.com"));
		assertEquals(false, basura.mail("guauguau@gmail.com.a5"));
		

		
		}
	}


