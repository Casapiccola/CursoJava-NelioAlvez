package entities;

public class Student {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public String finalResult() {
        double nota = notaFinal();
        if (nota < 60) {
            double falta = 60 - nota;
            return "FINAL GRADE = "
                    + String.format("%.2f%n", nota)
                    + "FAILED\n"
                    + "MISSING "
                    + falta
                    + " POINTS";
        } else {
            return "FINAL GRADE = "
                    + String.format("%.2f%n", nota)
                    + "PASS\n";
        }
    }

}
