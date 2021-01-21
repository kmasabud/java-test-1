package com.company.one;

import java.util.*;

public class One {
    public static void main(String... args) {
        int n = getSize();

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        filterOddEvent(odd, even, n);

        printMe(odd, true);
        printMe(even, false);
    }

    public static int getSize(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N = ");
        return scan.nextInt();
    }

    public static void filterOddEvent(List<Integer> odd, List<Integer> even, int n){
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                odd.add(i);
            }
            else{
                even.add(i);
            }
        }
    }

    public static void printMe(List<Integer> data, boolean isOdd){
        System.out.println();
        if (isOdd){
            System.out.println("Odd List is");
        }else{
            System.out.println("Even List is");
        }
        for(int tmp : data){
            System.out.print(tmp+" ");
        }
    }
}
