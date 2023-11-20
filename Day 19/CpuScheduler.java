import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static Stack<String> CpuStack=new Stack<>();
    static void Scheduler(String schedule){
        CpuStack.push(schedule);
    }
    static String executeNextProcess() {
        if (!CpuStack.isEmpty()) {
            return CpuStack.pop();
        } else {
            return "No process to execute.";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Process to Enter : ");
        int n=sc.nextInt();
        System.out.println("Enter Process Name to Execute : ");
        String schedule="";
        for(int i=0;i<n+1;i++){
            schedule=sc.nextLine();
            Scheduler(schedule);
        }
        while(true){
            String nextprocess=executeNextProcess();
            if(nextprocess.equals("No process to execute.")){
                System.out.println("No process to execute.");
                break;
            }
            else{
                System.out.println(nextprocess);
            }
        }
        sc.close();
    }
}
