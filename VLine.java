public class VLine extends VectorObject {
    public int len;

    public VLine(int id, int x, int y, int len) {
        super(id, x, y);
        this.len = len;
    }

    @Override
    public void draw(char[][] matrix) {
        for (int i = y; i < this.len + y; i++) {
            matrix[i][x] = '*';
        }
    }
}
