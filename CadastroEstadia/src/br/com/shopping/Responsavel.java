package br.com.shopping;

public class Responsavel {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;
    private int idade;

    // Construtor
    public Responsavel(String nome, String cpf, String telefone, String email, String endereco, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.idade = idade;
    }

    // Getters e Setters
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }
}
