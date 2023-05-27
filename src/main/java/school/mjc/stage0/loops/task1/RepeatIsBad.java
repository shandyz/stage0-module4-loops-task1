package school.mjc.stage0.loops.task1;

public class RepeatIsBad {

    @SuppressWarnings("java:S106")
    public void repeatIsBad(){

        String message = "writing the same code doesn't have much impact, and it's also time consuming";

       for (int i = 1; i <= 20; i++) {
           System.out.printf(message);
       }
    }
}
