package com.example.shuangzhizhen;
//移动零
public class Demo1 {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
    }
}
//public void moveZeroes(int[] nums) {
//    int i=0;
//    for(int j=0;j<nums.length;j++){
//        if(nums[j]!=0){
//            int temp=nums[i];
//            nums[i]=nums[j];
//            nums[j]=temp;
//            i++;
//        }
//    }
//}