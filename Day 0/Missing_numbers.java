public class Main
{
    static int maximum(int[] array){
        int n=array.length;
        int max=array[0];
        for(int i=0;i<n;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    static void Frequency(int[] array){
        int max=maximum(array);
        int[] B=new int[max+1];
        for(int i=0;i<max+1;i++){ B[i]=0;}
        for(int i=0;i<array.length-1;i++){
            int k=array[i];
            B[k]++;
        }
        for(int i=0;i<max+1;i++){
            if(B[i]==0){
                System.out.println(i+"-->"+B[i]);
            }
        }
        
    }
	public static void main(String[] args) {
		int[] array = {5, 2, 7, 8, 2, 3, 4, 2, 9};
		Frequency(array);
	}
}
