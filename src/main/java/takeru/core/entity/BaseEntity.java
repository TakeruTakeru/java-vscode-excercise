package takeru.core.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 3291421948012384L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "enable")
    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Column(name = "createTimestamp")
    private Date createTimestamp;

    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    @Column(name = "updateTimestamp")
    private Date updateTimestamp;

    public Date getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Date updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    // public static <T extends BaseEntity> T findById(long id) {
    //     EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("persistenceUnit");
    //     EntityManager entitymanager = emfactory.createEntityManager();
    //     entitymanager.getTransaction().begin();
    //     CriteriaBuilder builder = entitymanager.getCriteriaBuilder();
    //     CriteriaQuery<? extends BaseEntity> query = builder.createQuery(BaseEntity.class);
    //     Root<? extends BaseEntity> root = query.from(BaseEntity.class);
    //     // query.select(root);
    //     BaseEntity en = entitymanager.createQuery(query).getSingleResult();
    //     entitymanager.close();
    //     emfactory.close();
    //     return en;
    // }
}