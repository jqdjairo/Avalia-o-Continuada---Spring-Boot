package br.com.bandtec.RESTAPI.Estrutura.de.dados;

public abstract class Plano {
    private String nome;
    private int idade;
    private String email;
    private String username;
    private String nomePlano;


    public Plano(String nome, int idade, String email, String username, String nomePlano) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.username = username;
        this.nomePlano = nomePlano;
    }

    public abstract double getCalPlanoAnual();

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getNomePlano() {
        return nomePlano;
    }
}
