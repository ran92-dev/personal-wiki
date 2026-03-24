package Arrays.Problems;

import java.util.ArrayList;
class PrintAlternates{
    public static ArrayList<Integer> getAlternates(int[] arr){
        ArrayList<Integer> r = new ArrayList<>();
        for ( int i=0;i<arr.length;i++){
            r.add(arr[i]);
            i++;

        }
        return r;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> alternate = getAlternates(arr);
        for(int i : alternate){
            System.out.print(i + " ");
        }

    }
}