/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */


import edu.princeton.cs.algs4.WeightedQuickUnionUF;

import java.util.Arrays;

public class Percolation {
    private WeightedQuickUnionUF unionTree;
    private int virtualTopSite;
    private int virtualBottomSite;
    private boolean[][] openMap;
    private int siteLength;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        unionTree = new WeightedQuickUnionUF(n * n + 2);
        virtualTopSite = n * n;
        virtualBottomSite = n * n + 1;
        openMap = new boolean[n][n];
        siteLength = n;
        for (boolean[] row : openMap) {
            Arrays.fill(row, false);
        }

        // connect the first row to a virtual top site
        for (int i = 0; i < n; i++ ){
            unionTree.union(virtualTopSite, i);
        }
        // connect the last row to a virtual bottom site
        for (int i = (n * n - 1) - n; i < n * n; i++ ) {
            unionTree.union(virtualBottomSite, i);
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        if
        return openMap[row-1][col-1];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
    }

    // does the system percolate?
    public boolean percolates()

    // test client (optional)
    public static void main(String[] args)
}