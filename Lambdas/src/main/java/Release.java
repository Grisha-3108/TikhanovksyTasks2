import java.util.ArrayList;
import java.util.*;
//В данном классе реализуется работа с list и методами
public class Release {
    //Создаем список для работы с объектами
    //Метод для работы с объектами
    public void work(){
        ArrayList<Sounding> list1 = new ArrayList<Sounding>();
        list1.add(new Cat());
        list1.add(new Dog());
        //Перебор через итератор в цикле объектов в коллекции и
        //вызов метода sound()
        //Создание анонимного класса, реализующего интерфейс Sounding
        Sounding Bear = new Sounding(){
            public void sound(){
                System.out.println("roar!");
            }
        };
        //Добавляем анонимный класс в список
        list1.add(Bear);
        //Создадим лямбда-функцию, реализующую интерфейс Sounding
        Sounding lam = () -> System.out.println("Это лямбда функция!");
        //Добавляем лямбда выражение в список
        list1.add(lam);

        Iterator<Sounding> iter = list1.iterator();
        while(iter.hasNext()){
            iter.next().sound();
        }
        //Перебор с помощью forEach, используем лямбда-выражение для вызова метода
        list1.forEach((Sounding obj) -> obj.sound());
    }
}
