package ru.ayupovdamir;

import java.util.*;

public class PlayingInTinkoff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> heights = new ArrayList<>();
        for (int i = 0; i < n; i++){
            heights.add(scanner.nextInt());
        }
        int pointer = 0;
        int counter;
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < heights.size(); i++){
            counter = 0;
            pointer = heights.get(i);
            for (int j = i; j < heights.size(); j++){
                if(pointer <= heights.get(j)){
                    counter++;
                    pointer = heights.get(j);
                }
            }
            results.add(counter);
        }
        for (int i : results){
            System.out.printf("%1S ", i);
        }
    }
}
