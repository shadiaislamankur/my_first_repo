package com.example.lib;

public class MyClass4 {
    public  static void main(String[] args){
        //Arithmetic Operators: + - * / %
        System.out.println(1+8);
        System.out.println(35%4);
        System.out.println(8*3);
        System.out.println(9-6);

        //Comparison Operators: ==, != , > , < , >=,<=

        int x= 10;
        System.out.println(x==7);
        System.out.println(x !=9999);
        System.out.println(x>10);
        System.out.println(x<10);
        System.out.println(x>10);
        System.out.println(x<=10);
        System.out.println(x>=10);

        // Logical Operators : && , || , !

        boolean isSunny=true;
        boolean needUmbrella = false;

        boolean shouldGoOutside = isSunny && !needUmbrella;
        boolean canPlayGames = isSunny || needUmbrella;

        System.out.println(shouldGoOutside+","+shouldGoOutside);






    }
}
