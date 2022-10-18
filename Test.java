public class Test {
    public static void main(String[] args) {
        int xSize = 10;
        int ySize = 10;
        char[][] matrix = new char[ySize][xSize];

        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                if (i == 0 || i == ySize - 1) {
                    matrix[i][j] = '*';
                } else if (j == 0 || j == ySize - 1) {
                    matrix[i][j] = '*';
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
