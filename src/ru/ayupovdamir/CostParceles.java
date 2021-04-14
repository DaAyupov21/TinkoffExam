package ru.ayupovdamir;

import java.util.*;

public class CostParceles {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> parcels = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            parcels.add(scanner.nextInt());
        }
        int minCost = parcels.get(0);
        int maxCost = parcels.get(0);
        int counter = 1;
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (i == 0 && parcels.get(0) != parcels.get(1) - 1){
                sum += costCalculate(maxCost, minCost, counter, k);
                counter++;
                continue;
            }
            else if(i == 0) {
                continue;
            }
            if(parcels.get(i - 1) == parcels.get(i) - 1 && counter <= m){
                maxCost = parcels.get(i);
                counter++;
            }
            else {
                if(maxCost < minCost){
                    maxCost = minCost;
                }
                sum += costCalculate(maxCost, minCost, counter, k);
                if (i+1 < parcels.size()){
                    minCost=parcels.get(i+1);
                }
                else {
                    break;
                }
                counter = 1;
                maxCost = minCost;
            }
        }
        System.out.println(sum);
    }
    private static int costCalculate(int a, int b, int x, int k) {
        return ((a - b) * (x * x)) + k;
    }
}
