public class HLine extends VectorObject {
    public int len;

    public HLine(int id, int x, int y, int len) {
        super(id, x, y);
        this.len = len;
    }

    @Override
    public void draw(char[][] matrix) {
        for (int i = x; i < this.len + x; i++) {
            matrix[y][i] = '*';
        }
    }
}
