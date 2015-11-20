/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.utils;

/**
 *
 * @author cagecfi
 */
public enum SexeEnum {

    MALE("M"),
    FEMELE("F");

    private SexeEnum(String codeSexe) {
        this.codeSexe = codeSexe;
    }

    private String codeSexe;

    public String getCodeSexe() {
        return codeSexe;
    }

    public void setCodeSexe(String codeSexe) {
        this.codeSexe = codeSexe;
    }

    public static SexeEnum reCreateSexe(String codeSexe) {
        SexeEnum sexe = null;
        if (codeSexe != null) {
            if (codeSexe.equalsIgnoreCase("M")) {
                return SexeEnum.MALE;
            } else if (codeSexe.equalsIgnoreCase("F")) {
                return SexeEnum.FEMELE;
            }
        }
        return sexe;
    }

    public String reCreateString() {
        return codeSexe;
    }

}
