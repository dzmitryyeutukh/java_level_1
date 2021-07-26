package gb.java1.lesson7;

public class Lesson7 {

    public static void main (String[] args){

        Cat[] catArray = {
                new Cat("CatName1", 10),
                new Cat("CatName2", 15)
        };

        Bowl bowl =new Bowl(13);

        for (Cat cat: catArray){
            cat.eatFromBowl(cat.mealSize, bowl);
            System.out.println(cat);
        }
    }
}
