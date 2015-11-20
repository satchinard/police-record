/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.rapport.utils;

import net.sf.dynamicreports.report.builder.DynamicReports;
import net.sf.dynamicreports.report.builder.column.BooleanColumnBuilder;
import net.sf.dynamicreports.report.builder.column.TextColumnBuilder;
import net.sf.dynamicreports.report.builder.component.TextFieldBuilder;
import net.sf.dynamicreports.report.builder.datatype.DataTypes;
import net.sf.dynamicreports.report.builder.style.ReportStyleBuilder;
import net.sf.dynamicreports.report.constant.BooleanComponentType;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;

/**
 *
 * @author cagecfi
 */
public class ReportUtils {

    /**
     * Style pour les titres des pages
     */
    public static ReportStyleBuilder rsbTitle = DynamicReports.stl.style(
            DynamicReports.stl.fontArial().bold().setFontSize(11));
    /**
     * Style pour tout ce qui s'affiche sur le rapport
     */
    public static ReportStyleBuilder rsbBody = DynamicReports.stl.style(
            DynamicReports.stl.fontArial().setFontSize(9));
    /**
     * Style pour l'entete de page
     */
    public static ReportStyleBuilder rstHead = DynamicReports.stl.style(
            DynamicReports.stl.fontArial().setFontSize(8));
    /**
     * Style pour le pied de page
     */
    public static ReportStyleBuilder rstFoot = DynamicReports.stl.style(
            DynamicReports.stl.fontArial().setFontSize(7));
    /**
     * Style pour les entêtes de groupe
     */
    public static ReportStyleBuilder rstGroup = DynamicReports.stl.style(
            DynamicReports.stl.fontArial().bold().setFontSize(10));

    public static TextColumnBuilder getStringColumn(String title, String property) {
        return DynamicReports.col.column(title, property, DataTypes.stringType())
                .setHorizontalTextAlignment(HorizontalTextAlignment.LEFT);
    }

    public static BooleanColumnBuilder getBoolColumn(String title, String property) {
        return DynamicReports.col.booleanColumn(title, property)
                .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER)
                .setComponentType(BooleanComponentType.IMAGE_CHECKBOX_1);
    }

    public static TextColumnBuilder getIntColumn(String title, String property) {
        return DynamicReports.col.column(title, property, DataTypes.integerType())
                .setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT);
    }

    public static TextColumnBuilder getDoubleColumn(String title, String property) {
        return DynamicReports.col.column(title, property, DataTypes.doubleType())
                .setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT);
    }

    public static TextColumnBuilder getFloatColumn(String title, String property) {
        return DynamicReports.col.column(title, property, DataTypes.floatType())
                .setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT);
    }

    public static TextColumnBuilder getDateColumn(String title, String property) {
        return DynamicReports.col.column(title, property, DataTypes.dateType())
                .setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT);
    }

    public static TextColumnBuilder getFullDateColumn(String title, String property) {
        return DynamicReports.col.column(title, property, DataTypes.dateYearToFractionType())
                .setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT);
    }

    public static TextFieldBuilder getStringField(String value) {
        return DynamicReports.cmp.text(value)
                .setHorizontalTextAlignment(HorizontalTextAlignment.LEFT);
    }

    public static TextFieldBuilder getNumberField(Float value) {
        return DynamicReports.cmp.text(value)
                .setHorizontalTextAlignment(HorizontalTextAlignment.RIGHT);
    }

}
