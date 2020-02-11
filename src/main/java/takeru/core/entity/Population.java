package takeru.core.entity;

import java.time.Year;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Entity
@Table(name = "population")
public class Population extends BaseEntity {

    private static final long serialVersionUID = -910285481711220248L;

    private long amount;

    private Year year;

    private int prefectureId;

    private int eraId;

    private boolean man;

    public long getAmount() {
        return amount;
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public int getEraId() {
        return eraId;
    }

    public void setEraId(int eraId) {
        this.eraId = eraId;
    }

    public int getPrefectureId() {
        return prefectureId;
    }

    public void setPrefectureId(int prefectureId) {
        this.prefectureId = prefectureId;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    
    public static Population findById(long id) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("com.hoge");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        CriteriaBuilder builder = entitymanager.getCriteriaBuilder();
        CriteriaQuery<Population> query = builder.createQuery(Population.class);
        Root<Population> root = query.from(Population.class);
        query.select(root);
        Population en = entitymanager.createQuery(query).getSingleResult();
        System.out.println(en.getAmount());
        entitymanager.close();
        emfactory.close();
        return en;
    }
}