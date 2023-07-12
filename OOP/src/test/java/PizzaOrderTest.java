import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTest {

    @Test
    void order() {
        PizzaOrder t = new PizzaOrder("Pizza1", PizzaOrder.size.BIG, true, "Вологда");
        t.order();
    }

    @Test
    void cancel() {
        PizzaOrder t = new PizzaOrder("Pizza1", PizzaOrder.size.BIG, true, "Вологда");
        t.cancel();
    }

    @Test
    void getName() {
        PizzaOrder t = new PizzaOrder("Pizza1", PizzaOrder.size.BIG, true, "Вологда");
        assertEquals("Pizza1", t.getName());
    }

    @Test
    void setName() {
        PizzaOrder t = new PizzaOrder("Pizza1", PizzaOrder.size.BIG, true, "Вологда");
        t.setName("Pizza2");
    }

    @Test
    void getPizzaSize() {
        PizzaOrder t = new PizzaOrder("Pizza1", PizzaOrder.size.BIG, true, "Вологда");
        assertEquals(PizzaOrder.size.BIG, t.getPizzaSize());
    }

    @Test
    void setPizzaSize() {
        PizzaOrder t = new PizzaOrder("Pizza1", PizzaOrder.size.BIG, true, "Вологда");
        t.setPizzaSize(PizzaOrder.size.SMALL);
    }

    @Test
    void isNeedSauce() {
        PizzaOrder t = new PizzaOrder("Pizza1", PizzaOrder.size.BIG, true, "Вологда");
        assertEquals(true, t.isNeedSauce());
    }

    @Test
    void setNeedSauce() {
        PizzaOrder t = new PizzaOrder("Pizza1", PizzaOrder.size.BIG, true, "Вологда");
        t.setNeedSauce(false);
    }

    @Test
    void getAddres() {
        PizzaOrder t = new PizzaOrder("Pizza1", PizzaOrder.size.BIG, true, "Вологда");
        assertEquals("Вологда", t.getAddres());
    }

    @Test
    void setAddres() {
        PizzaOrder t = new PizzaOrder("Pizza1", PizzaOrder.size.BIG, true, "Вологда");
        t.setAddres("Череповец");
    }

    @Test
    void testToString() {
        PizzaOrder t = new PizzaOrder("Pizza1", PizzaOrder.size.BIG, true, "Вологда");
        assertEquals("Pizza1 BIG Вологда true", t.toString());
    }
}