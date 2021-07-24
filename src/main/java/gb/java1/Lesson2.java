package gb.java1;

public class Lesson2 {

    public static void main (String[] args) {

//        System.out.println (isValueBetween10and20 (11,6));
//        isValuePositive (-10);
//        System.out.println (isValuePositiveReverse(10));
//        printFewStrings ("Cтрока", -1);
//        System.out.println (checkLeapYear(-2020));


    }

    public static boolean isValueBetween10and20 (int a, int b) {
           return (a + b >= 10 && a + b <=20);
      }

    public static void isValuePositive(int a) {
        System.out.println (a >= 0 ? "Положительное" : "Отрицательное");
    }

    public static boolean isValuePositiveReverse (int a)  {
        return a < 0;
    }

    public static void printFewStrings(String a,int b) {
        if (b < 0) {
            System.out.println("Число отрицательное");
            return;
        }
        for (int i =0; i < b; i++){
            System.out.println(a);
        }



    }

    public static boolean checkLeapYear (int a)  {
        if (a <= 0) {
            System.out.println("Число отрицательное, либо 0");
            return false;
        }
        return ((a % 4 ==0) || (a/100 ==4)) ;
    }




}
