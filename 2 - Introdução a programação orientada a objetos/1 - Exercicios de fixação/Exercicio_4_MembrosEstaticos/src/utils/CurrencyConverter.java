package utils;

public class CurrencyConverter {

    public static double converterDol(double dolarPrice, double reais) {
        return dolarPrice * reais + (dolarPrice * reais * 0.06);
    }

}
