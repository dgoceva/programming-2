package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[][] temp= new double[12][];
        final int[] days = {31, 28, 31, 30, 31, 30,
                            31, 31, 30, 31, 30, 31};
        final int number = 31+28+31+30+31+30+31+31+30+31+30+31;
        double num = 0;
        double rangeMin = 1;
        double rangeMax=30;
        Random r = new Random();

        for (int i=0;i<12;i++){
            temp[i] = new double[days[i]];
            for (int j=0;j<days[i];j++){
                temp[i][j] = (r.nextDouble()*(rangeMax-rangeMin))+rangeMin;
                System.out.format("%.2f\t",temp[i][j]);
                num += temp[i][j];
            }
            System.out.println();
        }

        System.out.printf("%.2f",num/number);
    }
}
