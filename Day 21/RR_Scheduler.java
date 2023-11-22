import java.util.LinkedList;
import java.util.Queue;

class Main{
    static void roundRobin(int processes[], int n, int bt[], int quantum) {
        Queue<Integer> queue = new LinkedList<>();
        int[] remainingTime = new int[n];

        for (int i = 0; i < n; i++) {
            remainingTime[i] = bt[i];
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            int process = queue.poll();
            
            if (remainingTime[process] <= quantum) {
                System.out.println("Process " + process + " completed in " + remainingTime[process] + " units.");
                remainingTime[process] = 0;
            } else {
                System.out.println("Process " + process + " executed for " + quantum + " units.");
                remainingTime[process] -= quantum;
            }
            if (remainingTime[process] > 0) {
                queue.add(process);
            }
        }
    }

    public static void main(String args[]) {
        int processes[] = {0, 1, 2, 3};
        int n = processes.length;
        int burstTime[] = {10, 5, 8, 2};
        int quantum = 2;

        roundRobin(processes, n, burstTime, quantum);
    }
}
