package hello.model;

import leap.lang.meta.annotation.Creatable;
import leap.lang.meta.annotation.Filterable;
import leap.lang.meta.annotation.Sortable;
import leap.orm.annotation.Column;
import leap.orm.annotation.Id;
import leap.orm.annotation.Table;
import leap.orm.model.Model;

@Table("user")
public class User extends Model {
    @Id
    private String id;

    @Column
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
