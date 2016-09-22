package study.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author CSE
 * @version 1.0 Oct 30, 2016
 */

public class ComplexJob extends QuartzJobBean {
    
    private AnyBean anyBean;
    
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        anyBean.printMessage();
        
    }
    
    public AnyBean getAnyBean() {
        return anyBean;
    }
    
    public void setAnyBean(AnyBean anyBean) {
        this.anyBean = anyBean;
    }
    
}
