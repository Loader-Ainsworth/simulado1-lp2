package simulado1;

import static org.junit.Assert.*;

import org.junit.*;

public class BlurayTest {
	
	Bluray blurayValido = new Bluray("A volta dos que nao foram", 90);
	
	@Test(expected=IllegalArgumentException.class)
	public void testBlurayNomeInvalido() {
        Bluray blurayInvalido = new Bluray("", 90);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testBlurayDuracaoInvalida() {
        Bluray blurayInvalido = new Bluray("A volta dos que nao foram", -60);
	}
	@Test
	public void testPopularidade1() {
		for(int i = 0; i < 10; i++) {
			blurayValido.incrementaPopularidade();
		}
		String msg = "Testa popularidade.";
		assertEquals(msg, "POUCO POPULAR", blurayValido.getPopularidade());
	}
	@Test
	public void testPopularidade2() {
		for(int i = 0; i < 30; i++) {
			blurayValido.incrementaPopularidade();
		}
		String msg = "Testa popularidade.";
		assertEquals(msg, "POPULAR", blurayValido.getPopularidade());
	}
	@Test
	public void testPopularidade3() {
		for(int i = 0; i < 31; i++) {
			blurayValido.incrementaPopularidade();
		}
		String msg = "Testa popularidade.";
		assertEquals(msg, "MUITO POPULAR", blurayValido.getPopularidade());
		
	}
}
