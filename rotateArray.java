/* My solution to LC problem 189. Rotate Array

Given an array, rotate the array to the right by k steps, where k is non-negative.

Example:
Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]

*/

public class rotateArray {
    public void rotate(int[] nums, int k) {
       
        if (k==0) {
            return;
        }
        k=k%nums.length;
        int[] beginning = new int[k];
        int count=k-1;
        for (int i=nums.length-1; i>=nums.length-k; i--) {
            beginning[count]=nums[i];
            count--;
        }
        
        for (int i=nums.length-1; i>=k; i--) {
            nums[i]= nums[i-k];
        }
        
        for (int i=0; i<k; i++) {
            nums[i]=beginning[i];
        }
    }
}
