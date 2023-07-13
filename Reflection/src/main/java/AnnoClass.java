import java.lang.annotation.Inherited;

//Класс, демонстрирующий переопределение аннотации наследования в потомках(Задача 4)
@WeekDay(dayOfWeek = 1)
public class AnnoClass {}

class AnnoClass2 extends AnnoClass{
    //Реализуем методы с параметрами типов и пометим их новой повторяющейся аннотацией
    //Помечаем их повторяющейся аннотацией
    @AnnoRepeatable(time = 10, priority = 24, description = "описание 1")
    @AnnoRepeatable(time = 15, priority = 21, description = "описание 2")
    public void method1(int a){
        System.out.println(a);
    }
    @AnnoRepeatable(time = 101, priority = 22, description = "описание 3")
    @AnnoRepeatable(time = 1, priority = 45, description = "описание 4")
    public void method2(int a){
        System.out.println(a + 10);
    }
}

@Anno2//Добавим ещё одну аннотацию на всякий случай
@WeekDay(dayOfWeek = 2)//Переопределили параметр аннотации(поменяли день недели)
class AnnoClass3 extends AnnoClass{}

//Аннотация, на которую мы переопределим в классе AnnoClass3
@Inherited
@interface Anno2{
    int a() default 1;
}