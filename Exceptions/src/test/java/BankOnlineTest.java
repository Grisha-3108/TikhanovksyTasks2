import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankOnlineTest {

    @Test
    void send() {
        //В данном тесте проверяем работу ислключений
        BankOnline t = new BankOnline();
        try {
            t.send("ff3", 10.5);
        }
        catch (IncorrectCardNumber ex){
            ex.getMessage();
            System.out.println("Было вызано исключение неверный номер карты");
        }

        try {
            t.send("1111111111111111", 10.5);
        }
        catch (CardIsBlocked ex){
            ex.getMessage();
            System.out.println("Было вызано исключение карта заблокирована");
        }

        try {
            t.send("1234567891234567", -100.3);
        }
        catch (NegativeSumTransaction ex){
            System.out.println("Было вызано исключение отрицательная сумма перевода");
            ex.getMessage();
        }

        try {
            t.send("1234567891234567", 100000.0);
        }
        catch (LimitIsExceeded ex){
            System.out.println("Было вызано исключение превышен лимит");
            ex.getMessage();
        }

        try {
            t.send("1234567891234567", null);
        }
        catch (NullPointerException ex){
            ex.getMessage();
            System.out.println("Было вызано исключение нулевой аргумент");
        }catch(NullAgument ex){
            System.out.println("Было вызано исключение неверный номер карты");
        }
    }
}