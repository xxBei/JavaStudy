package com.zzw.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("zbei");//zbei/192.168.1.4
        InetAddress address = InetAddress.getByName("192.168.1.4");// ip地址是唯一的
//        System.out.println(address);

        String hostAddress = address.getHostAddress();//返回Ip地址
        String hostName = address.getHostName();//返回主机名

        System.out.println(hostAddress);
        System.out.println(hostName);
    }
}
