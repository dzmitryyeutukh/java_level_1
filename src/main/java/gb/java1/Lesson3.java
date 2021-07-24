package gb.java1;

import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {

//        changeOneToZeroAndZeroToOne();
//        fillingEmptyArray();
//        multiplicationByTwoIfUnderSix();
//        fillingDiagonals();
//        System.out.println(Arrays.toString(changingLenAndInitialValueArray(4, 15)));
//        minMaxValueArray(13, 9, -1, 3, 26, 8);
//        System.out.println(middleBetweenSums(2, 2, 2, 1, 2, 2, 10, 1));

    }

    public static void changeOneToZeroAndZeroToOne(){

        int[] oneZeroArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i <= oneZeroArr.length - 1; i ++){
            if (oneZeroArr[i] == 0) {
                oneZeroArr[i] = 1;
            }
            else oneZeroArr[i] = 0;
        }
        System.out.print(Arrays.toString(oneZeroArr));

    }

    public static void fillingEmptyArray(){

        int [] emptyArray = new int[100];
        for (int i = 0; i <= emptyArray.length - 1; i++){
            emptyArray[i] = i + 1;
            System.out.print(emptyArray[i] + " ");
            if ((i+1) % 20 == 0) System.out.println();
        }
    }

    public static void multiplicationByTwoIfUnderSix(){

        int[] multiplicationArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i <= multiplicationArr.length - 1; i ++){
            if (multiplicationArr[i] < 6) {
                multiplicationArr[i] = multiplicationArr[i] * 2;
            }
            else multiplicationArr[i] = multiplicationArr[i];
        }
        System.out.print(Arrays.toString(multiplicationArr));
    }

    public static void fillingDiagonals(){
        int [][] diagonalsArray = new int [4][4];
        for (int y = 0; y <= diagonalsArray.length - 1; y ++){
            for (int x = 0 ; x <= diagonalsArray.length -1 ; x ++){
                if (y == x) diagonalsArray [y][x] = 1;
                if (x == diagonalsArray.length -1 - y) diagonalsArray [y][x] = 1;
            }
            System.out.print(Arrays.toString(diagonalsArray [y]) + "\n");
        }
    }

    public static int[] changingLenAndInitialValueArray (int len, int initialValue){
        int [] tempArr = new int[len];
        for (int i = 0; i <= len - 1;i++){
            tempArr[i] = initialValue;
        }
        return tempArr;
    }

    public static void minMaxValueArray (int... tempArray){

        int minValue = tempArray[0];
        int maxValue = tempArray[0];
        for (int i = 0; i <= tempArray.length -1; i++){
            if (minValue > tempArray[i]) minValue = tempArray[i];
            if (maxValue < tempArray[i]) maxValue = tempArray[i];
        }
        System.out.println("Мин.значение = " + minValue + ", макс.значение = " + maxValue);
    }

    public static boolean middleBetweenSums (int... tempArray){

        for (int i = 0; i <= tempArray.length -1; i ++){

            int sumLeft=0;
            int sumRight=0;

            for (int a = 0; a <= i; a++){
                sumLeft = sumLeft + tempArray[a];
            }

            for (int b = i + 1; b <= tempArray.length -1; b++){
                sumRight = sumRight + tempArray[b];
            }

            if (sumLeft == sumRight) return true;
        }
        return false;


    }

}