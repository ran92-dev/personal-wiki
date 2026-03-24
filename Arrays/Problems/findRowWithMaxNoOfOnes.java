package Arrays.Problems;

public class findRowWithMaxNoOfOnes {
    /**
     * Given: A 2D matrix of n* m filled with 0,1. Rows are stored in ascending order.
     * Taarget: Find out minimum indexed row with maximum no of one. If no row with atlease 1 0 return -1..
     * If multiple rows with same no of 1s return smallest index.
     * 
     * Approch: Take a max_sum reference initialized with 0.
     * For each row in 2d array sum all of its element Check if sum >max then max=sum and retutrn =i;
     * after travresing all row in the end return i ; 
     * if max remains 0 till last return -1
     * Time : O(n2)
     * 
     * Better: we start with i=0 and j=m-1 , check if mat[i][j]==1? sum+=mat[i][j]: max=maxorsum i++;
    Solution: For each row find 1st 1's index using binary search and counr_1= m-index of binary Sreach returned value.
    Time O(n*logm) 
    */
    
    



}
