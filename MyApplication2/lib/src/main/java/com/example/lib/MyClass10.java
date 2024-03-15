package com.example.lib;

public class MyClass10 {
    public static void main(String[] args) {
        //Multi dimentional array: is an array of arrays
        //Syntax
       // dataTypa[][] arrayName = new dataType[rows][columns]

        //3 rows and 3 columns

        int [][] myMatrix = new int[3][3];

        myMatrix[0][0]=1;
        myMatrix[0][1]=2;
        myMatrix[0][2]=3;
        myMatrix[1][0]=4;
        myMatrix[1][1]=5;
        myMatrix[1][2]=6;
        myMatrix[2][0]=7;
        myMatrix[2][1]=8;
        myMatrix[2][2]=9;


        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.println(myMatrix[i][j]);

            }
        }

        int [][] myMatrix2 = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };


        System.out.println();
        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                System.out.println(myMatrix2[i][j]);

            }
        }


    }
}
