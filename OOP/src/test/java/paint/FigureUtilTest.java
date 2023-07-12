package paint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FigureUtilTest {

    @Test
    void draw() {
        Circle c = new Circle(10, 10);
        FigureUtil.draw(c);
    }

    @Test
    void testDraw() {
        Circle c = new Circle(10, 10);
        FigureUtil.draw(c, Color.GREEN);
    }
}