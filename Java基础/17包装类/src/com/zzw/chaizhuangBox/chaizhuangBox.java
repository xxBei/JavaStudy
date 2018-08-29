package com.zzw.chaizhuangBox;

public class chaizhuangBox {
    public static void main(String[] args) {
        /*
        * 自动装箱
        * 此时虚拟机帮你做了一个步骤:
        * Integer i = new Integer(20);
        * */
        //Integer i = 20;

        /*
        * 自动拆箱
        * 此时虚拟机帮你做了一个步骤:
        * Integer i = new Integer(10);
        * int a = i.intValue();
        * */
//        Integer i = 10;
//        int a = i;

        Integer i1 = 10;
        Integer i2 = 20;
        Integer i3 = i1 + i2;
        /*
        * 操作步骤:
        * Integer i1 = new Integer(10);
        * Integer i2 = new Integer(20);
        * Integer i3 = i1.intValue + i2.intValue;
        *
        * */

    }
}
