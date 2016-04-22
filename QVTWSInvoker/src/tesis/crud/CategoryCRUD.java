package tesis.crud;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import org.javalite.activejdbc.Base;
import tesis.models.Category;
import tesis.models.Wsdl;
import tesis.utils.WsdlComparator;

public class CategoryCRUD {

    public CategoryCRUD() {
    }

    public Category getCategory(Category c) {
        Category b = Category.first("name = ?", c.get("name"));
        return b;
    }

    public boolean findCategory(Category c) {
        boolean b = (Category.first("name = ?", c.get("name")) != null);
        return b;
    }

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

    public List<Category> searchCategory(String name) {
        List<Category> result;
        Base.openTransaction();
        result = Category.where("name like ?", "%" + name + "%");
        Base.commitTransaction();
        return result;
    }

    public List<Category> getAllCategories() {
        return Category.findAll();
    }

    //order by stats ranking
    public List<Wsdl> getChilds(Category c) {
        Iterator<Wsdl> it = c.getAll(Wsdl.class).iterator();
        WsdlComparator comparator = new WsdlComparator();
        PriorityQueue<Wsdl> queue = new PriorityQueue<Wsdl>(comparator);
        while (it.hasNext()) {
            queue.add(it.next());
        }
        LinkedList<Wsdl> list = new LinkedList<Wsdl>();
        list.addAll(queue);
        return list;
    }
}
