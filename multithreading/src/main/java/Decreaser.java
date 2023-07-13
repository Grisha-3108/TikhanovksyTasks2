public class Decreaser implements Runnable{
    private ResourceProcessor r;
    Decreaser(ResourceProcessor R){
        this.r = R;
    }
    public void run(){
        //Синхронизируем обращение к классу ResourceProcessor с помощью операции synchronized
        synchronized (r) {

            for (int i = 1; i <= 10; ++i){
                r.decrease();
                //Для отладночной печати раскомментировать
                //Проверка выполнялась здесь
                System.out.println(r.getR().getRes());
            }
        }
    }
}
