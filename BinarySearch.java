public class BinarySearch {
    int bSearch(int arr[], int key){
        int leftP= 0, rightP=arr.length-1;
        while(leftP<=rightP){
            int mid=(rightP+leftP)/2;
            if(arr[mid]==key)
                return mid;
            if(arr[rightP]>arr[mid])
                leftP=mid+1;
            else
                rightP=mid-1;
        }
        return -1;
    }
    public static void main(String args[]){
        BinarySearch ob=new BinarySearch();
        int arr[]={1,3,4,6,10,12,13,18,20};
        int key=10;
        int result=ob.bSearch(arr,key);
        if(result==-1)
            System.out.println("The key is not found in the array!");
        
        else
            System.out.println("The Element is found at "+ result);
        
    }
}
