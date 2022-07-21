package com.koose.Day1;

public class Variables {

    public static void main(String[] args){
        int P;
        int K;
        int O;
        int X;
        int Y;
        long H;

        P = 89;
        K = 3;
        O = 8;

        //int Larger this value will round to th enext smallest int.
        X = 2147483647;
        X++;
        Y = 3;

        //Mathematical accurate results is using  the right data type
        H = 2147483647;
        H++;



        System.out.println(X);
        System.out.println(P + O);
        System.out.println(K - O);
        System.out.println(P * K);
        System.out.println(X/Y);



    }
}
