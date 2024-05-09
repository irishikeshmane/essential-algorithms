package graph.problems;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        if (grid.length == 0) {
            return -1;
        }
        int fresh = 0;
        int time = 0;
        // Queue for BFS
        Queue<int[]> rotten_queue = new LinkedList<>();
        // getting the data
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1){
                    fresh++;
                } else if (grid[i][j] == 2) {
                    rotten_queue.add(new int[]{i, j});
                }
            }
        }

        while (!rotten_queue.isEmpty() && fresh > 0) {
            int i = 0;
            while (i < rotten_queue.size()) {

                int[] rotten_orange = rotten_queue.remove();
                int r = rotten_orange[0];
                int c = rotten_orange[1];
                // add the neighbours in the queue
                if (r - 1 >= 0) {
                    if (grid[r - 1][c] == 1) {
                        grid[r - 1][c] = 2;
                        rotten_queue.add(new int[]{r - 1, c});
                        fresh -= 1;
                    }
                }
                if (r + 1 < grid.length) {
                    if (grid[r + 1][c] == 1) {
                        grid[r + 1][c] = 2;
                        rotten_queue.add(new int[]{r + 1, c});
                        fresh -= 1;
                    }
                }
                if (c - 1 >= 0) {
                    if (grid[r][c - 1] == 1) {
                        grid[r][c - 1] = 2;
                        rotten_queue.add(new int[]{r, c - 1});
                        fresh -= 1;
                    }
                }
                if (c + 1 < grid[0].length) {
                    if (grid[r][c + 1] == 1) {
                        grid[r][c + 1] = 2;
                        rotten_queue.add(new int[]{r, c + 1});
                        fresh -= 1;
                    }
                }
                i++;
            }
            time += 1;
        }

        return fresh == 0 ? time : -1;
    }
}
