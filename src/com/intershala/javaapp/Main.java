package com.intershala.javaapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();
        int c= scn.nextInt();
        if(a<b){
            if(b<c){
                System.out.println("c is greatest");
            }else{
                System.out.println("b is greatest");
            }
        }else{
            if(a<c){
                System.out.println("c is greatest");
            }else{
                System.out.println("a is greatest");
            }
        }
    }
}
