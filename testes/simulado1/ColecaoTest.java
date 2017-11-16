package simulado1;

import static org.junit.Assert.*;

import org.junit.*;

public class ColecaoTest {

	Colecao colecaoValida = new Colecao(2, "Primeira temporada X");
	Bluray a = new Bluray("Narcos ep. 1", 10);
	Bluray b = new Bluray("Narcos ep. 2", 20);
	Bluray c = new Bluray("Narcos ep. 3", 30);
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testColecaoSemBlurays() {
		new Colecao(0, "Primeira temporada X");
	}
	@Test(expected=IllegalArgumentException.class)
	public void testColecaoSemNome() {
		new Colecao(10, null);
	}
	@Test(expected=NullPointerException.class)
	public void testAdicionaBluray() {
		colecaoValida.adicionaBluray(a);
		colecaoValida.adicionaBluray(b);
		colecaoValida.adicionaBluray(c);
	}
	@Test
	public void testDuracaoTotal() {
		colecaoValida.adicionaBluray(a);
		colecaoValida.adicionaBluray(b);
		String msg = "Esperando obter duração de 30.";
		assertEquals(msg, 30, colecaoValida.duracaoTotal());
	}
	@Test
	public void testListaBluray() {
		colecaoValida.adicionaBluray(a);
		colecaoValida.adicionaBluray(c);
		String msg = "Esperando obter a representação em String do Narcos ep. 3";
		assertEquals(msg, c.toString(), colecaoValida.listaBluray("Narcos ep. 3")); 
	}
	@Test
	public void testPopularidade1() {
		for(int i = 0; i < 10; i++) {
			colecaoValida.incrementaPopularidade();
		}
		String msg = "Testa popularidade.";
		assertEquals(msg, "POUCO POPULAR", colecaoValida.getPopularidade());
	}
	@Test
	public void testPopularidade2() {
		for(int i = 0; i < 30; i++) {
			colecaoValida.incrementaPopularidade();
		}
		String msg = "Testa popularidade.";
		assertEquals(msg, "POPULAR", colecaoValida.getPopularidade());
	}
	@Test
	public void testPopularidade3() {
		for(int i = 0; i < 31; i++) {
			colecaoValida.incrementaPopularidade();
		}
		String msg = "Testa popularidade.";
		assertEquals(msg, "MUITO POPULAR", colecaoValida.getPopularidade());
		
	}
}
