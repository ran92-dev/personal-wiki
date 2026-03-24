package Arrays.Problems;
/*
Given: A 2D array of size N * M where N is no of Rows and M is no of columns
       Each row and each column is sorted in non-decreasing order. 
       But its followed to individual row and column only.
Target: We need to find if target element exist or not in mat.

BRUTE FORCE: iterate n*m 2D array and check if each element is equal to target element or not. 
            Time: O(n2) worst case time complexity where n=m O(n2)
            Space: O(1) : why? because we are just traversing the 2D array.

BETTER APPROCH: Tries to get time complexity of O(logM)
                or O(n)?
                How to utilize sorted rows and columns ? 
                Basically we need to traverse each row : and if we get an element which is greter then target
                we skip that row.
                Switch to next row.

USe a loop to select each row , 
for each row use binary search to find if target is present, if yes returnt true.
elese check next row
Time (N*logM) : Time complexity of binary search is O(logN where N  is no of items here M column)

Optimal Approch: Start from 0th row and mth column 
                Check if its >target then we can decreament colm by 1.
                if its <target that means we can increament row by 1
                we neeed to do this whiel i=0;j=m-1 till i<n and j>=0;
                if target not found return 0;
                Time: )(N+M) becase at most we need to traverse N+ M elements

                
            */

public class SearchInRowColumnSortedMatrix {
    


    public boolean searchTarget(int[][] mat,int target){
            int i=0;
            int j= mat[i].length-1;
            while( i <mat.length && j>=0 )
            {
                if(mat[i][j]==target){
                    System.out.println("Found target at i: "+i +" j: "+ j );
                    return true;
                }
                if( mat[i][j]>target){
                    j--;
                }
                else {
                    i++;
                }
            }
            return false;
    }
    public static void main(String [] args){
            /**
             * Create a 2D Array
             */
            int [][] twoDArray= {{1,2,3,4},{2,3,5,6},{1,3,5,10}};
            int target =10;

            for( int i=0;i<twoDArray.length;i++){
                for ( int j=0;j<twoDArray[i].length;j++){
                    System.out.print(twoDArray[i][j] +" ");
                }
                System.out.println("");
            }

            SearchInRowColumnSortedMatrix search=new SearchInRowColumnSortedMatrix();
            boolean result = search.searchTarget(twoDArray,target);
            System.out.println("Found target?"+ result);
    }   
}
