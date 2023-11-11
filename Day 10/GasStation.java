public class Main
{
    public static int canComplete(int[] gas,int[] cost){
        int total_left=0;
        for(int i=0;i<gas.length;i++){
            total_left=gas[i]-cost[i];
        }
        if(total_left<0)
            return -1;
        int startindex=0;
        int remaining=0;
        for(int i=0;i<gas.length;i++){
            int currentgas=gas[i]+remaining;
            remaining=currentgas-cost[i];
            if(remaining<0){
                remaining=0;
                startindex=i+1;
            }
        }
        return startindex;
    }
	public static void main(String[] args) {
		int[] gas={1,2,3,4,5};
		int[] cost={3,4,5,1,2};
		System.out.print(canComplete(gas,cost));
	}
}
