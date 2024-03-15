package com.example.lib;

public class MyClass9 {
    public static void main(String[] args) {
        //dataType[] arrayName = new dataType[arraySize]
        int[] numbersArray= new int[5];

        //storing values in the array
        numbersArray[0] =10;
        numbersArray[1] =20;
        numbersArray[2] =30;
        numbersArray[3] =40;
        numbersArray[4] =50;

        for(int i=0;i<5;i++){
            System.out.println(numbersArray[i]);


        }

        System.out.println("Element at index 0 is: "+numbersArray[0]);
        
        //for-each
        for (int num : numbersArray) {
            System.out.println(num);
            
        }

    }

}
