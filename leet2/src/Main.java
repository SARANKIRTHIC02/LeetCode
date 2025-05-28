import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "abbbabaaa";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
            if(stack.isEmpty())   stack.push(s.charAt(i));
            else if(stack.peek() == s.charAt(i))
            {
                stack.pop();
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.get(i));
        }
        String ans = sb.toString();
        sb.setLength(0);
        for (int i=ans.length()-1;i>=0;i--)
        {
            sb.append(ans.charAt(i));
        }

        System.out.println(sb.toString());
        //return sb.toString();

    }
}