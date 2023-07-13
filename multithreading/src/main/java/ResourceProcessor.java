public class ResourceProcessor {
    //Приватное поле для хранения ресурса
    private  Resource r;
    public ResourceProcessor(Resource R){
        this.r = R;
    }


    public  Resource getR() {
        return r;
    }

    public  void increase(){
        //При достижении ресурса в 5 переводим поток в режим ожидиния
        while (r.getRes() >= 5) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        r.setRes(r.getRes() + 1);
        //Оживляем другой поток
        notify();
    }

    public  void decrease(){
        //При уменьшении ресурса до меньше 1, останавливаем поток
        while (r.getRes() < 1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        r.setRes(r.getRes() - 1);
        //Возобновляем другой поток
        notify();
    }
}
