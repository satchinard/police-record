package tg.adn.precord.data.entite;

import com.google.gson.Gson;
import java.io.Serializable;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 *
 * @author cagecfi
 */
@MappedSuperclass
public abstract class EntiteModel implements Serializable, Cloneable {

    private static final long serialVersionUID = -9563287410L;

    /**
     * Pour savoir combien de fois une instance a subi de modifications.
     */
    @Version
    private int version;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * Information à enregistrer dans le mouchard.
     *
     * @return String La chaine correspondante.
     */
    public abstract String getMouchard();

    /**
     * Génère l'objet sous format JSON qui peut être remis en état après.
     *
     * @return String La chaîne JSON de l'objet.
     *
     */
    public final String getJsonMouchard() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
