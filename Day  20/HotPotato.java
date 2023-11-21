import java.util.*;
public class Main
{
    static void HotPotato(Queue<String> player,int pass){
        while(player.size()>1){
            for(int i=0;i<pass-1;i++){
                String Current=player.poll();
                player.offer(Current);
            }
            System.out.println(player.poll());
        }
    }
	public static void main(String[] args) {
		Queue<String> player=new LinkedList<>();
		player.offer("Player 1");
		player.offer("Player 2");
		player.offer("Player 3");
		player.offer("Player 4");
		player.offer("Player 5");
		int pass=3;
		HotPotato(player,pass);
		
	}
}
