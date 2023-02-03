package engine;

public class Circle implements MutableShape{
    /**
     * определяет горизонтальную позицию центра круга
     */
    private float centerX;

    /**
     * определяет вертикальную позицию центра круга
     */
    private float centerY;

    /**
     * определяет радиус круга
     */
    private float radius;

    public Circle(float centerX, float centerY, float radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public float getCenterX() {
        return centerX;
    }

    public float getCenterY() {
        return centerY;
    }

    public float getRadius() {
        return radius;
    }


    @Override
    public void move(float dx, float dy) {

    }

    @Override
    public void scale(float factor) {

    }
}

