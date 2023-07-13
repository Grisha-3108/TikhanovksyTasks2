//Повторяющая аннотация, работающая с методами

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Repeatable(AnnoContainer.class)
public @interface AnnoRepeatable {
    //Параметры аннотации: время, приоритет и описание со значениями по-умолчанию
    int time() default 0;
    int priority() default 1;
    String description() default "";
}
//Контейнер для хранения повторяющейса аннотации
@Target(ElementType.METHOD)
@interface AnnoContainer{
    AnnoRepeatable[] value();
}