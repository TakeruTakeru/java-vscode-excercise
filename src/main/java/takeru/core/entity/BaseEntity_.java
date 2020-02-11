package takeru.core.entity;

import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(BaseEntity.class)
public class BaseEntity_ {
    public static volatile SingularAttribute<BaseEntity, Long> id;
    public static volatile SingularAttribute<BaseEntity, Boolean> enable;
    public static volatile SingularAttribute<BaseEntity, Date> createTimestamp;
    public static volatile SingularAttribute<BaseEntity, Date> updateTimestamp;
}