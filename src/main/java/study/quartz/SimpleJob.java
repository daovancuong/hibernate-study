package study.quartz;

import org.springframework.stereotype.Component;

/**
 * @author CSE
 * @version 1.0 Oct 30, 2016
 */
@Component("simpleJob")
public class SimpleJob {
    public SimpleJob() {
    }
    
    public void printMessage() {
        System.out.println("This is simple job");
    }
    
}
