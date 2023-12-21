// Count element in array using Recursion
class Main{
    static int Countelement(int arr[],int count){
        if(arr.length==count){
            return count;
        }
        count++;
        return Countelement(arr,count);
    }
    public static void main (String[] args) {
        int[] arr={1,2,3,4,5};
        int count=0;
        System.out.print(Countelement(arr,count));
    }
}
