package ss6.bai_tap.bai_tap3;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint mP = new MovablePoint();
        mP.setSpeed(12,23);
        mP.setXSpeed(10);
        mP.setXY(2,3);
        mP.setYSpeed(1000);
        System.out.println(mP.toString());
    }
}
