public class pair {
    static boolean chkpair(int A[],int size, int x)
    {
        for (int i=0;i<(size-1);i++){
            for (int j=(i+1);j<size;j++){
                if ( A[i]+A[j]==x)
                {
                    System.out.println("Pair with given sum" +x+"is("+A[i]+","+A[j]+")");
                    System.out.println("Pair with given sum" +x+"is("+A[i]+","+A[j]+")");
                    return true;
                }
            }
        }
        return false;

    }
    public static void main (String[] args)
    {
        int A[] = {0,1,9,3,4,7,8};
        int x = 7;
        int size = A.length;
        if (chkpair(A,size,x))
        {
            System.out.println("Valid pairs exists");

        }
        else
        {
            System.out.println("No Valid pair");
        }
    }
}
