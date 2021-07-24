package gb.java1.lesson6.animal;

public class Cat extends Animal {

    protected static int catCountNumber;
    protected int catCountNumberRow;

    public Cat(String name){

        super(name);
        this.catCountNumber ++;
        this.catCountNumberRow = this.catCountNumber;

    }

    @Override
    public void getInfo(){
       System.out.printf("created Cat: %s, cat_number %d, rowCat %d, countAllAnimal %d \n",
               super.name, this.catCountNumber, this.catCountNumberRow, super.animalCount );
    }

    @Override
    public void run(int lenght){
        if (lenght > 200){
            System.out.printf("%s can't run more than 200 meters - cat die \n", this.name);
         }
        else {
            System.out.printf("%s ran %d meters \n", this.name,lenght);
        }
    }

    @Override
    public void swim (int lenght){
        System.out.printf("%s can't swim - cat die \n", this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public boolean runRoad(String name, int lenght){
        if (lenght <= 200){
            System.out.printf("%s пересек %s длиной %d \n",this.name,name,lenght);
            return true;
        }
        System.out.printf("%s не пересек %s длиной %d и умер \n",this.name,name,lenght);
        return false;

    }

    public boolean swimRiver(String name, int lenght){
            System.out.printf("%s не умеет плавать и умер \n",this.name);
            return false;
    }
}

