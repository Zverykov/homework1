package ru.geek.J1.l1;

public class poloshit {

    private static String chislo (int x){
        String a;
        if (x>=0) {
            a = "Положительное";
        }
        else {
            a = "Отрицатеьное";
        }
        return a;
    }

    public static void main (String[] arg){
        String b = chislo(-4);
                System.out.println(b);

    }


}
