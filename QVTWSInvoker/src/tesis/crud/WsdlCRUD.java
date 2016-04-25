package tesis.crud;

import java.util.List;
import org.javalite.activejdbc.Base;
import tesis.models.Wsdl;

public class WsdlCRUD {

    /**
     * return a wsdl by name
     *
     * @param w
     * @return
     */
    public Wsdl getWSDL(Wsdl w) {
        return Wsdl.first("name = ?", w.get("name"));
    }

    /**
     * true if wsdl exists
     *
     * @param w
     * @return
     */
    public boolean findWSDL(Wsdl w) {
        return (Wsdl.first("name = ?", w.get("name")) != null);
    }

    /**
     * save a wsdl in the database
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
     * delete a wsdl from database 
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
     * edit a wsdl
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
     * edit only the information of a wsdl
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
     * edit only the response and availability of a wsdl
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
     * edit onyl the reputation of wsdl, 
     * if boolean param is true, reputation'll raise
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
     * search wsdls by name
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
     * search wsdls by name or url
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
     * rsearch a wsdl by url
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
     * search a wsdl by name
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
     * retunrs all wsdl
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
