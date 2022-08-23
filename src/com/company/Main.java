package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n <= 1000){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
