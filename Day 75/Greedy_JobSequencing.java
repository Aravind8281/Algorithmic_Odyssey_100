import java.util.*;

class Main {
    char id;
    int deadline, profit;

    public Main() {}

    public Main(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
    void printJobScheduling(ArrayList<Main> arr, int t) {
        int n = arr.size();
        Collections.sort(arr, (a, b) -> b.profit - a.profit);

        boolean result[] = new boolean[t];
        char job[] = new char[t];

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(t - 1, arr.get(i).deadline - 1); j >= 0; j--) {
                if (result[j] == false) {
                    result[j] = true;
                    job[j] = arr.get(i).id;
                    break;
                }
            }
        }

        for (char jb : job)
            System.out.print(jb + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        ArrayList<Main> arr = new ArrayList<Main>();
        arr.add(new Main('a', 2, 100));
        arr.add(new Main('b', 1, 19));
        arr.add(new Main('c', 2, 27));
        arr.add(new Main('d', 1, 25));
        arr.add(new Main('e', 3, 15));

        Main job = new Main();
        job.printJobScheduling(arr, 3);
    }
}
