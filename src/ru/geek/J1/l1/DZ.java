package ru.geek.J1.l1;

public class DZ {

    private static float formula(int a, int b, int c, int d) {
        return a*(b+(c/(float)d));
    }

    public static void main(String [] args){
     float i = formula(1,6, 7,11);

        System.out.print(i);

    }


}
