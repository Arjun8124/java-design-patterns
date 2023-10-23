package com.company;
import java.util.Scanner;
public class java_determinant_calculator {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int [][]determinant=new int[3][3];
        for (int i=0;i<3;i++){
            determinant[0][i]= read.nextInt();
        }
        for (int j=0;j<3;j++){
            determinant[1][j]= read.nextInt();
        }
        for(int k=0;k<3;k++){
            determinant[2][k]=read.nextInt();
        }
        int formula=determinant[0][0]*((determinant[1][1]*determinant[2][2])-(determinant[1][2]*determinant[2][1]))-determinant[1][0]*((determinant[0][1]*determinant[2][2])-(determinant[0][2]*determinant[2][1]))+determinant[2][0]*((determinant[0][1]*determinant[1][2])-(determinant[0][2]*determinant[1][1]));
        System.out.println("Your determinant is:-");
        System.out.println(formula);

    }
}

