package com.my.structure.facade;

public class OrderFacade {
    private PickService pickService;
    private PackService packService;
    private SendService sendService;

    public OrderFacade(){
        pickService = new PickService();
        packService = new PackService();
        sendService = new SendService();
    }

    public void doOrder(){

        System.out.println("======调用采摘======");
        pickService.doPick();

        System.out.println("======调用打包======");
        packService.doPack();

        System.out.println("======调用物流======");
        sendService.doSend();
    }
}
