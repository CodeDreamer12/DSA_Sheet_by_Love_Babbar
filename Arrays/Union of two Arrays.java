class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
       int arr[]=new int[n+m];
       int j=0;
       int k=0;
       for(int i=0; i<arr.length; i++){
           if(j<n){
           arr[i]=a[j];
           j++;
           }
           else{
               arr[i]=b[k];
               k++;
           }
       }
       Arrays.sort(arr);
       int count=1;
       for(int i=0; i<arr.length-1; i++){
           if(arr[i] != arr[i+1])
           count++;
       }
       return count;
    }
}
