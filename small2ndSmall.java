//Find the smallest and second smallest number in the array!
public class small2ndSmall {
    static void small(int arr[]){
        int len=arr.length;
        int sm=Integer.MAX_VALUE; int secsm=Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            if(arr[i]<sm){
                secsm=sm;
                sm=arr[i];
            }
            else if(arr[i]<secsm && arr[i]!=sm)
            secsm=arr[i];
            
        }
        if(secsm==Integer.MAX_VALUE)
        System.out.println("No Second small");
        else
        System.out.println("First smallest: "+sm+" Second Smalles: "+secsm);
    }
    public static void main(String  args[]){
        int arr[]={10,2,1,21,23,40,50};
        small(arr);
    }
}
