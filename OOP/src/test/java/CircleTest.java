import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void area() {
        Circle TestCircle = new Circle(10.0 , 2);
        assertEquals(314, Math.floor(TestCircle.area()));
    }

    @Test
    void perimeter() {
        Circle TestCircle = new Circle(10.0 , 2);
        assertEquals(62, Math.floor(TestCircle.perimeter()));
    }

    @Test
    void tostring() {
        Circle TestCircle = new Circle(10.0 , 2);
        TestCircle.tostring();
    }
}