public class Phone {
    private long number, model, weight;
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public long getNumber() {
        return number;
    }
    Phone(long Number, long Model, long Weight){
        number = Number;
        model = Model;
        weight = Weight;
    }
    Phone(){
        number = 0;
        model = 0;
        weight = 0;
    }
    public void receiveCall(String name, long number){
        System.out.println("Звонит " + name + " с номера телефона " + number);
    }
    public void sendMessage(){
        long numbers[] = new long[5];
        numbers[0] = 88005553535l;
        numbers[1] = 85677856784l;
        numbers[2] = 3;
        numbers[3] = 555;
        numbers[4] = 22;
        for(int i = 0; i < 5; ++i){
            System.out.println(numbers[i]);
        }
    }
    public void tostring(){
        System.out.println(number + " " + model + " " + weight);
    }
}
