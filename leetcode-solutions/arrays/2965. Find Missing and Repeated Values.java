class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n * n;

        long expectedSum = (long) total * (total + 1) / 2;
        long expectedSqSum = (long) total * (total + 1) * (2L * total + 1) / 6;

        long actualSum = 0, actualSqSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                actualSum += val;
                actualSqSum += (long) val * val;
            }
        }

        long delta1 = actualSum - expectedSum;         
        long delta2 = actualSqSum - expectedSqSum;    

        long sumRM = delta2 / delta1;            

        int repeated = (int) ((delta1 + sumRM) / 2);
        int missing = (int) (repeated - delta1);

        return new int[]{repeated, missing};
    }
}
