package entidades;

import java.util.List;

public class Rede {
    private List<Filial> filiais;
    private String nome;
    private String endereco;
    private String cnpj;

    public Rede(List<Filial> filiais, String nome, String endereco, String cnpj) {
        this.filiais = filiais;
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

}
