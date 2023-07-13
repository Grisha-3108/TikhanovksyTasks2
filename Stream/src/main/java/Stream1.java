import java.util.Arrays;
import java.util.Collection;
import java.util.OptionalDouble;
import java.util.stream.*;

public class Stream1 {
    //К 1 задаче
    int st[] = new int[10];
    Stream1(){
        //Заполним массив элементами
        for(int i = 0; i < 10; ++i){
            st[i] = (int)Math.floor(Math.random() * 100) % 20;
            //Выводим числа
            System.out.println(st[i]);
        }

    }
    //Сортируем двузначные элементы

    //Функция для добавления элемента в массив по индексу
    private void add(int[] mas){
        int index = 0;
    }
    public int[] sort(){
        int result[] = new int[10];

        Arrays.stream(st).filter(x -> x < 10).forEach(x -> );
    }

    //Находим среднее значение
    public double avg(){
        try{
            return Arrays.stream(st).average().getAsDouble();
        }catch (Exception ex){
            return 0;
        }
    }

}
