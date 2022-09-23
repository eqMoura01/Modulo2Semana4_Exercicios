import entidades.Filial;
import entidades.Gerente;
import entidades.Produto;
import entidades.Vendedor;

public class App {
    public static void main(String[] args) throws Exception {
        Double salarioHora = 20d;
        Integer cargaHorariaSemanal = 80;

        // Cria um objeto da classe Vendedor...
        Vendedor v1 = new Vendedor("Japa", 1);

        // Cria um objeto da classe Gerente...
        Gerente g1 = new Gerente("Mora", 1);

        // Cria 2 objetos da classe Produto para testar o metodo de venda...
        Produto p1 = new Produto("Sofá", 2500.99d, 1);
        Produto p2 = new Produto("Geladeira", 899.90d, 1);

        Filial f1 = new Filial();

        // Testa os metodos da classe Vendedor...
        v1.baterPonto();
        v1.agregarProduto(p1);
        v1.agregarProduto(p2);
        v1.venderProduto(p1);
        v1.venderProduto(p1);
        v1.venderProduto(p2);
        v1.receberSalario(cargaHorariaSemanal, salarioHora);

        // Testa os metodos da classe Gerente....
        g1.baterPonto();
        g1.receberSalario(cargaHorariaSemanal, salarioHora);
    }
}
