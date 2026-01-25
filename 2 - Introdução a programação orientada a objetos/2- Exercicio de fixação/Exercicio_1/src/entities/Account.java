package entities;

public class Account {

    private int userCode;
    private String name;
    private double deposit;

    public Account(int code, String name) {
        this.userCode = code;
        this.name = name;
    }

    public Account(int code, String name, double depositValue) {
        this.userCode = code;
        this.name = name;
        deposit(depositValue);
    }

    public int getUserCode() { return userCode; }

    public String getName() {
        return name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdraw(double value) {
        this.deposit -= value + 5.00;
    }

    public void deposit(double value) {
        this.deposit += value;
    }

    public String toString() {
        return "Account "
                + userCode
                + ", Holder: "
                + name
                + ", Balance: $ "
                + String.format("%.2f", deposit);
    }

}
