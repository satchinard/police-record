/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.rapport.api;

import java.util.Collection;
import java.util.Map;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.FieldBuilder;
import net.sf.dynamicreports.report.builder.ParameterBuilder;
import net.sf.dynamicreports.report.builder.VariableBuilder;
import net.sf.dynamicreports.report.builder.chart.AbstractCategoryChartBuilder;
import net.sf.dynamicreports.report.builder.column.ColumnBuilder;
import net.sf.dynamicreports.report.builder.column.TextColumnBuilder;
import net.sf.dynamicreports.report.builder.component.ComponentBuilder;
import net.sf.dynamicreports.report.builder.group.ColumnGroupBuilder;
import net.sf.dynamicreports.report.builder.group.GroupBuilder;
import net.sf.dynamicreports.report.builder.subtotal.SubtotalBuilder;

/**
 *
 * @author cagecfi
 */
public interface IReportModel {

    public JasperReportBuilder getReport();

    public ComponentBuilder<?, ?>[] getHeader();

    public ComponentBuilder<?, ?>[] getTitle();

    public FieldBuilder[] getFields();

    public Map<String, String> getColumnTitles();

    public ColumnBuilder<?, ?> getColumns();

    public Collection<Object> getDatas();

    public ComponentBuilder[] getGroupHeaders();

    public GroupBuilder<?>[] getGroups();

    public ComponentBuilder[] getGroupFooters();

    public ColumnGroupBuilder[] getColumnGroups();

    public AbstractCategoryChartBuilder getChart();

    public SubtotalBuilder<?, ?>[] getSubTotals();

    public TextColumnBuilder<?>[] getTextColumns();

    public ComponentBuilder<?, ?>[] getSummary();

    public ComponentBuilder<?, ?>[] getFooter();

    public String getTemplate();

    public VariableBuilder[] getVariables();

    public ParameterBuilder[] getParameters();

    public ComponentBuilder<?, ?>[] getPageFooter();

    public String getOrientation();

    public String getFormatPapier();
}
