package com.zzw.xmlDemo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class readXml {
    public static void main(String[] args){
        try {
            //创键SAXReader对象
            SAXReader reader = new SAXReader();
            //读取xml文件
            Document document = reader.read(new File("src/xml/stus.xml"));
            //获取根元素
            Element rootElement = document.getRootElement();
            //获取子元素
            //Element element = rootElement.element("stu");
            //String name = element.element("name").getText();
            //获取所有子元素
            List<Element> elements = rootElement.elements("stu");
            for(Element element : elements){
                String name = element.element("name").getText();
                String age = element.element("age").getText();
                String address = element.element("address").getText();
                System.out.println("name:"+name+"--age:"+age+"--address:"+address);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
}
