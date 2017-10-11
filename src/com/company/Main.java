package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//
        // package com.company;


                Scanner keyboard = new Scanner (System.in);
                System.out.println("Enter a Number..: ");
                int i =keyboard.nextInt();
                int counter=1;
                while (counter <=i){
                    System.out.print ("["+counter+"]"+" ");
                    counter++;
                }

            }

        }

        // write your code here
