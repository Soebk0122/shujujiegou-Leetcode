package com.example.jiqiao;
//169. 多数元素
public class Demo2 {
    public int majorityElement(int[] nums) {
        int ans=0;
        int hp=0;
        for(int x:nums){
            if(hp==0){
                ans=x;
                hp=1;
            }else{
                hp+=x==ans?1:-1;
            }
        }
        return ans;
    }

}
