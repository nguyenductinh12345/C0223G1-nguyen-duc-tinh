package ss4.bai_tap.bai_tap2;

public class Times {
    public static void main(String[] args) {
        StopWatch st = new StopWatch();
        st.start();
        for (int i = 0; i < 1000000000; i++) {
            for (int j = 0; j < 2000000005; j++) {
            }
        }
        System.out.println(st.getStartTime());
        st.stop();
        System.out.println(st.getStopTime());
        System.out.println(st.getElapsedTime());
    }
}
