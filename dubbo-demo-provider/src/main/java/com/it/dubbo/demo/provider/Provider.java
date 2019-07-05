package com.it.dubbo.demo.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Provider 
{
    public static void main( String[] args ) throws IOException
    {
      //Prevent to get IPV6 address,this way only work in debug mode
        //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
//        System.setProperty("java.net.preferIPv4Stack", "true");         
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF\\spring\\dubbo-demo-provider.xml"});
        context.start();
        System.err.println("----------------服务已启动，按任意键结束···········--------------------");
        System.in.read(); // press any key to exit
    }
}
