package bean;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee ganLe = new Employee("ganLe");
        ganLe.setAge(22);
        ganLe.setDesignation("Android 开发工程师");
        ganLe.setSalary(8000);

        String string = ganLe.toString();

        System.out.println(string);
    }
}
