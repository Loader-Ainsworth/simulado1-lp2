package simulado1;

public class Colecao {

	private Bluray[] listaDeBlurays;
	private String titulo;
	private int popularidade;
	private int qtdEpisodios;
	 
	public Colecao(int numDeBlurays, String titulo) {
		if(numDeBlurays <= 0) {
			throw new IllegalArgumentException("A quantidade de Blu-Rays deve ser maior que zero.");
		}
		if(titulo == null || titulo.equals("")) {
			throw new IllegalArgumentException("Título inválido.");
		}
		this.listaDeBlurays = new Bluray[numDeBlurays];
		this.titulo = titulo;
	}
	public void adicionaBluray(Bluray bd) {
		if(this.qtdEpisodios >= this.listaDeBlurays.length) {
			throw new NullPointerException("Não é possível adicionar mais episódios do que o definido."); 
		} else {
			this.listaDeBlurays[this.qtdEpisodios] = bd;
			this.qtdEpisodios++;			
		}
	}
	public int duracaoTotal() {
		int duracaoTotal = 0;
		for(int i = 0; i < this.qtdEpisodios; i++) {
			duracaoTotal += this.listaDeBlurays[i].getDuracao(); 
		}
		return duracaoTotal;
	}
	public String listaBluray(String titulo) {
		for(int i = 0; i < this.qtdEpisodios; i++) {
			if (this.listaDeBlurays[i].getTitulo().equals(titulo)) {
				return this.listaDeBlurays[i].toString();
			}
		}
		return null;
	}
	public void incrementaPopularidade(){
		this.popularidade++;
	}
	public String getPopularidade() {
		if(this.popularidade <= 10) {
			return "POUCO POPULAR";
		} else if(this.popularidade <= 30){
			return "POPULAR";
		}
		return "MUITO POPULAR";
	}
}
