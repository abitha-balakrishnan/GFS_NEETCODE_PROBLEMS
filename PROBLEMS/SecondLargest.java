class Solution {
    public int getSecondLargest(int[] arr) {
      int large=Integer.MIN_VALUE;
      int secLarge=Integer.MIN_VALUE;
      for(int num:arr){
          if(num>large) {
              secLarge=large;
              large=num;
          }
          else if(num<large&& num>secLarge) secLarge=num;
      }
      if(secLarge==Integer.MIN_VALUE) return -1;
        return secLarge;
    }
}