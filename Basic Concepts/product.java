// Product of two numbers using users input. 

import java.util.Scanner;

public class product {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int product = a * b;

        System.out.println(product);
    }
}
