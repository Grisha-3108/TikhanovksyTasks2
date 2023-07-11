import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {
    @Test
    void receiveCall() {
        Phone TestPhone = new Phone(100, 100, 100);
        TestPhone.receiveCall("Вася");
    }

    @Test
    void getNumber() {
        Phone TestPhone = new Phone(100, 100, 100);
        assertEquals(100, TestPhone.getNumber());
    }

    @Test
    void testReceiveCall() {
        Phone TestPhone = new Phone(100, 100, 100);
        TestPhone.receiveCall("Петя" , 120);
    }

    @Test
    void sendMessage() {
        Phone TestPhone = new Phone(100, 100, 100);
        TestPhone.sendMessage();
    }

    @Test
    void tostring() {
        Phone TestPhone = new Phone(100, 100, 100);
        TestPhone.tostring();
    }
}