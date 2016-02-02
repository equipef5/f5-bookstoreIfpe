package testeLivro;

public class livro {
	private	String titulo;
	private	String autor;
	private	String imagem;
	private	int qtd;

	public livro(String titulo, String autor, String imagem, int qtd) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.imagem = imagem;
		this.qtd = qtd;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public livro() {
		// TODO Auto-generated constructor stub
	}

}
