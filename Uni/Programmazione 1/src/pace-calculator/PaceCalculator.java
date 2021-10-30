import java.util.Scanner;

public class PaceCalculator {
    public static final double MARATHON_DISTANCE = 42.2;
    public static void main(String args[]){
        int hours=0, minutes=0, seconds=0;
        System.out.println("--- PACE CALCULATOR ---");
        System.out.println("The time will have to be inserted into three different fields: hours, minutes and seconds");
        java.util.Scanner input = new Scanner(System.in);
        System.out.print("Insert hours: ");
        hours = input.nextInt();
        System.out.print("Insert minutes: ");
        minutes = input.nextInt();
        System.out.print("Insert seconds: ");
        seconds = input.nextInt();
        input.close();

        double minutesPerKilometer = toMinutesPerKilometer(hours, minutes, seconds);
        double remainingSeconds = minutesPerKilometer%60;
        String stringRemainingSeconds = "";
        if(remainingSeconds < 10){
            stringRemainingSeconds = String.format("0%1$s", (int)remainingSeconds);
        } else stringRemainingSeconds = String.format("%1$s", (int)remainingSeconds);
        System.out.println("\n\nPace in minutes/km: " + (int)minutesPerKilometer + ":" + stringRemainingSeconds + " min/km");

        double secondsPerKilometer = minutesPerKilometer * 60;
        System.out.println("Pace in seconds/km: " + (int)secondsPerKilometer + " sec/km");
    }

    public static double toMinutesPerKilometer(int hours, int minutes, int seconds){
        minutes += hoursToMinutes(hours);
        minutes += seconds/60;
        return minutes/MARATHON_DISTANCE;
    }

    public static int minutesToSeconds(int minutes){
        return minutes*60;
    }

    public static int hoursToMinutes(int hours){
        return hours*60;
    }
}
