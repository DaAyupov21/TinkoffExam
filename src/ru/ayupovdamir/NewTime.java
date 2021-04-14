package ru.ayupovdamir;

import java.util.Scanner;

public class NewTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursInDay = scanner.nextInt();
        int minutesInHour = scanner.nextInt();
        int secondsInMinute = scanner.nextInt();
        int countSeconds = scanner.nextInt();
        int resultSeconds = countSeconds % secondsInMinute;
        int resultMinutes = ((int)((double)(countSeconds / secondsInMinute))) % minutesInHour;
        int resultHours = ((int)((double)(countSeconds) / (secondsInMinute * minutesInHour))) %
                hoursInDay;
        System.out.println(resultHours + " " + resultMinutes + " " + resultSeconds);
    }
}
