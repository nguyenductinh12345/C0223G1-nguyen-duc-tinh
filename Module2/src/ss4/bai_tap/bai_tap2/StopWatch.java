package ss4.bai_tap.bai_tap2;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public StopWatch() {
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getStopTime() {
        return this.stopTime;
    }

    public long getElapsedTime() {
        return stopTime - startTime;
    }

}