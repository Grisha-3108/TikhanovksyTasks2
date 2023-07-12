public class PizzaOrder {
    private String name;
    //Тип перечисления делаем public, а саму переменную private
    public enum size{
        SMALL,
        MEDIUM,
        BIG
    }
    private size pizzaSize;
    boolean needSauce;
    String addres;
    //Заказ принят
    boolean orderInWork;
    //предварительная инициализация, что заказ НЕ принят
    {
        orderInWork = false;
    }

    public PizzaOrder(String name, size pizzaSize, boolean needSauce, String addres) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.needSauce = needSauce;
        this.addres = addres;
    }
    public void order(){
        if(orderInWork)
            System.out.println("Заказ уже принят");
        else{
            System.out.println("Заказ " + pizzaSize + " " + name + " пиццы по адресу " + addres + " принят в работу");
            orderInWork = true;
        }
    }
    public void cancel(){
        if(orderInWork){
            orderInWork = false;
            System.out.println("Заказ отменён");
        }else{
            System.out.println("Заказ не был принят");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public size getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public boolean isNeedSauce() {
        return needSauce;
    }

    public void setNeedSauce(boolean needSauce) {
        this.needSauce = needSauce;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
    public String toString(){
        return name + " " + pizzaSize + " " + addres + " " + needSauce;
    }
}
