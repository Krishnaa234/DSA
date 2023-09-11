class MergeSort
{
    void merge(int arr[], int l, int m, int r)
    {
        int idx1=l,idx2=m+1,x=0;
        int merged[]=new int[r-l+1];
        while(idx1<=m && idx2<=r){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];                  //add elements from the first part of the array
            }
            else if(arr[idx1]>=arr[idx2]){
                merged[x++]=arr[idx2++];                 //add elements from the second part of the array
            }
        }

        //if elements of any of the array is leftover then any one of the while condtion will occur
        while(idx1<=m){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=r){
            merged[x++]=arr[idx2++];
        }
        
        //store the elements from the sorted array to the original array
        for(int i=0,j=l;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }

    void mergeSort(int arr[], int l, int r)
    {
        if(l>=r){
        //means only a single ele is present
            return;
        }

        int mid=l+(r-l)/2;

        mergeSort(arr,l,mid);

        mergeSort(arr,mid+1,r);

        merge(arr,l,mid,r);

    }
}
