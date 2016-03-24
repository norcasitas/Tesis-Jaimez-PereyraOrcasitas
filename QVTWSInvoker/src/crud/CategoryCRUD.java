package crud;

import java.util.List;
import org.javalite.activejdbc.Base;
import static org.javalite.activejdbc.Model.findById;
import models.Category;

public class CategoryCRUD {

    public CategoryCRUD() {
    }

    public Category getCategory(Category c) {
        return Category.first("name = ?", c.get("name"));
    }

    public boolean findCategory(Category c) {
        return (Category.first("name = ?", c.get("name")) != null);
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
            ret &=  old.set("name", c.get("name")).saveIt();
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
}
