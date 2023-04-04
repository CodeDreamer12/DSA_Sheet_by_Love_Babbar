class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        int ans=arr[k-1];
        return ans;
        
    } 
}
