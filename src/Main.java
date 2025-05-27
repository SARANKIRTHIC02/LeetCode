import java.util.*;

import static javax.swing.UIManager.get;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      int[] values = {8,1,5,2,6};
      int ind = 0;
      int currMax = values[0];
        int answer= 0;
      for(int i = 1; i < values.length; i++){
          answer = Math.max(answer, values[ind]+values[i]+(ind-i));

          if(values[i] + i >currMax){
              currMax = values[i]+i;
              ind = i;
          }

      }
        System.out.println(answer);
        // return answer;

    }
}