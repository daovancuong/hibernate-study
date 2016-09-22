package study.proven.IOC;

/**
 * @author CSE
 * @version 1.0 Oct 30, 2016
 */
public class ExportOutputFileHelper {
    private ExportOutputFile exportOutputFile;
    
    public void exportFile() {
        ExportOutputFile exportOutputFile = new ExportCSV();
        exportOutputFile.export();
        
    }
    
    public ExportOutputFile getExportOutputFile() {
        return exportOutputFile;
    }
    
    public void setExportOutputFile(ExportOutputFile exportOutputFile) {
        this.exportOutputFile = exportOutputFile;
    }
    
}
