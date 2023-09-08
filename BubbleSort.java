//program for bubble sort
import java.io.*;
import java.util.*;

public class BubbleSort
{
	public void sort(int[] A) {
	    boolean isSorted;
	    for(var i=0; i<A.length; i++) {
	        isSorted = true;
	        for(var j=1; j<A.length -i; j++) {
	            if(A[j] <= A[j-1]){
	                swap(A, j, j-1);
	                isSorted = false;
	            }
	        }
	        if(isSorted)
	            return;
	    }
	}
	
	public void swap(int[] A,int i,int j){
	    var temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] num = {7,3,1,4,6,2,3};
		var sorter = new BubbleSort();
		sorter.sort(num);
		System.out.println(Arrays.toString(num));
	}
}

//output: {1, 2, 3, 3, 4, 6, 7}
