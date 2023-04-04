class Solution
{
   public:
    int findSum(int A[], int N)
    {
       int maxN=INT_MIN;
       int minN=INT_MAX;
       for(int i=0; i<N; i++){
           maxN=max(maxN,A[i]);
           minN=min(minN,A[i]);
       }
       return maxN+minN;
    }

};
