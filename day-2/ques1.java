
//https://leetcode.com/problems/find-the-duplicate-number/description/
package day-2;

public class ques1 {
    public int findDuplicates(int[] num) {
        Arrays.sort(nums);
        for (int i = 0; i < arr.length; i++) {
            if (num[i] == num[i + 1]) {
                return -1;

            }
        }

    }

}
