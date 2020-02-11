package takeru.core.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Entity
@Table(name = "prefecture")
public class Prefecture extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Prefecture findById(long id) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("com.hoge");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        CriteriaBuilder builder = entitymanager.getCriteriaBuilder();
        CriteriaQuery<Prefecture> query = builder.createQuery(Prefecture.class);
        Root<Prefecture> root = query.from(Prefecture.class);
        query.select(root);
        List<Prefecture> en = entitymanager.createQuery(query).getResultList();
        for (Prefecture e : en) {
            System.out.println(e.getName());
        }
        entitymanager.close();
        emfactory.close();
        return null;
    }
}