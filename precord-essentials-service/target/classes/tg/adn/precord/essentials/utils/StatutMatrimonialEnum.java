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
public enum StatutMatrimonialEnum {

    CELIBATAIRE("C"), DIVORCE("D"), MARIE("M"), VEUF("V");

    private String codeStatut;

    private StatutMatrimonialEnum(String codeStatut) {
        this.codeStatut = codeStatut;
    }

    private StatutMatrimonialEnum() {
    }

    public String getCodeStatut() {
        return codeStatut;
    }

    public void setCodeStatut(String codeStatut) {
        this.codeStatut = codeStatut;
    }

    public static StatutMatrimonialEnum reCreateStatut(String codeStatut) {
        StatutMatrimonialEnum statut = null;
        return statut;
    }

    public String reCreateString() {
        return codeStatut;
    }
}
