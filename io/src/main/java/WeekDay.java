import java.lang.annotation.Inherited;
//Аннотация работает с полем для недели и может быть применена к классам
@Inherited//Данная аннотация является аннотацией наследования с параметром дня недели int
public @interface WeekDay {
    //На всякий случай перечисление для дней недели
    enum day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SUTURDAY,
        SUNDAY
    }
    //Поле, хранящее день недели
    int dayOfWeek() default 1;
}
