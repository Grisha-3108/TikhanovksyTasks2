import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getAuthorBook() {
        Book t = new Book("Grigory" , "male", "Grisha@mail.ru");
        //Возврат ссылки на объект автора
        Author a = t.getAuthorBook();
        assertEquals("Grigory", a.getName());
        assertEquals("male", a.getMale());
        assertEquals("Grisha@mail.ru", a.getEmail());
    }

    @Test
    void setAuthorBook() {
        Book t = new Book("Grigory" , "male", "Grisha@mail.ru");
        Author a = new Author("Sergay", "male", "Sergay@mail.ru");
        t.setAuthorBook(a);
    }

    @Test
    void testToString() {
        Book t = new Book("Grigory" , "male", "Grisha@mail.ru");
        assertEquals("Grigory male Grisha@mail.ru", t.toString());
    }
}