import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataContainerTest {

    @Test
    void getStr1() {
        DataContainer c = new DataContainer("Строка", 1, 1);
        assertEquals("Строка", c.getStr1());
    }

    @Test
    void getA() {
        DataContainer c = new DataContainer("Строка", 1, 1);
        assertEquals(1, c.getA());
    }

    @Test
    void getB() {
        DataContainer c = new DataContainer("Строка", 1, 1);
        assertEquals(1, c.getB());
    }

    @Test
    void setStr1() {
        DataContainer c = new DataContainer("Строка", 1, 1);
        c.setStr1("Строка2");
        assertEquals("Строка2", c.getStr1());
    }

    @Test
    void setA() {
        DataContainer c = new DataContainer("Строка", 1, 1);
        c.setA(2);
        assertEquals(2, c.getA());
    }

    @Test
    void setB() {
        DataContainer c = new DataContainer("Строка", 1, 1);
        c.setB(2);
        assertEquals(2, c.getB());
    }
}