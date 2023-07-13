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
        while (r.getRes() >= 5) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        r.setRes(r.getRes() + 1);
        notify();
    }

    public  void decrease(){
        while (r.getRes() < 1) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        r.setRes(r.getRes() - 1);
        notify();
    }
}
