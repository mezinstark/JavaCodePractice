//Simple Bubble sort algorithm!
public class BubbleSort01 {
    void bubblesort(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    void printArray(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        BubbleSort01 ob = new BubbleSort01();
        int arr[]={5,9,11,1,2,34,22,90,112,79};
        ob.bubblesort(arr);
        ob.printArray(arr);

    }
}
