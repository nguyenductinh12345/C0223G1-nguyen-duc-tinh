package ss4.bai_tap.bai_tap3;

public class Main {
    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.setSpeed(Fan.FAST);
        Fan1.setRadius(10);
        Fan1.setColor("yellow");
        Fan1.setOn(true);
        System.out.println(Fan1);
        Fan Fan2 = new Fan();
        Fan2.setSpeed(Fan.MEDIUM);
        Fan2.setRadius(5);
        Fan2.setColor("blue");
        Fan2.setOn(false);
        System.out.println(Fan2);

    }
}
