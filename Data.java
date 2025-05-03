public class Data {
    public static final int MAX = (int)(Math.random() * Integer.MAX_VALUE);
    private int[][] grid;

    public Data(int rows, int columns) {
        grid = new int[rows][columns];
    }

    public Data(int[][] arr) {
        grid = arr;
    }

    public void repopulate()
    {
        for(int r = 0; r < grid.length; r++)
        {
            for(int c = 0; c < grid[0].length; c++)
            {
                int rand = (int) (Math.random() * MAX) + 1;
                while(rand % 10 != 0 || rand % 100 == 0)
                    rand = (int) (Math.random() * MAX) + 1;

                grid[r][c] = rand;
            }
        }
    }

    public int countIncreasingCols()
    {
        int increasingCols = 0;

        for(int c = 0; c < grid[0].length; c++)
        {
            boolean isIncreasing = true;

            for(int r = 1; r < grid.length; r++)
                if(grid[r-1][c] > grid[r][c])
                    isIncreasing = false;

            if(isIncreasing)
                increasingCols++;
        }

        return increasingCols;
    }
}
