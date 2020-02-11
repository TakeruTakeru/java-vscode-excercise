package takeru.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Entity
@Table(name = "name")
public class Name implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public boolean isI() {
        return i;
    }

    public void setI(boolean i) {
        this.i = i;
    }

    private boolean i;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String name;

    public static List<Name> findById(long id) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("com.hoge");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        CriteriaBuilder builder = entitymanager.getCriteriaBuilder();
        CriteriaQuery<Name> query = builder.createQuery(Name.class);
        Root<Name> root = query.from(Name.class);
        query.select(root);
        List<Name> en = entitymanager.createQuery(query).getResultList();
        for(Name e: en) {
            System.out.println(e.isI());
        }
        entitymanager.close();
        emfactory.close();
        return en;
    }
}