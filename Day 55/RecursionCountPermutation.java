public class Main {
    static int permutation(String p, String str,int count) {
        if (str.isEmpty()) {
            return count+1;
        }

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            count=permutation(f + str.charAt(0) + s, str.substring(1),count);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print(permutation("", "abc",0));
    }
}
