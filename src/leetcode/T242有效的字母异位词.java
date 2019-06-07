package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: Mr.M
 * @Date: 2019-02-25 12:42
 * @Description: https://leetcode-cn.com/problems/valid-anagram/
 **/
public class T242有效的字母异位词 {
    ///////////////////////////////
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char[] as=s.toCharArray();
        char[] ts=t.toCharArray();
        Arrays.sort(as);
        Arrays.sort(ts);
        return Arrays.equals(as,ts);
    }
    public boolean isAnagram2(String s, String t) {
        int[] re1 = new int[26];
        int[] re2 = new int[26];
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        if (s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            re1[a[i]-'a']++;
            re2[b[i]-'a']++;
        }
        for(int i=0;i<re1.length;i++){
            if(re1[i]!=re2[i]){
                return false;
            }
        }
        return true;
    }

        //////////////////////////////
    HashMap<Character,Integer> hm1 = new HashMap<>();
    HashMap<Character,Integer> hm2 = new HashMap<>();
    public boolean isAnagram1(String s, String t) {
        for(Character x : s.toCharArray()){
            if(hm1.containsKey(x)){
                hm1.put(x,hm1.get(x)+1);
            }
            else{
                hm1.put(x,1);
            }
        }
        for(Character x : t.toCharArray()){
            if(hm2.containsKey(x)){
                hm2.put(x,hm2.get(x)+1);
            }
            else{
                hm2.put(x,1);
            }
        }
        return hm1.equals(hm2);
    }
}
