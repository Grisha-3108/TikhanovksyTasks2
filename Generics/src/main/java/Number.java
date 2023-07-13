//Колллекция элементов
public class Number {
    protected int num[] = new int[5];
    //Для получения элемента
    public int[] getNum() {
        return num;
    }

    Number(){
        //Выполняем инициализацию коллекции
        for(int i = 1; i <=5; ++i)
            num[i - 1] = i;
    }

    //Создадим обобщённый метод для подсчёта чётных элеметов в коллекции
    //Принимает коллекцию
//    public <T> int count(T collection){
//        int col = 0;
//        for(int i = 0; i < collection.getNum().length; ++i)
//            if()
//        return col;
//    }
}
//Наслденики коллекции из массива из 5 элементов
class Number1{}

class Number2{}