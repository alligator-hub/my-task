public class Main {
    public static void main(String[] args) {

        int[] row0 = new int[]{0, 0, 0, 0, 0, 0, 0};
        int[] row1 = new int[]{0, 0, 0, 0, 0, 0, 0};
        int[] row2 = new int[]{0, 0, 0, 0, 0, 0, 0};
        int[] row3 = new int[]{0, 0, 0, 5, 0, 0, 0};
        int[] row4 = new int[]{0, 0, 0, 0, 0, 0, 0};
        int[] row5 = new int[]{0, 0, 0, 0, 0, 0, 0};
        int[] row6 = new int[]{0, 0, 0, 0, 0, 0, 0};

        int[][] square = new int[][]{row0, row1, row2, row3, row4, row5, row6};

        System.out.println(stepsRobotToCenter(square));

    }

    private static int stepsRobotToCenter(int[][] square) {
        for (int row = 0; row < square.length; row++) {

            for (int position = 0; position < square[row].length; position++) {
                if (square[row][position] == 1) {

                    if (position > 3) position = 6 - position;
                    if (row > 3) row = 6 - row;

                    if (row == position) return Math.abs(((4 - (row + 1)) * 2));
                    else return Math.abs(((4 - row) + (3 - position - 1)));
                }
            }
        }
        return 0;
    }
}
