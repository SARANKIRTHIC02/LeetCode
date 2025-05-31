//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {6,5,4,3,2,3,2};
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle - 1] < nums[middle] && nums[middle + 1] < nums[middle]) {
                System.out.println(middle);
                break;
            } else if (nums[middle - 1] > nums[middle]) {
                right = middle;
            } else if (nums[middle + 1] > nums[middle]) {
                left = middle +1;
            }
        }
        System.out.println("END");
    }

}