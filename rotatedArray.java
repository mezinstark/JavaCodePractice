public class rotatedArray {
    int search(int arr[],int key){
        int l=0,r=arr.length-1;
        int mid=0;
        while (l<=r){
            mid=(l+r)/2;
            if(arr[mid]==key)
                return mid;
            if(key<arr[l])
                l=mid+1;
            if(key>arr[r])
                r=mid+1;
            
                if(key<arr[mid])
                    r=mid-1;
                else
                    l=mid+1;
            
               
        }
        return -1;
        
    }
    public static void main(String args[]){
        rotatedArray ob=new rotatedArray();
        int arr[]={5,6,7,8,9,10,1,2,3};
        int key=10;
        int result=ob.search(arr, key);
        if(result==-1)
            System.out.println("Key not found");
        else
            System.out.println("key found at "+ result);
    }
}
