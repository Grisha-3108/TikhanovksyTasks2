import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.lang.reflect.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
//Класс DataContainer с аннотациями для подключения getter-ов, setter-ов а также конструкторов
public class DataContainer {
    private String str1;
    private int a;
    private int b;
}

class Create{
    //Данный статический метод через рефлексию получает приватные значения DataContainer,
    //Записывает их в значения своего экземпляра и создаёт свой объект
    private String str1;
    private int a;
    private int b;

    public Create(String str1, int a, int b) {
        this.str1 = str1;
        this.a = a;
        this.b = b;
    }
    //getter-ы для значений для тестов
    public String getStr1() {
        return str1;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    //Метод получает на вход экземпляр класса
    public static Create createMethod(DataContainer d){
        try {
            Field field1 = d.getClass().getDeclaredField("str1");
            field1.setAccessible(true);
            Field field2 = d.getClass().getDeclaredField("a");
            field2.setAccessible(true);
            Field field3 = d.getClass().getDeclaredField("b");
            field3.setAccessible(true);
            Create create = new Create((String) field1.get(d), (int) field2.get(d), (int) field3.get(d));
            return create;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
