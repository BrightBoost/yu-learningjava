package com.pluralsight;

public class FunWithArrays {

    public static void main(String[] args) {
        int[] nums = getNumbers();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            nums[i] = 5;
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            nums[i] = 5;
        }
        System.out.println();

        int[] nums2 = getNumbers();
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
    }

    public static int[] getNumbers() {
        int[] nums = {63, 65, 60, 53, 58, 37, 35, 31};
        return nums;
    }

}
