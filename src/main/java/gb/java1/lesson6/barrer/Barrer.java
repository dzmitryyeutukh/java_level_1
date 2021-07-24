package gb.java1.lesson6.barrer;

public abstract class Barrer {

    protected String name;
    protected int lenght;

    public Barrer (String name, int lenght){
        this.name = name;
        this.lenght = lenght;
    }

    public abstract int getLenght();
    public abstract String getName();
}
