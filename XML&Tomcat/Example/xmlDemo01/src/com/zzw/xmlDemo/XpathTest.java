package com.zzw.xmlDemo;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class XpathTest {
    public static void main(String[] args){

        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read(new File("src/xml/stus.xml"));
            Element rootElement = document.getRootElement();
            //想要使用Xpath,需要添加支持的jar; 获取的是第一个元素 只返回一个
            //Element nameElement = (Element) rootElement.selectSingleNode("//name");
            //System.out.println(nameElement.getText());

            //获取所有元素
            List<Node> elements = rootElement.selectNodes("//name");
            for(Node element : elements){
                String name = element.getText();
                System.out.println(name);
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }


    }
}
