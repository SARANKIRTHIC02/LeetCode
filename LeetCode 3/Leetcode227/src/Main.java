import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = " 3+5 / 2 ";
        s = s.trim();
        int prev ;
        int sum=0;
        int one=0;
        int two=0;
        char ope =' ';
        boolean flag = false;
        Stack<Character> stack = new Stack<Character>();

       for (int i = 0; i < s.length(); i++) {
           stack.push(s.charAt(i));
        }

       while (!stack.isEmpty()) {
          if(stack.peek() == ' '){
              stack.pop();
          }
          else if(Character.isDigit(stack.peek()) && flag==false){
              one = Integer.parseInt(String.valueOf(stack.pop()));
              flag = true;
          }
          else if(Character.isDigit(stack.peek()) && flag == true ){
              two = Integer.parseInt(String.valueOf(stack.pop()));
              sum += helper(one,two,ope);
              one= 0;
              two = 0;
              ope = ' ';

          } else {
               ope = stack.pop();

          }
       }
        System.out.println(sum);


    }
    public static int helper (int a, int b, char toDo)
    {
        switch (toDo){
            case '+':
                return a + b;
                case '-':
                    return a - b;
                    case '*':
                        return a * b;
                        case '/':
                            return b / a;
                            default:
                                return 0;
        }

    }
}