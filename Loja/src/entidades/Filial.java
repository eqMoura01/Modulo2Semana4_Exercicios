package entidades;

import java.util.List;

import interfaces.FilialInterface;
import interfaces.Funcionario;

public class Filial implements FilialInterface {
    private Gerente gerente;
    private List<Funcionario> funcionarios;

    @Override
    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
}
