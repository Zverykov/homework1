package ru.geek.J1.l1;

import java.util.Scanner;


public class year {

    private static String god (int x) {
        String b;
        if (x % 4 == 0 && x % 100 > 0){
            b = "Весокостный год";
        }
        else{
            b = "Не весокостный год";
        }
        return (b);
    }
        public static void main (String[]arg){

int x = 1604;



 String a = god(x);
 System.out.println(a);
        }
    }