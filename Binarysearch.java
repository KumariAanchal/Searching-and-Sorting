public class Binarysearch {
    public static int bsearch(int arr[], int x){
        int n=arr.length;
        int low=0, high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        int x=20;
        System.out.println(bsearch(arr, x));
    }
}
