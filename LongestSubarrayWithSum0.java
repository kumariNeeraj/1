public class Solution {
    public int solve(int[] A) 
    {
        int n=A.length;
        HashSet<Long> h=new HashSet();
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=A[i];
            if(h.contains(sum) || sum==0)
            return 1;
            h.add(sum);
        }
        return 0;
    }
}
