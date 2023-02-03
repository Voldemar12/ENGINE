package engine;

public class Rectangle implements MutableShape{
    /**
     * Определяет Х координату верхнего левого угла прямоугольника

     */
    private float x;

    /**
     * Определяет У координату верхнего левого угла прямоугольника
     */
    private float y;

    /**
     * определяет ширину прямоугольника
     */
    private float width;

    /**
     * определяет высоту прямоугольника
     */
    private float height;

    public Rectangle(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }


    @Override
    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;

    }

    @Override
    public void scale(float factor) {
        this.width = this.width * factor;
        this.height = this.height * factor;

    }
}
