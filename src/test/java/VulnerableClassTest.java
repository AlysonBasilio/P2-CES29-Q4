
import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

public class VulnerableClassTest {

	@Test(expected = InvalidParameterException.class)
	public void testNomeDoArquivoInvalido1() {
		VulnerableClass v = new VulnerableClass();
		v.vulnerableMethod("","R");
	}
	
	@Test(expected = InvalidParameterException.class)
	public void testNomeDoArquivoInvalido2() {
		VulnerableClass v = new VulnerableClass();
		v.vulnerableMethod("","W","");
	}
	
	@Test(expected = InvalidParameterException.class)
	public void testNomeDoArquivoValidoMasComandoInvalido1() {
		VulnerableClass v = new VulnerableClass();
		v.vulnerableMethod("teste.txt","ASDFASDFR");
	}
	
	@Test(expected = InvalidParameterException.class)
	public void testNomeDoArquivoValidoMasComandoInvalido2() {
		VulnerableClass v = new VulnerableClass();
		v.vulnerableMethod("teste.txt","ASDFASDFR","");
	}
	
	@Test
	public void testEscritaELeitura() {
		VulnerableClass v = new VulnerableClass();
		v.vulnerableMethod("teste.txt","W","Hello World!");
		assertEquals("Hello World!",v.vulnerableMethod("teste.txt", "R"));
	}
	

}
