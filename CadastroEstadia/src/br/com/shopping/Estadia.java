package br.com.shopping;

public class Estadia {
    private Responsavel responsavel;
    private Crianca crianca;
    private int tempoUtilizado; // Em minutos

    // Construtor
    public Estadia(Responsavel responsavel, Crianca crianca, int tempoUtilizado) {
        this.responsavel = responsavel;
        this.crianca = crianca;
        this.tempoUtilizado = tempoUtilizado;
    }

    // Método para calcular o valor
    public double calcularValorCobrado() {
        double valor = tempoUtilizado * 1.5; // R$1,50 por minuto

        if (tempoUtilizado > 60) {
            valor *= 0.85; // 15% de desconto
        } else if (tempoUtilizado > 40) {
            valor *= 0.90; // 10% de desconto
        } else if (tempoUtilizado > 20) {
            valor *= 0.95; // 5% de desconto
        }

        return valor;
    }

    // Getters e Setters
    public int getTempoUtilizado() {
        return tempoUtilizado;
    }

    public void setTempoUtilizado(int tempoUtilizado) {
        this.tempoUtilizado = tempoUtilizado;
    }
}
