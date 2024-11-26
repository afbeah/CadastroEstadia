package br.com.shopping;

public class Crianca {

    private String nome;
    private int idade;
    private String sexo;
    private Responsavel responsavel;

    // Construtor
    public Crianca(String nome, int idade, String sexo, Responsavel responsavel) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.responsavel = responsavel;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
}
