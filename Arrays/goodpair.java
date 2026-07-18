public class goodpair {
    public int solve(int[] A, int B) {
        for(int i=0;i<=A.length-1;i++){
            for(int j=1;j<=i;j++){
                if(i!=j && (A[i]+A[j] == B)){
                    return 1;
                }
            }
        }
        return 0;
    }
     public static void main(String[] args) {
        goodpair gp = new goodpair();

        int[] A = {1, 2, 3, 4};
        int B = 7;

        int result = gp.solve(A, B);

        if (result == 1) {
            System.out.println("Good Pair Exists");
        } else {
            System.out.println("Good Pair Does Not Exist");
        }
    }
}


//Time complexity : O(nlogn)