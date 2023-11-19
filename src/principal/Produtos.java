package principal;

public class Produtos {
	private int id;
	private static String nome;
	private double preco;
	public Produtos(int id, String nome, double preco) {
		this.id = id;
		Produtos.nome = nome;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
}
