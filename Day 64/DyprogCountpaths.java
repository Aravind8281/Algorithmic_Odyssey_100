import java.util.*;

public class Main {
    static int countPaths(List<List<String>> grid) {
        return countPathsHelper(0, 0, grid, new HashMap<>());
    }

    static int countPathsHelper(int r, int c, List<List<String>> grid, HashMap<List<Integer>, Integer> memo) {
        if (r == grid.size() || c == grid.get(0).size()) {
            return 0;
        }
        if ("X".equals(grid.get(r).get(c))) {
            return 0;
        }
        if (r == grid.size() - 1 && c == grid.get(0).size() - 1) {
            return 1;
        }

        List<Integer> pos = List.of(r, c);
        if (memo.containsKey(pos)) {
            return memo.get(pos);
        }

        int paths = countPathsHelper(r + 1, c, grid, memo) + countPathsHelper(r, c + 1, grid, memo);
        memo.put(pos, paths);
        return paths;
    }

    public static void main(String[] args) {
        List<List<String>> grid = new ArrayList<>();
        grid.add(Arrays.asList("0", "0", "0", "0"));
        grid.add(Arrays.asList("0", "X", "0", "0"));
        grid.add(Arrays.asList("0", "0", "0", "0"));
        grid.add(Arrays.asList("0", "0", "0", "0"));

        int result = countPaths(grid);
        System.out.println("Number of paths: " + result);
    }
}
