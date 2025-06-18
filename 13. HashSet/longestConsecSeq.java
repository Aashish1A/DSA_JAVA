import java.util.HashSet;

public class longestConsecSeq {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        int maxStreak = 0;

        for (int num : nums)
            st.add(num);
        for (int num : st) {
            if (!st.contains(num - 1)) { // num is starting point of sequence
                int currNum = num; // 1
                int currStreak = 1; // length of current consecutive sequence
                while (st.contains(currNum + 1)) {
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 5, 6, 3, 1, 7, 8, 4 };
        System.out.println(longestConsecutive(nums));
    }
}
