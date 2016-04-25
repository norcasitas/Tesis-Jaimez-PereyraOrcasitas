package tesis.crud;

import java.util.List;
import org.javalite.activejdbc.Base;
import tesis.models.Wsdl;

public class WsdlCRUD {

    /**
     * (*-)Retorna un wsdl dado el nombre cargado en el wsdl pasado por
     * parametro
     *
     * @param w
     * @return
     */
    public Wsdl getWSDL(Wsdl w) {
        return Wsdl.first("name = ?", w.get("name"));
    }

    /**
     * (*-)retorna true si el wsdl existe, caso contrario, falso
     *
     * @param w
     * @return
     */
    public boolean findWSDL(Wsdl w) {
        return (Wsdl.first("name = ?", w.get("name")) != null);
    }

    /**
     * (*-)crea un wsdl y lo almacena en la base de datos, retorna true si se
     * almacenó exitosamente, caso contrario false
     *
     * @param w
     * @return
     */
    public boolean create(Wsdl w) {
        boolean ret = true;
        if (!findWSDL(w)) {
            Base.openTransaction();
            w.setLong("reputation", 1);
            w.setLong("response", 0);
            w.setLong("availability", 1);
            Wsdl newWsdl = Wsdl.create("name", w.get("name"), "url", w.get("url"), "category_id", w.get("category_id"));
            ret &= newWsdl.save();
            Base.commitTransaction();
            return ret;
        } else {
            return !ret;
        }
    }

    /**
     * (*-)borra un wsdl dado el id del mismo, retorna true si se borro
     * exitosamente
     *
     * @param id
     * @return
     */
    public boolean delete(int id) {
        boolean ret = true;
        Wsdl old = Wsdl.findById(id);
        if (old != null) {
            Base.openTransaction();
            ret &= old.delete();
            Base.commitTransaction();
            return ret;
        }
        return !ret;
    }

    /**
     * (*-)edita todos sus datos y retorna true si se modificó exitosamente
     *
     * @param w
     * @return
     */
    public boolean edit(Wsdl w) {
        boolean ret = true;
        Wsdl old = Wsdl.findById(w.getId());
        if (old != null) {
            Base.openTransaction();
            ret &= old.set("name", w.get("name"), "url", w.get("url"), "category_id", w.get("category_id"), "reputation", w.get("reputation"), "response", w.get("response"), "availability", w.get("availability")).saveIt();
            Base.commitTransaction();
            return ret;
        }
        return !ret;
    }

    /**
     * (*-)edita unicamente la infromacion de un wsdl y retorna true si se
     * modificó exitosamente
     *
     * @param w
     * @return
     */
    public boolean editInformation(Wsdl w) {
        boolean ret = true;
        Wsdl old = Wsdl.findById(w.getId());
        if (old != null) {
            Base.openTransaction();
            ret &= old.set("name", w.get("name"), "url", w.get("url"), "category_id", w.get("category_id")).saveIt();
            Base.commitTransaction();
            return ret;
        }
        return !ret;
    }

    /**
     * (*-)edita la reputación de un wsdl y retorna true si se modificó
     * exitosamente
     *
     * @param w
     * @return
     */
    public boolean editStatistics(Wsdl w) {
        boolean ret = true;
        Wsdl old = Wsdl.findById(w.getId());
        if (old != null) {
            Base.openTransaction();
            ret &= old.set("response", w.get("response"), "availability", w.get("availability")).saveIt();
            Base.commitTransaction();
            return ret;
        }
        return !ret;
    }

    /**
     * (*-)edita la reputación de un wsdl pasandole true si fue buena, y falso
     * caso contrario, retorna true si se modificó exitosamente.
     *
     * @param w
     * @param b
     * @return
     */
    public boolean editReputation(Wsdl w, boolean b) {
        boolean ret = true;
        Wsdl old = Wsdl.findById(w.getId());
        if (old != null) {
            Base.openTransaction();
            if (b) {
                w.setLong("reputation", old.getLong("reputation") + 1 / 2);
            } else if (old.getLong("reputation") > 1) {
                w.setLong("reputation", old.getLong("reputation") - 1 / 2);
            } else {
                w.setLong("reputation", 0);
            }
            ret &= old.set("reputation", w.get("reputation")).saveIt();
            Base.commitTransaction();
            return ret;
        }
        return !ret;
    }

    /**
     * (*-)retorna todos los wsdl que machean con le nombre
     *
     * @param name
     * @return
     */
    public List<Wsdl> searchWSDLbyName(String name) {
        List<Wsdl> result;
        Base.openTransaction();
        result = Wsdl.where("name like ?", "%" + name + "%");
        Base.commitTransaction();
        return result;
    }

    /**
     * (*-)retorna todos los wsdl que machean con le nombre o url
     *
     * @param search
     * @return
     */
    public List<Wsdl> searchWSDL(String search) {
        List<Wsdl> result;
        Base.openTransaction();
        result = Wsdl.where("name like ? or url like ?", "%" + search + "%", "%" + search + "%");
        Base.commitTransaction();
        return result;
    }

    /**
     * (*-)retorna el wsdl que machea por la url
     *
     * @param url
     * @return
     */
    public Wsdl findByUrl(String url) {
        Wsdl result;
        Base.openTransaction();
        result = Wsdl.findFirst("url = ?", url);
        Base.commitTransaction();
        return result;
    }

    /**
     * (*-)retorna el wsdl que machea por el nombre
     *
     * @param name
     * @return
     */
    public Wsdl findByName(String name) {
        Wsdl result;
        Base.openTransaction();
        result = Wsdl.findFirst("name = ?", name);
        Base.commitTransaction();
        return result;
    }

    /**
     * (*-)retorna todos los wsdl
     *
     * @return
     */
    public List<Wsdl> findAll() {
        List<Wsdl> result;
        Base.openTransaction();
        result = Wsdl.findAll();
        Base.commitTransaction();
        return result;
    }
}
