public class convert2Binary {
    public static void main(String[] args) {
        int n = 13;
        String res = "";
        while(n!=1){
            if(n%2==1){
                res += "1";
            }else{
                res += "0";
            }
            n = n/2;
        }
        res += "1";
        StringBuilder sb = new StringBuilder(res);
        System.out.println(sb.reverse().toString());
    }
}