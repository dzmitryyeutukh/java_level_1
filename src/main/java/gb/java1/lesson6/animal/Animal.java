package gb.java1.lesson6.animal;

public abstract class Animal {

    protected static int animalCount;

    protected String name;
    protected int objectAnimalNumber;

    public Animal(String name){
        this.name = name;
        objectAnimalNumber ++;
        animalCount = animalCount + objectAnimalNumber;
    }

    public abstract void run(int lenght);
    public abstract void swim(int lenght);
    public abstract void getInfo();
    public abstract String getName();
    public abstract boolean runRoad(String name, int lenght);
    public abstract boolean swimRiver(String name, int lenght);


}
