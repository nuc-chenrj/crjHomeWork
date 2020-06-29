package day04;

public class Test {
    public static void main(String[] args) {
        SportsCar car1= new SportsCar("红旗");
        System.out.println(car1.getBrand());
        car1.run();
        car1.price();

        Car car2=new SportsCar();
        car2.setBrand("宝马");
        System.out.println(car2.getBrand());
        car2.run();
        //
        //((SportsCar)car2).price();
    }
}
