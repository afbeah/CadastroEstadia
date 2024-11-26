package br.com.shopping;

public class App {
    public static void main(String[] args) {
        // Criar um Responsável para o cadastro
        Responsavel responsavel = new Responsavel("João Silva", "12345678900", "9988776655", "joao@email.com", "Rua X, 123", 35);

        // Criar a primeira tela (TelaResponsavel)
        TelaResponsavel telaResponsavel = new TelaResponsavel();
        telaResponsavel.setVisible(true);
    }
}
