import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateTest {
    //Тестируем только метод создания экземпляра класса, т.к. остальные методы
    //в данном случае не важны
    @Test
    void createMethod() {
        DataContainer d1 = new DataContainer("Строка1" , 2, 3);
        Create c1 = Create.createMethod(d1);
        assertEquals("Строка1", c1.getStr1());
        assertEquals(2, c1.getA());
        assertEquals(3, c1.getB());
    }
}