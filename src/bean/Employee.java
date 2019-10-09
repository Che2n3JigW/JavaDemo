package bean;

/**
 * 员工类
 */
public class Employee implements InterfaceDemo{
    //名字
    private String name;
    //年龄
    private int age;
    //职位
    private String designation;
    //工资
    private double salary;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void work() {
        System.out.println("工作");
    }

    @Override
    public void eat() {
        System.out.println("吃饭动作");
    }

    @Override
    public void run() {
        System.out.println("运动动作");
    }
}
