import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataContainerTest {

    @Test
    void methodWrite() {
        DataContainer d = new DataContainer("s", 1, 2);
        d.methodWrite();
    }
}