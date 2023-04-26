class Solution{
    // Function to count number of ones in the binary array
    // N: size of array
    // arr[]: input array
    public static int countOnes(int arr[], int n){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid==n-1 ||arr[mid]!=arr[mid+1]){
                return mid+1;
            }
            if(arr[mid]==1){
                low=mid+1;
            }
            else{
                if(mid==0||arr[mid]!=arr[mid-1]){
                    return(mid);
                }
                else{
                    high=mid-1;
                }
            }
        }
        return 0;
        
    }
}
