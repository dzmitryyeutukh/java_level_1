package gb.java1.lesson6.animal;


public class Dog extends Animal {

    protected static int dogCountNumber;
    protected int dogCountNumberRow;

    public Dog(String name){

        super(name);
        this.dogCountNumber ++;
        this.dogCountNumberRow = this.dogCountNumber;

    }

    @Override
    public void getInfo(){
        System.out.printf("created Dog: %s, dog_count %d, rowDog %d, countAllAnimal %d \n",
                super.name, this.dogCountNumber, this.dogCountNumberRow, super.animalCount );
    }

    @Override
    public void run(int lenght){
        if (lenght > 500){
            System.out.printf("%s can't run more than 500 meters - cat die \n", this.name);
        }
        else {
            System.out.printf("%s ran %d meters \n", this.name,lenght);
        }
    }

    @Override
    public void swim (int lenght){
        if (lenght > 10){
            System.out.printf("%s can't swim more than 10 meters - dog die \n", this.name);
        }
        else {
            System.out.printf("%s swam %d meters \n", this.name, lenght);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    public boolean runRoad(String name, int lenght){
        if (lenght <= 500){
            System.out.printf("%s пересек %s длиной %d \n",this.name,name,lenght);
            return true;
        }
        System.out.printf("%s не пересек %s длиной %d и умер \n",this.name,name,lenght);
        return false;
    }

    public boolean swimRiver(String name, int lenght){
        if (lenght <= 10){
            System.out.printf("%s пересек %s длиной %d \n",this.name,name,lenght);
            return true;
        }
        System.out.printf("%s не пересек %s длиной %d и умер \n",this.name,name,lenght);
        return false;
    }






}

