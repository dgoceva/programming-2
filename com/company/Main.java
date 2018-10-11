package com.company;

import java.util.Scanner;

public class Main {

    public static final int SIZE=5;
 
    public static void main(String[] args) {
	// write your code here
        int[] marks = new int[SIZE];
        int[] counts = {0,0,0,0,0};
        Scanner sc = new Scanner(System.in );
        float avrMark=0;

        for (int i=0;i<marks.length;i++){
            System.out.print("Mark["+i+"]= ");
            marks[i] = sc.nextInt();
        }

        for(int mark : marks){
            System.out.print(mark+" ");
        }
        System.out.println();

        for (int mark: marks){
            avrMark += mark;
            counts[mark-2]++;
        }
        System.out.println("Average mark is "+avrMark/marks.length);

        for(int i=0;i<counts.length;i++){
            System.out.println((i+2)+": "+counts[i]);
        }

    }
}
