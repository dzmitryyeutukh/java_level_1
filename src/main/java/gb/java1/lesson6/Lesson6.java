package gb.java1.lesson6;

import gb.java1.lesson6.animal.Animal;
import gb.java1.lesson6.animal.Cat;
import gb.java1.lesson6.animal.Dog;
import gb.java1.lesson6.barrer.Barrer;
import gb.java1.lesson6.barrer.River;
import gb.java1.lesson6.barrer.Road;

public class Lesson6 {
    public static void main(String[] args) {

        Animal[] animalsArray = {
                new Dog ("Dog1"),
                new Dog ("Dog2"),
                new Cat ("Cat1"),
                new Cat ("Cat2")
        };

//        for (Animal i : animalsArray){
//            if (i instanceof Cat) {
//                i.getInfo();
//            }
//            else if (i instanceof Dog) {
//                i.getInfo();
//            }
//        } // Вывод информации о животных
//
//        for (Animal i : animalsArray) {
//            i.run(500);
//            i.swim(8);
//        } // Преодоление расстояния

        Barrer[] barrersArray = {
                new Road("Road1", 150),
                new River("River1", 5),
                new Road("Road2", 600),
                new River("River2", 3),
                new Road("Road3", 100),
                new River("River2", 9)
        };

        for (Animal an : animalsArray) {
            if (an instanceof Dog) {
                for (Barrer ba : barrersArray) {
                    if (ba instanceof Road){
                        if (!an.runRoad(ba.getName(), ba.getLenght())) break;
                    }
                    if (ba instanceof River){
                        if (!an.swimRiver(ba.getName(), ba.getLenght())) break;
                    }
                }
            }
            if (an instanceof Cat) {
                for (Barrer ba : barrersArray) {
                    if (ba instanceof Road){
                        if (!an.runRoad(ba.getName(), ba.getLenght())) break;
                    }
                    if (ba instanceof River){
                        if (!an.swimRiver(ba.getName(), ba.getLenght())) break;
                    }
                }
            }
        }

    }
}
