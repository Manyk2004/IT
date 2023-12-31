//практика №1
public class Main {
    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(8));
        System.out.println();

        System.out.println(fitCalc(15, 1));
        System.out.println(fitCalc(24, 2));
        System.out.println(fitCalc(41, 3));
        System.out.println();

        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(4, 1, 4));
        System.out.println();

        System.out.println(triangleType(5, 5, 5));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(triangleType(3, 4, 5));
        System.out.println(triangleType(5, 1, 1));
        System.out.println();

        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(ternaryEvaluation(1, 11));
        System.out.println(ternaryEvaluation(5, 9));
        System.out.println();

        System.out.println(howManyItems(22, 1.4f, 2));
        System.out.println(howManyItems(45, 1.8f, 1.9f));
        System.out.println(howManyItems(100, 2, 2));
        System.out.println();

        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
        System.out.println();

        System.out.println(gcd(48, 18));
        System.out.println(gcd(52, 8));
        System.out.println(gcd(259, 28));
        System.out.println();

        System.out.println(ticketSailer(70, 1500));
        System.out.println(ticketSailer(24, 950));
        System.out.println(ticketSailer(53, 1250));
        System.out.println();

        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));
        System.out.println();
    }
    public static double convert(int x){
        return x * 3.785d;
    }

    public static int fitCalc(int x, int y){
        return x * y;
    }

    public static int containers(int x, int y, int w){
        return x * 20 + y * 50 + w * 100;
    }

    public static String triangleType(int x, int y, int w){
        if ((x + y >= w) && (x + w >= y) && (y + w >= x)){
            if ((x == y) && (x == w)){
                return "equilateral";
            }
            else if ((x == y) || (x == w) || (y == w)){
                return "isosceles";
            }
            else {
                return "different-sided";
            }
        }
        return "not a triangle";
    }
    public static int ternaryEvaluation(int x, int y){
        int a = x > y ? x : y;
        return a;
    }

    public static double howManyItems(float x, float y, float w){
        return Math.floor(x / (y * w * 2));
    }

    public static int factorial(int x){
        int mult = 1;
        while (x != 1){
            mult *= x;
            x --;
        }
        return mult;
    }

    public static int gcd(int x, int y){
        int gcd = 1;
        for (int i = 2; i < Math.min(x, y); i++){
            if ((x % i == 0) && (y % i == 0)){
                gcd = i;
            }
        }
        return gcd;
    }

    public static int ticketSailer(int x, int y){
        return x * y / 25 * 18;
    }

    public static double tables(int x, int y){
        double a = 0;
        double n = x - (y * 2);
        if (n > 0){
            a = Math.ceil(n / 2);
        }
        return a;
    }
}