package gb.java1.lesson7;

public class Bowl {

    protected int amountOfFood;

    public Bowl (int amountOfFood){
        this.amountOfFood = amountOfFood;
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    public void addSomeFoodToBowl(int addSomeFoodValue){
        this.amountOfFood += addSomeFoodValue;
        System.out.printf("В тарелку добавили %d стало %d\n", addSomeFoodValue, this.amountOfFood);
    }

    public void eatSomeFoodFromBowl(int eatSomeFoodValue){
        this.amountOfFood -= eatSomeFoodValue;
        System.out.printf("Из тарелки съели %d стало %d\n", eatSomeFoodValue, this.amountOfFood);
    }

    public boolean checkEnoughtMeal (int eatSomeFoodValue){
        if ((this.amountOfFood - eatSomeFoodValue) >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "amountOfFood=" + amountOfFood +
                '}';
    }
}
