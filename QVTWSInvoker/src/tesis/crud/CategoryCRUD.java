package tesis.crud;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import org.javalite.activejdbc.Base;
import tesis.models.Category;
import tesis.models.Wsdl;
import tesis.utils.WsdlComparator;

public class CategoryCRUD {

    /**
     * return a caregory by name
     *
     * @param c
     * @return
     */
    public Category getCategory(Category c) {
        return Category.first("name = ?", c.get("name"));

    }

    /**
     * true if caregory exists
     *
     * @param c
     * @return
     */
    public boolean findCategory(Category c) {
        return (Category.first("name = ?", c.get("name")) != null);
    }

    /**
     * save a caregory in the database
     *
     * @param c
     * @return
     */
    public boolean create(Category c) {
        boolean ret = true;
        if (!findCategory(c)) {
            Base.openTransaction();
            Category newCategory = Category.create("name", c.get("name"));
            ret &= newCategory.save();
            Base.commitTransaction();
            return ret;
        } else {
            return !ret;
        }
    }

    /**
     * delete a caregory from database 
     *
     * @param id
     * @return
     */
    public boolean delete(int id) {
        boolean ret = true;
        Category old = Category.findById(id);
        if (old != null) {
            Base.openTransaction();
            ret &= old.delete();
            Base.commitTransaction();
            return ret;
        }
        return !ret;
    }

    /**
     * edit a caregory
     *
     * @param c
     * @return
     */
    public boolean edit(Category c) {
        boolean ret = true;
        Category old = Category.findById(c.getId());
        if (old != null) {
            Base.openTransaction();
            ret &= old.set("name", c.get("name")).saveIt();
            Base.commitTransaction();
            return ret;
        }
        return !ret;
    }

    /**
     * search categories by name
     *
     * @param name
     * @return
     */
    public List<Category> searchCategory(String name) {
        List<Category> result;
        Base.openTransaction();
        result = Category.where("name like ?", "%" + name + "%");
        Base.commitTransaction();
        return result;
    }

    /**
     * return all categories
     *
     * @return
     */
    public List<Category> getAllCategories() {
        return Category.findAll();
    }

    /**
     * retirn categories order by rank
     *
     * @param c
     * @return
     */
    public List<Wsdl> getChilds(Category c) {
        Iterator<Wsdl> it = c.getAll(Wsdl.class).iterator();
        WsdlComparator comparator = new WsdlComparator();
        PriorityQueue<Wsdl> queue = new PriorityQueue<>(comparator);
        while (it.hasNext()) {
            queue.add(it.next());
        }
        LinkedList<Wsdl> list = new LinkedList<>();
        list.addAll(queue);
        return list;
    }
}
