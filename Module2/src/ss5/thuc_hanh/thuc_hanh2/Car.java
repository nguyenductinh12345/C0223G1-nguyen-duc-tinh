package ss5.thuc_hanh.thuc_hanh2;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name,String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    public void display(){
        System.out.println(this.name+" "+this.engine);
    }
}
