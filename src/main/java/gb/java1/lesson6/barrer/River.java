package gb.java1.lesson6.barrer;

public class River extends Barrer {

    public River (String name, int lenght){
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
