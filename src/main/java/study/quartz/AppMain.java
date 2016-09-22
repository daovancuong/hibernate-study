package study.quartz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppMain {
    public static void main(String args[]) {
        // AbstractApplicationContext context = new
        // FileSystemXmlApplicationContext("D:/workspace/hibernate-first/src/main/resources/quartz-config.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("quartz-context.xml");
    }
    
}
