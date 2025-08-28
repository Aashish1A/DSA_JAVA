public class convert2Decimal {
    public static void main(String[] args) {
        String n = "1101";
        int res = 0;
        int power = 1;
        for(int i=n.length()-1;i>=0;i--){
            if(n.charAt(i)=='1'){
                res += power;
            }
            power *= 2;
        }
        System.out.println(res);
    }
}
