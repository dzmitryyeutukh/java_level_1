package gb.java1.lesson7;

public class Cat {

    protected String name;
    protected boolean satiety;
    protected int mealSize;

    public Cat (String name, int mealSize){
        this.name = name;
        this.satiety = false;
        this.mealSize = mealSize;
    }


    public boolean eatFromBowl (int eatSomeFoodValue, Bowl bowl){
        if (!bowl.checkEnoughtMeal(eatSomeFoodValue)){
            System.out.printf("В тарелке еды %d меньше, чем хотят съесть %d\n", bowl.getAmountOfFood(),eatSomeFoodValue);
            this.satiety = false;
            return false;
        }
        else {
            bowl.eatSomeFoodFromBowl(eatSomeFoodValue);
            this.satiety = true;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                ", mealSize=" + mealSize +
                '}';
    }
}
