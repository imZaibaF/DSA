public class arrayRotation {
    public int[] solve(int[] A, int B) {
        //B=B%A.length
        B = B % A.length;
    // int n=A.length; //n=arr
        for(int j=1;j<=B;j++){
            int temp=A[A.length-1];
            for(int i=A.length-2;i>=0;i--){
            A[i+1]=A[i];
            }
            A[0]=temp;
         }
         return A;

    }
}

//time complexity : O(n*B)