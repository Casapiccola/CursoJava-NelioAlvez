package entities;

public class People {

    private double height;
    private char gender;

    public People(char gen, double height) {
        this.gender = gen;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

}
