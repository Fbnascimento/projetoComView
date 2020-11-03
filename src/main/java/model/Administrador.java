package model;

public class Administrador extends Funcionario {

    private int nivelHierarquico;

    public Administrador(int nivelHierarquico, String nome, String sobrenome, String cpf, int telefone, String login, String senha, int matricula) {
        super(nome, sobrenome, cpf, telefone, login, senha, matricula);
        this.nivelHierarquico = nivelHierarquico;
    }

    public Administrador(int nivelHierarquico, String nome, String sobrenome, String cpf, String login, String senha, int matricula) {
        super(nome, sobrenome, cpf, login, senha, matricula);
        this.nivelHierarquico = nivelHierarquico;
    }

    public int getNivelHierarquico() {
        return nivelHierarquico;
    }

    public void setNivelHierarquico(int nivelHierarquico) {
        this.nivelHierarquico = nivelHierarquico;
    }

    @Override
    public String toString() {
        String stringDaSuper = super.toString();
        String modificada = stringDaSuper.substring(12);

        return "Administrador\n" + modificada + ", nivelHierarquico=" + nivelHierarquico;
    }
}
