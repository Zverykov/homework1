package ru.geek.J1.l1;

public class DZ1 {
    private static int srav(int x, int y){
        int a = x+y;
        int b;
        if (a >= 10 && a <= 20) {
            b = 1;
        } else {
            b = 0;
        }
return b;
    }
    public static void main(String [] arg){
    int c = srav(10,10);
System.out.print(c);
    }


}
