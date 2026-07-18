public class maxmin {
    public int solve(int[] A) {
        int min=A[0];
        int max=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]<min)    min=A[i];
            if(A[i]>max)    max=A[i];    
        }
        int ans= min+max;
        return ans;
    }
}

//Time complexity : O(n)
