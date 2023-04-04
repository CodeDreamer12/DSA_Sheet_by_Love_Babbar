class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        boolean flag=true;
      for(int i=0; i<arr.length; i++){
          if(arr[i]>0){
              flag=false;
              break;
          }
      }
      if(flag){
          Arrays.sort(arr);
          return arr[n-1];
      }
          int currSum=0;
          int maxS=Integer.MIN_VALUE;
          for(int j=0; j<n; j++){
              currSum+=arr[j];
              if(currSum<0){
                  currSum=0;
              }
              maxS=Math.max(maxS,currSum);
          }
          return maxS;
    }
}
