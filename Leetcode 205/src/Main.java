import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String s = "badc";
        String t = "baba";

        HashMap<Character, Character > mapOne = new HashMap<>();
        HashMap<Character, Character > mapTwo = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            if(!mapOne.containsKey(s.charAt(i)) && !mapTwo.containsKey(t.charAt(i)))
            {
                mapOne.put(s.charAt(i),t.charAt(i));
                mapTwo.put(t.charAt(i),s.charAt(i));

            }
            else if(mapOne.containsKey(s.charAt(i)) ){

                if(mapOne.get(s.charAt(i))!=t.charAt(i))
                {
                    System.out.println(false);

                }
            }
            else if (mapTwo.containsKey(t.charAt(i))) {
                if ( mapTwo.get(t.charAt(i))!= s.charAt(i))
                {
                    System.out.println(false);
                    break;
                }
            }
        }
        System.out.println(true);
    }
}