package utils;

public class Botond {
    public static void main(String[] args) {

    }

    //F1
    public static int egesz (int a, int b){
        return a + b;
    }

    //F2
    public static double e (int x){
        if (x < 0){
            return Math.pow(x, 3) / 2;
        } else if (x == 0){
            return Math.sin(2 * x);
        } else {
            return 1;
        }
    }

    //F3
    public static double h(int x, int n){
        if (n < 0){
            return x * x;
        } else if (n == 0){
            return 0;
        } else {
            return Math.pow(x, -2);
        }
    }

    //F4
    public static boolean sum2(int... t){
        int c2 = 0;
        for (int i : t) {
            if (i == 2)
                c2++;
        }
        return c2 == 4 ? true : false;
    }

    //f5 xDDDDD
    public static boolean vagy(boolean a, boolean b){
        return a || b;
    }

    //F6
    public static boolean egyformaszamjegy(int a, int b){
        char[] ac = ("" + a).toCharArray();
        char[] bc = ("" + b).toCharArray();
        return ac [0] == bc [0] || ac [0] == bc [1] || ac [1] == bc [0]
                || ac [1] == bc [1] ? true : false;
    }

    //F7
    public static double g(int x){
        if (x > 1){
            return ((2 * x) / (x - 1));
        }
        else {
            return (Math.exp(x - 1));
        }
    }

    //f8 xDDDDD
    public static boolean vagy(int a, int b){
        return a < b;
    }

    //F9
    //f5 xDDDDD
    public static int egysforma(int a, int b, int c){
        int db = 0;

        if (a == b)
            db++;
        
        if (a == c)
            db++;

        if (c == b)
            db++;

        return db;
    }
}
