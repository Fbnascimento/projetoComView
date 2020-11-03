package model;

public class Funcionario extends Usuario {

    private int matricula;

    public Funcionario(String nome, String sobrenome, String cpf, int telefone, String login, String senha, int matricula) {
        super(nome, sobrenome, cpf, telefone, login, senha);
        this.matricula = matricula;
    }

    public Funcionario(String nome, String sobrenome, String cpf, String login, String senha, int matricula) {
        super(nome, sobrenome, cpf, login, senha);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario\n" + super.toString() + ", matricula=" + matricula;
    }

}
