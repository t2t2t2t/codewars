package kyu5;

public class TicTacToeChecker {
    public class Solution {

        public static int isSolved(int[][] board) {

            int[][][] index = {
                    {{0, 0}, {1, 1}, {2, 2}},
                    {{0, 0}, {0, 1}, {0, 2}},
                    {{2, 0}, {1, 1}, {0, 2}},
                    {{1, 0}, {1, 1}, {1, 2}},
                    {{2, 0}, {2, 1}, {2, 2}},
                    {{0, 0}, {1, 0}, {2, 0}},
                    {{0, 1}, {1, 1}, {2, 1}},
                    {{0, 2}, {1, 2}, {2, 2}},

            };
            int s = 0;
            int c = 0;
            int[] comparison = new int[3];
            for (int i = 0; i < index.length; i++) {
                for (int j = 0; j < 3; j++) {
                    s = index[i][j][0];
                    c = index[i][j][1];
                    comparison[j] = board[s][c];
                }
                if (comparison[0] != 0 && comparison[0] == comparison[1] && comparison[1] == comparison[2]) {

                    return comparison[0];
                }
            }
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 0) {

                        return -1;
                    }
                }
            }


            return 0;
        }

        public static void main(String[] args) {
            isSolved(new int[][]{
                    {0, 0, 1},
                    {0, 1, 2},
                    {2, 1, 0}
            });
        }
    }

}
