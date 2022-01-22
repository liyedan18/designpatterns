package com.my.structure.proxy2.dynamicproxy.jdkproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Tom.
 */
public class JdkMeipo implements InvocationHandler {
    private IPerson target;
    public IPerson getInstance(IPerson target){
        // 被代理的对象，实际的方法执行者
        this.target = target;
        Class<?> clazz =  target.getClass();
        // 获取类加载器、获取类接口，
        //               a.JDK会通过根据传入的参数信息动态地在内存中创建和.class 文件等同的字节码
        //               b.然后根据相应的字节码转换成对应的class，
        //               c.然后调用newInstance()创建代理实例
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    //  定义了代理对象调用方法时希望执行的动作，用于集中处理在动态代理类对象上的方法调用
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        // 通过反射让被代理的对象target 执行方法
        Object result = method.invoke(this.target,args);
        after();
        return result;
    }

    private void after() {
        System.out.println("双方同意，开始交往");
    }

    private void before() {
        System.out.println("我是媒婆，已经收集到你的需求，开始物色");
    }
}
