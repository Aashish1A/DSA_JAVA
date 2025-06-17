package Practice_Questions;

import java.util.HashMap;

public class ValidAnagram {

    static HashMap<Character, Integer> makeFreMap(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            }else{
                mp.put(ch, mp.get(ch) + 1);
            }
        }
        return mp;
    }

    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map1  = makeFreMap(s1);
        HashMap<Character, Integer> map2  = makeFreMap(s2);
        return map1.equals(map2);
    }
}
