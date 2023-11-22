import java.util.*;
public class Main
{
    static void FcFs(int[] burst,int[] waiting){
        Queue<Integer> q=new LinkedList<>();
        int turn=0;
        int wait=0;
        System.out.println ("Process"+" Burst"+"  Completion"+" Turn Around"+"  Waiting Time");
        for(int i=0;i<burst.length;i++){
            System.out.print("P"+(i+1)+"       ");
            System.out.print(burst[i]+"        ");
            System.out.print(waiting[i]+"         ");
            q.offer(waiting[i]);
            turn=turn+q.peek();
            System.out.print(turn+"          ");
            System.out.print(Math.abs(turn-waiting[i])+"           ");
            q.poll();
            System.out.println("");
        }
    }
	public static void main(String[] args) {
		int[] burst={0,1,1,1,2,3};
		int[] waiting={9,3,2,4,3,2};
		FcFs(burst,waiting);
	}
}
