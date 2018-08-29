package com.zzw.String_01;

public class StringDemo {
    /**
     * String类的判断功能
     * 1.boolean equals(Object obj);判断两个字符是否相等
     * 2.boolean equalsIgnoreCase(String str);判断两个字符是否相等,忽略大小写
     * 3.boolean StartsWith(String str);判断字符串开头是否以指定字符开头
     * 4.boolean endsWith(String str);判断字符串结尾是否以指定字符结尾
     */
    public static void main(String[] args) {

        /**
         * public boolean equals(Object anObject)
         * 将此字符串与指定对象进行比较。 其结果是true当且仅当该参数不是null并且是String对象，表示相同的字符序列作为该对象。
         */
        String a = "hello";
        String b = "HELLO";
        System.out.println(a.equals(b));
        System.out.println("-----------------------");

        /**
         * public boolean equalsIgnoreCase(String anotherString)
         * 将此String与其他String比较,且两个字符串中的相应字符等于忽略大小写
         * */
        String c = "ABC";
        String d = "abc";
        System.out.println(c.equalsIgnoreCase(d));
        System.out.println("-----------------------");

        /**
         * public boolean startsWith(String prefix)
         * 测试此字符串是否以指定的前缀开头
         * */
        String e = "abc";
        System.out.println(e.startsWith("a"));
        System.out.println("----------------------");
        /**
         * public boolean endsWith(String suffix)
         * 测试此字符串是否以指定的后缀结尾。
         * */
        String f = "abcd";
        System.out.println(f.endsWith("d"));
    }

}
