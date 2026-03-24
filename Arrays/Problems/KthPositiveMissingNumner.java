package Arrays.Problems;

public class KthPositiveMissingNumner {
    
// 1,2,3,5,6,8,11,12,13,14,15....
/**TODO:
 * Compute time complexity
 */
    public static void main(String [] args){
        int [] vec={4,7,9,10};
        int no=findKthMissingNo(vec,4);
        System.out.println(no);
    }
    private static int findKthMissingNo(int[] vec, int target) {
        int start =0;
        int end =1;
        int missing_count=vec[start]-1;
        while(end<vec.length){
            missing_count+= vec[end]-vec[start]-1;
            if(target<missing_count && target< vec[start]){
                return target;

            }
            if (target== missing_count ){
                return vec[end]-1;
            }
            else if ( target<missing_count && target>=vec[start]){
                return vec[start]+ ( target-vec[start]+1);
            }
            else{
                start=start+1;
                end=start+1;
            }

        }
        return vec[end-1]+(target-missing_count);
    }
}
