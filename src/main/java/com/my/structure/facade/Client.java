package com.my.structure.facade;

public class Client {
    public static void main(String[] args) {
//        doOrder();
        doFacadeOrder();
    }

    //一般情况下这么调用
    public static void doOrder(){
        PickService pickService = new PickService();
        PackService packService = new PackService();
        SendService sendService = new SendService();

        System.out.println("======调用采摘======");
        pickService.doPick();

        System.out.println("======调用打包======");
        packService.doPack();

        System.out.println("======调用物流======");
        sendService.doSend();
    }

    //采用外观模式
    public static void doFacadeOrder(){
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.doOrder();
    }
}
