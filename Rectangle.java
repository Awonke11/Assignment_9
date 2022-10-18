public class Rectangle extends VectorObject {
    public int width, height;

    public Rectangle(int id, int x, int y, int width, int height) {
        super(id, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(char[][] matrix) {
        for (int i = x; i < this.width + x; i++) {
            for (int j = y; j < this.height + y; j++) {
                matrix[i][j] = '*';
            }
        }
    }
}
