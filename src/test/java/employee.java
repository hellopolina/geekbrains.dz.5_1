public class employee {
    String FIO;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    employee(String FIO, String position, String email, String phone, int salary, int age){
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println(this);
    }
}
