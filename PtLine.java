public class PtLine extends VectorObject {
    public int bx, by;

    public PtLine(int id, int x, int y, int bx, int by) {
        super(id, x, y);
        this.bx = bx;
        this.by = by;
    }

    @Override
    public void draw(char[][] matrix) {
        int x = this.x;
        int y = this.y;
        int bx = this.bx;
        int by = this.by;
        boolean steepness = Math.abs(by - y) > Math.abs(bx - x);
        if (steepness) {
            int temp = x;
            int temp1 = bx;
            x = y;

            // & Swapping values
            y = temp;
            bx = by;
            by = temp1;
        }

        if (x > bx) {
            int temp = x;
            int temp1 = y;
            x = bx;

            // & Swapping values
            bx = temp;
            y = by;
            by = temp1;
        }

        int ys;
        if (y < by) {
            ys = 1;
        } else {
            ys = -1;
        }

        double gradientValue = (Math.abs(by - y)) / ((double) (bx - x));

        int yy = y;
        double error = 0;
        for (int i = x; i <= bx; i++) {
            if (steepness) {
                matrix[i][yy] = '*';
            } else {
                matrix[yy][i] = '*';
            }

            error = error + gradientValue;
            if (error > 0.5) {
                yy = yy + ys;
                error = error - 1;
            }

        }
    }
}
