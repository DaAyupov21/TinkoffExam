package ru.ayupovdamir;

import java.util.Scanner;

public class Dominoes {
    public static void main(String[] args) {
        boolean isConnectable = false;
        Scanner scanner = new Scanner(System.in);
        String firstDomino = scanner.nextLine();
        String secondDomino = scanner.nextLine();
        String[] firstDominoArray = firstDomino.split(" ");
        String[] secondDominoArray = secondDomino.split(" ");
        isConnectable = isConnectable(firstDominoArray, secondDominoArray);
        if(!isConnectable){
            System.out.println(-1);
            System.exit(0);
        }
        else {
            if (firstDominoArray[0].equals(secondDominoArray[0])){
                System.out.println(firstDominoArray[1] + " " + firstDominoArray[0] + " " + secondDominoArray[0] + " "
                        + secondDominoArray[1]);
            }
            else if (firstDominoArray[1].equals(secondDominoArray[0])){
                System.out.println(firstDominoArray[0] + " " + firstDominoArray[1] + " " + secondDominoArray[0] + " "
                        + secondDominoArray[1]);
            }
            else if (firstDominoArray[1].equals(secondDominoArray[1])){
                System.out.println(firstDominoArray[0] + " " + firstDominoArray[1] + " " + secondDominoArray[1] + " "
                        + secondDominoArray[0]);
            }
            else {
                System.out.println(firstDominoArray[1] + " " + firstDominoArray[0] + " " + secondDominoArray[1] + " "
                        + secondDominoArray[0]);
            }
        }

    }

    private static boolean isConnectable( String[] firstDominoArray, String[] secondDominoArray) {
        boolean isConnectable = false;
        for (int i = 0; i < firstDominoArray.length; i++){
            for (int j = 0; j < secondDominoArray.length; j++){
                if(firstDominoArray[i].equals(secondDominoArray[j])) {
                    isConnectable = true;
                    break;
                }
            }
        }
        return isConnectable;
    }
}
