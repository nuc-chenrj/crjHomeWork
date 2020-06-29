package day04;

public class SportsCar extends Car{


    public SportsCar(String brand) {
        super(brand);
    }

    public SportsCar() {

    }

    @Override
    public void run() {
        System.out.println("超级跑车");
    }

    public void price(){
        System.out.println("售价100w");
    }
}
