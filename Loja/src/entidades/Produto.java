package entidades;

public class Produto {
    private String nome;
    private Double preco;
    private int quantidadeEstoque;

    // Construtor...
    public Produto(String nome, Double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Getters && Setters...
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getquantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setquantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void produtoVendido() {
        this.quantidadeEstoque -= 1;
    }

}
