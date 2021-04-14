package ru.ayupovdamir;

import java.util.*;
import java.util.Scanner;

public class CoolNickname {

    public static void main(String[] args) {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
        int pointer = 0;
        Scanner scanner = new Scanner(System.in);
        String nickname = scanner.next();
        for (int i = 0; i < nickname.length(); i++){
            if (vowels.contains(nickname.charAt(i)) && vowels.contains(nickname.charAt(i + 1))){
                pointer--;
                break;
            }
        }
        if (pointer < 0){
            System.out.println("NO");
        }
        else System.out.println("YES");
    }
}
