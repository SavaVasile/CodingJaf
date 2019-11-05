package AnagramsEx;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(areAnagrams("SILENT","LISTEN"));
    }

    static boolean areAnagrams(String s1, String s2){
        if (s1.length() !=s2.length()){
            return false;
        }


        char [ ] charArray1 =  s1.toCharArray();
        char [ ] charArray2 =  s2.toCharArray();

        HashMap<Character,Integer> map1 = new HashMap<>();
        //HashMap<Character,Integer> map2 = new HashMap<>();



        for (char c: charArray1 ){
            if (map1.containsKey(c)){
                map1.put(c,map1.get(c)+1);
            }else {
                map1.put(c,1);
            }
        }

        for (int i = 0; i < charArray2.length;i++) {
            if (map1.containsKey(charArray2[i])) {
                map1.put(charArray2[i], map1.get(charArray2[i] - 1));
            } else if (map1.get(charArray2[i])==0){
                map1.remove(charArray2[i]);
            }
        }
        return map1.isEmpty();

    }
}
