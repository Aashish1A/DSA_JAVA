import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeHands {

    static int[] suitOrder = new int[5];

    private static int cardVal(String card) {
        switch (card) {
            case "A": return 1;
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
            default: return Integer.parseInt(card);
        }
    }
    
    private static void sortHand(List<int[]> cards) {
        cards.sort((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return suitOrder[a[1]] - suitOrder[b[1]];
        });
    }
    
    private static String playMatch(List<int[]> p1, List<int[]> p2) {
        // Game logic
        
        return "TIE";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        
        List<int[]> player1 = new ArrayList<>();
        List<int[]> player2 = new ArrayList<>();
        
        // Read all cards
        for (int idx = 0; idx < total; idx++) {
            String card1 = sc.next();
            int suit1 = sc.nextInt();
            String card2 = sc.next();
            int suit2 = sc.nextInt();
            
            player1.add(new int[]{cardVal(card1), suit1});
            player2.add(new int[]{cardVal(card2), suit2});
        }
        
        // Read priorities
        for (int j = 1; j <= 4; j++) {
            int s = sc.nextInt();
            suitOrder[s] = j;
        }
        
        sortHand(player1);
        sortHand(player2);
        
        String result = playMatch(player1, player2);
        System.out.print(result);
        
        sc.close();
    }
}