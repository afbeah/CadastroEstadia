package br.com.shopping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaEstadia extends JFrame {
    private JTextField tempoField;
    private JButton calcularButton;
    private JLabel resultadoLabel;
    private Responsavel responsavel;
    private Crianca crianca;

    public TelaEstadia(Responsavel responsavel, Crianca crianca) {
        this.responsavel = responsavel;
        this.crianca = crianca;

        setTitle("Cadastro de Estadia");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4, 2));

        add(new JLabel("Tempo de Estadia (minutos):"));
        tempoField = new JTextField();
        add(tempoField);

        calcularButton = new JButton("Calcular");
        add(calcularButton);

        resultadoLabel = new JLabel("");
        add(resultadoLabel);

        // Ação do botão
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int tempo = Integer.parseInt(tempoField.getText());
                    double valor = tempo * 1.5;
                    double desconto = 0;

                    if (tempo > 60) {
                        desconto = valor * 0.15;
                    } else if (tempo > 40) {
                        desconto = valor * 0.10;
                    } else if (tempo > 20) {
                        desconto = valor * 0.05;
                    }

                    double valorFinal = valor - desconto;
                    resultadoLabel.setText(String.format("Valor a pagar: R$ %.2f", valorFinal));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido para o tempo.");
                }
            }
        });
    }

    public static void main(String[] args) {
        new TelaEstadia(null, null).setVisible(true);
    }
}
