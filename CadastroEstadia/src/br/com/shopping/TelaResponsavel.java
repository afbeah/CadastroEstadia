package br.com.shopping;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaResponsavel extends JFrame {

    // Definindo os componentes da tela
    private JTextField nomeField, cpfField, telefoneField, emailField, enderecoField, idadeField;
    private JButton proximoButton;

    public TelaResponsavel() {
        // Definindo o título e o layout da tela
        setTitle("Cadastro Responsável");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando os componentes da tela
        nomeField = new JTextField(20);
        cpfField = new JTextField(20);
        telefoneField = new JTextField(20);
        emailField = new JTextField(20);
        enderecoField = new JTextField(20);
        idadeField = new JTextField(20);

        proximoButton = new JButton("Próximo");

        // Adicionando os componentes ao layout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(new JLabel("Nome:"));
        add(nomeField);
        add(new JLabel("CPF:"));
        add(cpfField);
        add(new JLabel("Telefone:"));
        add(telefoneField);
        add(new JLabel("E-mail:"));
        add(emailField);
        add(new JLabel("Endereço:"));
        add(enderecoField);
        add(new JLabel("Idade:"));
        add(idadeField);
        add(proximoButton);

        // Ação do botão "Próximo"
        proximoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Validando a idade do responsável
                    int idade = Integer.parseInt(idadeField.getText());
                    if (idade < 18) {
                        JOptionPane.showMessageDialog(null, "O responsável deve ser maior de idade.");
                        return;
                    }

                    // Criando o objeto Responsavel
                    String nome = nomeField.getText();
                    String cpf = cpfField.getText();
                    String telefone = telefoneField.getText();
                    String email = emailField.getText();
                    String endereco = enderecoField.getText();

                    Responsavel responsavel = new Responsavel(nome, cpf, telefone, email, endereco, idade);

                    // Passando o objeto Responsavel para a próxima tela
                    TelaCrianca telaCrianca = new TelaCrianca(responsavel);
                    telaCrianca.setVisible(true);
                    dispose(); // Fecha a tela atual
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Idade inválida. Insira um número válido.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Exibindo a TelaResponsavel
        TelaResponsavel tela = new TelaResponsavel();
        tela.setVisible(true);
    }
}
