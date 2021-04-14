package ru.ayupovdamir;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pizza = scanner.nextInt();
        int team = Integer.parseInt(String.valueOf(scanner.nextInt()));
        ArrayList<Integer> times = new ArrayList<>(team);
        for (int i = 0; i <  team; i++){
            times.add(Integer.valueOf(scanner.next()));
        }
        int sum = 0;
        while (pizza >= 0){
            pizza -= team;
            for(int i : times){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
