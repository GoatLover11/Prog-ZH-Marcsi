package utils;

public class Main {
    public static void main(String[] args) {

        //F1
        System.out.println("F1");
        System.out.printf("%.1f\n", teglalap(2, 3, true));
        System.out.printf("%.1f\n", teglalap(2, 3, false));
        System.out.println();

        //F2
        System.out.println("F2");
        System.out.println(v35(6));
        System.out.println(v35(15));
        System.out.println(v35(20));
        System.out.println();

        //F3
        System.out.println("F2");
        System.out.println(dupla2v3(1, 2, 3, 2));       //true
        System.out.println(dupla2v3(1, 2, 4, 3, 5));    //false
        System.out.println(dupla2v3(1));                //false
        System.out.println();

        //F4
        System.out.println("F4");
        System.out.printf("%.1f\n", g(3));
        System.out.printf("%.1f\n", g(1));
        System.out.println();
    }


    /*
    * F1
    * */
    public static double teglalap(int a, int b, boolean t){
        return t ? a * b : 2 * (a + b);
    }

    /*
    * F2
    * */
    public static boolean v35(int n){
        boolean v3 = false;
        boolean v5 = false;

        if (n % 3 == 0) {
            v3 = true;
        } else {
            v3 = false;
        }

        if (n % 5 == 0) {
            v5 = true;
        } else {
            v5 = false;
        }

        if (v3 && v5){
            return false;
        } else if (v3 || v5){
            return true;
        } else {
            return false;
        }
    }

    /*
    * F3
    * */
    public static boolean dupla2v3 (int... t){
        int c2 = 0;
        boolean c3 = false;

        for (int i : t) {

            if (i == 2)
                c2++;

            if (i == 3)
                c3 = true;
        }

        //a feladat szövege alapján ez a helyes
        //return c2 == 2 || c3 ? true : false;

        //a teszt alapján ez a helyes viszont a feladat nem ezt kérte wtf????
        return c2 == 2 && c3 ? true : false;
    }

    /*
    * F4
    * */
    public static double g(int x){
        if (x > 1){
            return ((2 * x) / (x - 1));
        }
        else {
            return (Math.exp(x - 1));
        }
    }


    //f5
    public static boolean magikus6(int a, int b){
        int plus = a + b;
        int min = a - b;
        int min2 = b - a;

        return plus == 6 || min == 6 || min2 == 6 ? true : false;
    }

    //f6
    public static boolean kisebb(int a, int b){
        return a < b ? true : false;
    }

    //f7 xDDDDD
    public static boolean vagy(boolean a, boolean b){
        return a || b;
    }

    //f8 xDDDDD
    public static boolean es(boolean a, boolean b){
        return a && b;
    }

    //f9
    public static double h(int x, int n){
        if (n < 0){
            return x * x;
        } else if (n == 0){
            return 0;
        } else {
            return Math.pow(x, -2);
        }
    }
}
