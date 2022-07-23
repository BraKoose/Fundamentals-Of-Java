package com.koose.Day3;

import java.awt.*;
import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your character now");
        int input = reader.nextInt();

        if(input > 10)
        {
            System.out.println("MORE");
        }
        if(input <= 10){
            System.out.println("LESS");
        }
        System.out.println(input);

    }
}
