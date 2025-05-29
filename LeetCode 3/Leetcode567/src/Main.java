import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidboaoo";

        int[] first = new int [26];
        int[] second = new int[26];

        for(int i=0;i<s1.length();i++)
        {
            first[s1.charAt(i)-'a']++;
            second[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(first,second)) {
            System.out.println(true);
        }

        int start=0;
        int end = s1.length();

        while(end<s2.length())
        {
            second[s2.charAt(start)-'a']--;
            second[s2.charAt(end)-'a']++;

            if(Arrays.equals(first,second)) {
                System.out.println(true);
                break;
            }
            end++;
            start++;
        }

        System.out.println(false);    }
}