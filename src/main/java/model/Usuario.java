package model;

public abstract class Usuario {

    private String nome;
    private String sobrenome;
    private String cpf;
    private int telefone;
    private Login login = null;

    public Usuario() {
    }

    public Usuario(String nome, String sobrenome, String cpf, int telefone, String login, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.login = new Login(login, senha);
    }

    public Usuario(String nome, String sobrenome, String cpf, String login, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.login = new Login(login, senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Login getLogin() {
        return this.login;
    }

    public void setLogin(Login login) {
        this.login.setLogin(login.getLogin());
        this.login.setSenha(login.getSenha());
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", telefone=" + telefone;
    }

}
