public class Increaser extends Thread{
    private ResourceProcessor r;
    Increaser(String name, ResourceProcessor R){
        super(name);
        this.r = R;
    }
    //Создаём объект менеджер ресурсов(пусть будет статический для синхронизации обращений)
    //private static ResourceProcessor rp = new ResourceProcessor();
    //Помещаем вызов методов в новый поток
    public void run(){
        //Синхронизируем обращение к классу ResourceProcessor с помощью операции synchronized
        synchronized (r) {

            for (int i = 1; i <= 10; ++i){
                r.increase();
                //Для отладночной печати раскомментировать
                //Проверка выполнялась здесь
                System.out.println(r.getR().getRes());
            }
        }
    }
}
