/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.core.entite;

/**
 *
 * @author cagecfi
 */
public abstract class SousMenu {

    private String cle;
    private String module;
    private Menu menu;
    private String description;
    private boolean actif;

    public SousMenu() {
    }

    public SousMenu(String cle, String module, String description, boolean actif) {
        this.cle = cle;
        this.module = module;
        this.description = description;
        this.actif = actif;
    }

    public String getCle() {
        return cle;
    }

    public void setCle(String cle) {
        this.cle = cle;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

}
