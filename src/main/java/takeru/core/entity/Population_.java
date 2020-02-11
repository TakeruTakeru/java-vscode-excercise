package takeru.core.entity;

import java.time.Year;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Population.class)
public class Population_ {
    public static volatile SingularAttribute<BaseEntity, Long> amount;
    public static volatile SingularAttribute<BaseEntity, Year> year;
    public static volatile SingularAttribute<BaseEntity, Integer> prefectureId;
    public static volatile SingularAttribute<BaseEntity, Integer> eraId;
    public static volatile SingularAttribute<BaseEntity, Boolean> man;
}