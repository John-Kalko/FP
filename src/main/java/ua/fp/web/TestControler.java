package ua.fp.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Калько Евгений
 * Date: 6/30/13
 * Time: 2:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestControler {

    public static void main(String [] args) {
        ApplicationContext c = new FileSystemXmlApplicationContext("D:\\Java\\IDEA\\FP\\web\\WEB-INF\\spring\\root-context.xml");
    }
}
