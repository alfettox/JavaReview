public class Main {
    public static void main(String[] args) {
        String[][] grid = {
                {"1", "1", "1", "1", "0"},
                {"1", "1", "0", "1", "0"},
                {"1", "1", "0", "0", "0"},
                {"0", "0", "0", "0", "1"}
        };

        String[][] grid2 = {
                {"1", "1", "1", "1", "0", "1", "1", "1", "1", "0"},
                {"1", "1", "0", "1", "1", "0", "0", "1", "1", "0"},
                {"1", "1", "0", "0", "0", "1", "1", "1", "0", "0"},
                {"0", "0", "0", "0", "0", "0", "0", "0", "1", "1"}
        };

        System.out.println(numberOfIslands(grid));
        System.out.println(numberOfIslands(grid2));
    }

    private static int numberOfIslands(String[][] grid) {
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == "1") {
                    counter++;
                    searchNextTo(grid, i, j);
                }
            }

        }

        return counter;
    }

    private static void searchNextTo(String[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length &&
            j >= 0 && j < grid[i].length &&
            grid[i][j].equals("1")) {

            grid[i][j] = "0";
                searchNextTo(grid, i - 1, j);
                searchNextTo(grid, i, j + 1);
                searchNextTo(grid, i + 1, j);
                searchNextTo(grid, i, j - 1);

            }
    }
}

