package school.mjc.stage0.loops.task1;

public class RepeatIsBad {

    int n = 20;
    @SuppressWarnings("java:S106")
    public void repeatIsBad(int n){

        String message = "writing the same code doesn't have much impact, and it's also time consuming";

        if (n > 0) {
            System.out.println(message);
            repeatIsBad(n - 1);
        }
    }
}
