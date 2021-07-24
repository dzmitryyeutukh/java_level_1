package gb.java1.lesson5;

public class Employee {

    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee (String fio,String position,String email,String phone,int salary,int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo(){
        System.out.printf("Employee FIO: %s,\n position: %s, \n email: %s, \n phone: %s, \n salary: %d, \n age: %d \n",
                this.fio, this.position,this.email,this.phone,this.salary,this.age);
    }

    public int getAge(){
        return this.age;
    }
}
