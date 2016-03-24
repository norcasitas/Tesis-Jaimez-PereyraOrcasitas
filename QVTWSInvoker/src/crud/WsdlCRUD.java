package crud;

import java.util.List;
import org.javalite.activejdbc.Base;
import static org.javalite.activejdbc.Model.findById;
import models.Wsdl;

public class WsdlCRUD {

    public WsdlCRUD() {
    }

    public Wsdl getWSDL(Wsdl w) {
        return Wsdl.first("name = ?", w.get("name"));
    }

    public boolean findWSDL(Wsdl w) {
        return (Wsdl.first("name = ?", w.get("name")) != null);
    }

    public boolean create(Wsdl w) {
        boolean ret = true;
        if (!findWSDL(w)) {
            Base.openTransaction();
            Wsdl newWsdl = Wsdl.create("name", w.get("name"), "url", w.get("url"), "category_id", w.get("category_id"));
            ret &= newWsdl.save();
            Base.commitTransaction();
            return ret;
        } else {
            return !ret;
        }
    }

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

    public boolean editInformation(Wsdl w) {
        boolean ret = true;
        Wsdl old = findById(w.getId());
        if (old != null) {
            Base.openTransaction();
            ret &= old.set("name", w.get("name"), "url", w.get("url"), "category_id", w.get("category_id")).saveIt();
            Base.commitTransaction();
            return ret;
        }
        return !ret;
    }

    public boolean editStatistics(Wsdl w) {
        boolean ret = true;
        Wsdl old = findById(w.getId());
        if (old != null) {
            Base.openTransaction();
            ret &= old.set("reputation", w.get("reputation"), "response", w.get("response"), "availability", w.get("availability")).saveIt();
            Base.commitTransaction();
            return ret;
        }
        return !ret;
    }

    public List<Wsdl> searchWSDL(String s) {
        List<Wsdl> result;
        Base.openTransaction();
        result = Wsdl.where("name like ? or url like?", "%" + s + "%", "%" + s + "%");
        Base.commitTransaction();
        return result;
    }
}
