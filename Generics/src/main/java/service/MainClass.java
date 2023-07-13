package service;

public class MainClass <T>{
    T api;
    public MainClass(T Api){
        api = Api;
    }

    public void start(){
        api.request();
        api.valRequest();
        api.valResponse();
    }
}
