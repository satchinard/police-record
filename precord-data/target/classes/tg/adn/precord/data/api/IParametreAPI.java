/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.data.api;

import java.util.List;
import tg.adn.precord.data.entite.ParametreConfigFloat;
import tg.adn.precord.data.entite.ParametreConfigLong;
import tg.adn.precord.data.entite.ParametreConfigString;

/**
 *
 * @author cagecfi
 */
public interface IParametreAPI {

    public List<ParametreConfigFloat> getParametreFLoat();

    public List<ParametreConfigLong> getParametreLong();

    public List<ParametreConfigString> getParametreString();
}
