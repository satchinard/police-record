/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.rapport.spi;

import java.util.Date;
import java.util.Map;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import tg.adn.precord.rapport.api.IReportModel;
import tg.adn.precord.rapport.utils.ReportUtils;

/**
 *
 * @author cagecfi
 */
public abstract class ReportModel implements IReportModel {

    private JasperReportBuilder report = DynamicReports.report();
    private Boolean portrait;
    private Boolean addTotal;
    private Boolean addNumColumn;
    private Map<String, String> metaDatas;
    private String userLogin;
    private String bp;
    private String tel;
    private Date heureEdition;
    private static ReportUtils reportUtils;

    @Override
    public JasperReportBuilder getReport() {
        report.title(getTitle())
                .addColumn(getColumns())
                .addPageFooter(getPageFooter());
        return report;
    }

}
