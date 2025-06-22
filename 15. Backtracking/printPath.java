public class printPath {

    private static void print(int sr, int sc, int er, int ec, String s){
        if(sr > er || sc > ec) return;
        if(sr==er && sc == ec){
            System.out.println(s);
            return;
        }
        // go rightWays
        print(sr, sc+1, er, ec, s+"R");
        // go downWays
        print(sr+1, sc, er, ec, s+"D");
    }
    
    public static void main(String[] args) {
        int rows = 2;
        int columns = 3;
        print(1,1,rows,columns, "");
    }
}
