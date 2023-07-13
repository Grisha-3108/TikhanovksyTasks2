//Главный класс, откуда запускаем все потоки на выполнение
import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        //Создаём новый ресурс
        Resource res1 = new Resource(0);
        ResourceProcessor resp1 = new ResourceProcessor(res1);
        //Предыдущие задания
        //Поместим потоки в список без имени
        //ArrayList<Thread> thread = new ArrayList<Thread>();
        //В цикле добавляем потоки и запускаем их
            //for (int i = 0; i < 3; ++i) {
                //thread.add(new Increaser("Поток " + i, resp1));
                //Запускаем поток
                //thread.get(i).start();
            //}

        //7 задание
        //Создание экземпляров классов
        Increaser increaser1 = new Increaser("Поток повышения", resp1);
        Decreaser decreaser1 = new Decreaser(resp1);
        //Запускаем потоки
        increaser1.start();
        decreaser1.run();
    }
}
