package com.example.second_proyect_prime_numbers;

import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter up to what number you want to generate");
        int limitnumber= scanner.nextInt();

        int acumulator = 0;
        for(int i= 1 ; i<= limitnumber; i++){
         acumulator = 0;
            for (int j = 1; j <= i; j++){
            double result =(double) i/j;
            int result2 = i/j;
            double analysis =  result - result2;
                 if (analysis == 0)
                    {
                    acumulator = acumulator +1;
                        }
                }
            if (acumulator == 2)
                {
            System.out.println(i + "is prime number");
                }
        }
            scanner.close();
    }
}