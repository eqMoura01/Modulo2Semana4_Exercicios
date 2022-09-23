package entidades;

import java.util.ArrayList;

import interfaces.Funcionario;

public class Vendedor implements Funcionario {
    private String nome;
    private int id;
    private Double horasTrabalhadas;
    private Double comissoes = 0d;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    // Construtor...
    public Vendedor(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.horasTrabalhadas = 0d;
    }

    // Getters...
    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    // Metodos...
    @Override
    public void baterPonto() {
        System.out.println("O vendedor " + this.nome + " inscrito no Id " + this.id + ", bateu o ponto!");
        this.horasTrabalhadas += 1d;

    }

    @Override
    public void receberSalario(int horasTrabalhadas, Double salarioHora) {

        Double salarioTotal = (salarioHora * horasTrabalhadas) + this.comissoes;

        System.out
                .println("O vendedor " + this.nome + " inscrito no Id " + this.id + ", recebeu " + salarioTotal
                        + " de salario, com um total de " + horasTrabalhadas + " horas trabalhadas");

    }

    public void agregarProduto(Produto produto) {

        if (verificaEstoque(produto)) {
            produtos.add(produto);
            System.out.println("O VENDEDOR '" + this.getNome() + "' AGREGOU O PRODUTO '" + produto.getNome()
                    + "' A SUA LISTA!");
        } else {
            System.out.println("ERRO AO ADICIONAR O PRODUTO A LISTA DO VENDEDOR! O PRODUTO '" + produto.getNome()
                    + "' SE ENCONTRA FORA DE ESTOQUE!");
        }
    }

    public void venderProduto(Produto produto) {

        if (verificaListaVenvedor(produto) == true) {

            if (verificaEstoque(produto) == true) {

                System.out.println("PRODUTO '" + produto.getNome() + "' VENDIDO!");

                produto.produtoVendido();

                adicionacomissoes(produto);
            } else {
                System.out.println("ERRO NA VENDA! PRODUTO '" + produto.getNome() + "' FORA DE ESTOQUE!");
            }

        } else {
            System.out.println("ERRO NA VENDA! O PRODUTO '" + produto.getNome() + "' NÃO ESTÁ NA LISTA DO VENDEDOR!");
        }

    }

    private boolean verificaListaVenvedor(Produto produto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i) == produto) {
                return true;
            }
        }
        return false;
    }

    private boolean verificaEstoque(Produto produto) {

        if (produto.getquantidadeEstoque() > 0) {
            return true;
        }

        return false;
    }

    private void adicionacomissoes(Produto produto) {
        this.comissoes += (produto.getPreco() / 10);
    }

}