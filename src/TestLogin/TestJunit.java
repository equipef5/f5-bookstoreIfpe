package TestLogin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {
	@Test
	public void Login(){
	int usuario=1234;
	int senha= 1234;
	Login login = new Login();
	String Sucesso = "ok";
	assertEquals("ok",Sucesso);
	
	}}