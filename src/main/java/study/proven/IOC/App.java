package study.proven.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CSE
 * @version 1.0 Oct 30, 2016
 */
public class App {
    public void method_1() {
        ExportOutputFile exportOutputFile = new ExportCSV();
        exportOutputFile.export();
        /*
         * every time when you change export type then you have to change this
         * code,if this code in anywhere you will suffer
         */
        
    }
    
    public void method_2() {
        ExportOutputFileHelper exportOutputFileHelper = new ExportOutputFileHelper();
        exportOutputFileHelper.exportFile();
        /*
         * when you change type of export you have to change code in
         * exportOutputFileHelper so code have to change so probaly cause error
         */
        
    }
    
    public void method_3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configs.xml");
        ExportOutputFileHelper exportOutputFile = (ExportOutputFileHelper) applicationContext.getBean("export");
        exportOutputFile.getExportOutputFile().export();
        
    }
    
    public static void main(String[] args) {
        App app = new App();
        app.method_3();
        
    }
    
}
