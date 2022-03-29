package com.company.Sorting;

public class ContainDiplicate {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,1,1};
        System.out.println(Duplicate(arr));

    }
    static boolean Duplicate(int [] nums)
    {

      for(int i=0;i< nums.length; i++)
      {
          int count =0;
          for(int j=0; j< nums.length; j++)
          {
              if(nums[i] == nums[j])
              {
                  count ++;
              }
          }
          if(count >= 2)
          {
              return true;
          }
      }
      return false;
    }
}
