import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.spec.ECField;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.io.FileUtils;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
//Класс DataContainer с аннотациями для подключения getter-ов, setter-ов а также конструкторов
public class DataContainer {
    private String str1;
    private int a;
    private int b;
    public void writefile(String name, String data){
        try(FileWriter writer = new FileWriter(name, true))
        {
            //Добавляем строку в записываемый файл
            writer.write(data);
            //Закрываем файл
            writer.flush();
        }
        catch(IOException ex){
            //Ошибка записи в файл
            System.out.println(ex.getMessage());
        }
    }
    //записываем обработанный метод в файл
    public void methodWrite(){
        //Проверяем количество файлов, если их больше 2, то удалем их
        File dir = new File("D:\\sber_tasks\\Tikhanovsky\\io\\src\\main\\log"); //PATH указывает на директорию
        File[] arrFiles = dir.listFiles();
        //Удаляем лишние файлы из директории
        try{
            if(arrFiles.length > 1){
                FileUtils.cleanDirectory(dir);
            }
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        //Создаём файл с текущей датой и временем и записываем туда вызванный метод
        Date date = new Date();
        String fileName = "D:\\sber_tasks\\Tikhanovsky\\io\\src\\main\\log\\" +
                date.toString().replaceAll("\\s", "").replaceAll(":", "_") +
                "_логирование.txt";
        try(FileWriter writer = new FileWriter(fileName, false))
        {

            //Получаем название метода через стек вызовов
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            //записываем название предыдущего метода
            writer.write(stackTraceElements[stackTraceElements.length - 2].toString());
            //Закрываем файл
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
