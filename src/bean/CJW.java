package bean;

public class CJW extends Employee1 {

    private double salary; //Annual salary

    public CJW(String name, String address, int number) {
        super(name, address, number);
    }

    @Override
    public double computerPay() {
        return 0;
    }

    @Override
    public void mailCheck() {
        super.mailCheck();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
