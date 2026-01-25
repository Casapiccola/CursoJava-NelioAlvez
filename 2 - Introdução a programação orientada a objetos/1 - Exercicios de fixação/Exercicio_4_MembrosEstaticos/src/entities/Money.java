package entities;

public class Money {

    public double dollar;
    public double reais;

    public Money(double moedaUsario, double moedaParaConversao) {
        this.dollar = moedaUsario;
        this.reais = moedaParaConversao;
    }

}
