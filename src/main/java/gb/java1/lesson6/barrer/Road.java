package gb.java1.lesson6.barrer;

public class Road extends Barrer {

    public Road (String name, int lenght){
        super(name,lenght);
    }

    @Override
    public int getLenght() {
        return this.lenght;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
