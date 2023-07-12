import java.util.SplittableRandom;

class BankOnlineException extends RuntimeException{
    //Сообщение об исключении
    protected String ExceptionMessage;
    //Номер карты
    protected String CardNumber;
    //Количество денег
    protected double Money;
    //Возвращаем информацию об исключении

    public double getMoney() {
        return Money;
    }

    public String getExceptionMessage() {
        return ExceptionMessage;
    }

    public String getCardNumber() {
        return CardNumber;
    }
}

class IncorrectCardNumber extends BankOnlineException{
    public IncorrectCardNumber(String Message, String Card, double money) {
        //Добавляем информацию об исключении
        ExceptionMessage = Message;
        CardNumber = Card;
        Money = money;
    }
}

class CardIsBlocked extends BankOnlineException{
    public CardIsBlocked(String Message, String Card, double money) {
        //Добавляем информацию об исключении
        ExceptionMessage = Message;
        CardNumber = Card;
        Money = money;
    }
}

class NegativeSumTransaction extends BankOnlineException{
    public NegativeSumTransaction(String Message, String Card, double money) {
        //Добавляем информацию об исключении
        ExceptionMessage = Message;
        CardNumber = Card;
        Money = money;
    }
}

class LimitIsExceeded extends BankOnlineException{
    public LimitIsExceeded(String Message, String Card, double money) {
        //Добавляем информацию об исключении
        ExceptionMessage = Message;
        CardNumber = Card;
        Money = money;
    }
}

class NullAgument extends BankOnlineException{
    public NullAgument(String Message, String Card, double money) {
        //Добавляем информацию об исключении
        ExceptionMessage = Message;
        CardNumber = Card;
        Money = money;
    }
}

public class BankOnline{
    private boolean isNumeric(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private boolean checkIsBlocked(String s){
        String b[] = {"1111111111111111", "2222222222222222", "3333333333333333"};
        for(int i = 0; i < b.length; ++i){
            if (s == b[i])
                return true;
        }
        return false;
    }
    public void send(String cardNumber, Double money) {
        if((cardNumber.length() != 16) || !isNumeric(cardNumber))
            throw new IncorrectCardNumber("Номер карты введён неверно!", cardNumber, money);
        if (checkIsBlocked(cardNumber))
            throw new CardIsBlocked("Карта заблокирована!", cardNumber, money);
        if (money < 0)
            throw new NegativeSumTransaction("Сумма перевода отрицательная!", cardNumber, money);
        if (money > 50000)
            throw new LimitIsExceeded("Превышен лимит в 50000", cardNumber, money);
        if(cardNumber == null || money == null)
            throw new NullAgument("Обнаружен нулевой аргумент!", cardNumber, money);
    }
}