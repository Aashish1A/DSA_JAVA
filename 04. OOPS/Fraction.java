public class Fraction {

    public static fraction add(fraction f1, fraction f2){
        int num = f1.numerator*f2.denominator + f2.denominator*f2.numerator;
        int denom = f1.denominator * f2.denominator;
        fraction f3 = new fraction(num, denom);
        return f3;
    }

    public static int gcd(int numerator, int denominator){
            int min = Math.min(numerator, denominator);
            for(int i=min; i>=1; i--){
                if(numerator%2==0 && denominator%2==0) return i;
            }
            return min;
    }

    public static class fraction{
        int numerator;
        int denominator;

        public fraction(int num, int denom){
            this.numerator = num;
            this.denominator = denom;
        }

        public void simplify(){
            int hcf = gcd(numerator,denominator);
            numerator /= hcf;
            denominator /= hcf;
        }
    }




    public static void main(String[] args) {

        fraction f1 = new fraction(30, 6);
        f1.simplify();
        System.out.println(f1.numerator + "/" + f1.denominator);

        fraction f2 = new fraction(12, 4);
        f2.simplify();
        System.out.println(f2.numerator + "/" + f2.denominator);

        fraction f3 = add(f1,f2);
        System.out.println(f3.numerator + "/" + f3.denominator);

    }
}
