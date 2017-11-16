package simulado1;

public class Bluray {

	private String titulo;
	private int duracao;
	private int popularidade; 
	
	public Bluray(String titulo, int duracao) {
		if(duracao < 0) {
			throw new IllegalArgumentException("A duração não pode ser negativa.");
		}
		if(titulo == null || titulo == "") {
			throw new IllegalArgumentException("Apenas títulos válidos.");
		}
		this.titulo = titulo;
		this.duracao = duracao;
	}
	public int getDuracao() {
		return this.duracao;
	}

	public String getPopularidade() {
		if(this.popularidade <= 10) {
			return "POUCO POPULAR";
		} else if(this.popularidade <= 30){
			return "POPULAR";
		}
		return "MUITO POPULAR";
	}

	public void incrementaPopularidade() {
		this.popularidade++;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public String toString() {
		return titulo + ". Duração = " + duracao + " minutos.";
	}
}
