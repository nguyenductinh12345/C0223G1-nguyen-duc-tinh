package ss5.thuc_hanh.thuc_hanh2;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);;
        car1.display();
        car2.display();
    }
}
