import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> list = new ArrayList<>();
//      if(p.length() > s.length()) {return list}

        int[] sCounter = new int[26];
        int[] pCounter = new int[26];

        for (int i = 0; i < p.length(); i++) {
            sCounter[s.charAt(i) - 'a']++;
            pCounter[p.charAt(i) - 'a']++;
        }

        if(Arrays.equals(sCounter, pCounter)) {
            list.add(0);
        }

        int start = 0;
        int end = p.length();

        while(end < s.length()) {
            sCounter[s.charAt(start) - 'a']--;
            sCounter[s.charAt(end) - 'a']++;

            if(Arrays.equals(sCounter, pCounter)) {
                list.add(start+1);
            }

            start++;
            end++;
        }

        System.out.println(list);
    }
}