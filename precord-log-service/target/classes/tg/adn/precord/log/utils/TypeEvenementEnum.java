/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.log.utils;

/**
 *
 * @author cagecfi
 */
public enum TypeEvenementEnum {

    DEBUG("D"), INFO("I"), WARN("W"), ERROR("E"), FATAL("F");

    private String typeEventString;

    private TypeEvenementEnum(String typeEventString) {
        this.typeEventString = typeEventString;
    }

    public String getTypeEventString() {
        return typeEventString;
    }

    public void setTypeEventString(String typeEventString) {
        this.typeEventString = typeEventString;
    }

    public static TypeEvenementEnum reCreateEnum(String typeEvent) {
        TypeEvenementEnum typeEnum = null;
        if (typeEvent != null) {
            if (typeEvent.equalsIgnoreCase("I")) {
                return TypeEvenementEnum.INFO;
            } else if (typeEvent.equalsIgnoreCase("D")) {
                return TypeEvenementEnum.DEBUG;
            } else if (typeEvent.equalsIgnoreCase("F")) {
                return TypeEvenementEnum.FATAL;
            } else if (typeEvent.equalsIgnoreCase("W")) {
                return TypeEvenementEnum.WARN;
            } else if (typeEvent.equalsIgnoreCase("E")) {
                return TypeEvenementEnum.ERROR;
            }
        }
        return typeEnum;
    }

    public String reCreateString() {
        return typeEventString;
    }
}
