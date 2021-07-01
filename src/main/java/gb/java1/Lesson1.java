package gb.java1;

public class Lesson1 {

    public static void main (String[] args) {

        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();

    }

    public static void printThreeWords() {
        System.out.print("Orange" + '\n' + "Banana" + '\n' + "Apple");
    }

    public static void checkSumSign() {
        int a =5;
        int b = -6;
        if (a + b >= 0) {
            System.out.print("Сумма положительная");
        }
        else System.out.print("Сумма отрицательная");
    }

    public static void printColor() {
        int value =101;
        if (value > 0){
            if (value >100) {
                System.out.print("Зелёный");
            }
            else System.out.print("Жёлтый");
        }
        else System.out.print("Красный");


    }

    public static void compareNumbers(){
        int a = 3;
        int b = 2;
        if (a >= b) {
            System.out.print("a >= b");
        }
        else System.out.print("a < b");
    }
}