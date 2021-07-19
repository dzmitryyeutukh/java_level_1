package gb.java1.lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Employee[] employeesArray = {
                new Employee ("Ivanov1","Developer1","1@a.ru","123", 100, 25),
                new Employee ("Ivanov2","Developer2","2@a.ru","456", 200, 35),
                new Employee ("Ivanov3","Developer3","3@a.ru","789", 300, 45),
                new Employee ("Ivanov4","Developer4","4@a.ru","012", 400, 55),
                new Employee ("Ivanov5","Developer5","5@a.ru","345", 500, 15),
        };
        for (Employee i:employeesArray){
            if (i.getAge()>40) i.getInfo();
        }
    }
}
