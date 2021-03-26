class missingno{
    //missing number in an array which is arranged in a sequence.
    //sum of all number - sum of given number=missing no.
    int missing(int arr[],int size){
        int total=(size+1)*(size+2)/2;
        for (int i=0;i<size;i++){
            total-=arr[i];
        }
        return total;    
    }
    public static void main(String args[]){
        missingno ob= new missingno();
        int arr[]={1,2,3,4,6,7};
        int length=arr.length-1;
        int missing_no=ob.missing(arr,length);
        System.out.println("Missing no would be: "+ missing_no);
    }
}