package entidades;

import interfaces.Funcionario;

public class Gerente implements Funcionario {

    private String nome;
    private int id;
    private Double horasTrabalhadas;

    // Construtor...
    public Gerente(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.horasTrabalhadas = 0d;
    }

    // Getters && Setters...
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    // Metodos...
    @Override
    public void baterPonto() {
        System.out.println("O gerente " + this.nome + " inscrito no ID " + this.id + ", bateu o ponto!");
        this.horasTrabalhadas += 1d;
    }

    @Override
    public void receberSalario(int horasTrabalhadas, Double salarioHora) {

        Double salarioTotal = salarioHora * horasTrabalhadas;
        int percentualGerente = 10;

        salarioTotal = salarioTotal + (percentualGerente * (salarioTotal / 100));

        System.out.println(
                "O gerente " + this.nome + " inscrito no ID " + this.id + ", recebeu " + salarioTotal
                        + " de salario, com um total de horas " + horasTrabalhadas + " trabalhadas");
    }

}
