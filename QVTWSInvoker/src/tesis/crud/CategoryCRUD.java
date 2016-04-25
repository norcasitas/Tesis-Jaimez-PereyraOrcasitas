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
     * (*-)Retorna una categoria dado el nombre cargado en la categoria pasada
     * por parametro
     *
     * @param c
     * @return
     */
    public Category getCategory(Category c) {
        return Category.first("name = ?", c.get("name"));

    }

    /**
     * (*-)retorna true si la categoría existe, caso contrario, falso
     *
     * @param c
     * @return
     */
    public boolean findCategory(Category c) {
        return (Category.first("name = ?", c.get("name")) != null);
    }

    /**
     * (*-)crea una categoria y la almacena en la base de datos, retorna true si
     * se almacenó exitosamente, caso contrario false
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
     * (*-)borra una categoría dado el id de la misma, retorna true si se borro
     * exitosamente
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
     * (*-)edita una categoría y retorna true si se modificó exitosamente
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
     * (*-)busca todas las categorías que machean por el nombre
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
     * (*-)retorna todas las categorías
     *
     * @return
     */
    public List<Category> getAllCategories() {
        return Category.findAll();
    }

    /**
     * (*-)order by stats ranking
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
