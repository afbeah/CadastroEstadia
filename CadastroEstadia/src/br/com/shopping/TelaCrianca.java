package br.com.shopping;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCrianca extends JFrame {

    private JTextField nomeField, idadeField, sexoField;
    private JButton proximoButton;
    private Responsavel responsavel;

    public TelaCrianca(Responsavel responsavel) {
        // Recebendo o objeto Responsavel
        this.responsavel = responsavel;

        // Definindo o título e o layout da tela
        setTitle("Cadastro Criança");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando os componentes da tela
        nomeField = new JTextField(20);
        idadeField = new JTextField(20);
        sexoField = new JTextField(20);

        proximoButton = new JButton("Próximo");

        // Adicionando os componentes ao layout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(new JLabel("Nome da Criança:"));
        add(nomeField);
        add(new JLabel("Idade:"));
        add(idadeField);
        add(new JLabel("Sexo:"));
        add(sexoField);
        add(proximoButton);

        // Ação do botão "Próximo"
        proximoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Validando a idade da criança
                    int idadeCrianca = Integer.parseInt(idadeField.getText());
                    if (idadeCrianca > 10) {
                        JOptionPane.showMessageDialog(null, "A criança deve ter 10 anos ou menos.");
                        return;
                    }

                    // Criando o objeto Crianca
                    String nomeCrianca = nomeField.getText();
                    String sexoCrianca = sexoField.getText();

                    // Instanciando o objeto Criança
                    Crianca crianca = new Crianca(nomeCrianca, idadeCrianca, sexoCrianca, responsavel);

                    // Passando os objetos Responsavel e Crianca para a próxima tela
                    TelaEstadia telaEstadia = new TelaEstadia(responsavel, crianca);
                    telaEstadia.setVisible(true);
                    dispose(); // Fecha a tela atual
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Idade inválida. Insira um número válido.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Exibindo a TelaCrianca
        TelaCrianca tela = new TelaCrianca(new Responsavel("Nome", "CPF", "Telefone", "Email", "Endereco", 18));
        tela.setVisible(true);
    }
}

