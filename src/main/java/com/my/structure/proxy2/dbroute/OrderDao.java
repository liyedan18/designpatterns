package com.my.structure.proxy2.dbroute;

/**
 * Created by Tom.
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}
