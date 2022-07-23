package com.koose.Day2;

public class NonString {

    //String is not a primitive type but a class Type
    public static void main(String [] args){
        char s = 'k';
        String o = "Bra";
        String p = "Koose";
        String s3 = o + " "+ p;

        s3 = s3.toUpperCase();

        String k = "This programs says : \"Hello Koose\"";

        System.out.println(k);

        System.out.println(s3.replace('S', '$') );
        System.out.println(s3);
    }
}
