public class Data {
    public static final int MAX = (int)(Math.random() * Integer.MAX_VALUE);
    private int[][] grid;

    public Data (int rows, int columns)
    {
        grid = new int[rows][columns];
    }

    public Data (int[][]arr)
    {
        grid = arr;
    }

    public void repopulate(){
        for (int row = 0; row < grid.length; row++){
            for(int col = 0; row < grid[0].length; col++)
            {
                int val = 0;
                while(val % 10 != 0 || val % 100 == 0)
                {
                    val = (int)(Math.random() * MAX + 1);
                }
                grid[row][col] = val;
            }
        }

    }


    public int countIncreasingCols()
    {
        int count = 0;
        for(int col = 0; col < grid[0].length; col++)
        {
            int increasing = 1;
            for(int row = 1; row < grid.length; row++)
            {
                if(grid[row][col] >= grid[row-1][col])
                {
                    increasing++;
                }
                if(increasing == grid.length)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public String toString()
    {
        String s = "";
        for(int[]row : grid)
        {
            for(int col : row)
            {
                s += col + " ";
            }
            s += "\n";
        }
        return s;
    }
}