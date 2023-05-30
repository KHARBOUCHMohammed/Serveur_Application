package mohammed;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mohammed.Livre;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2023-04-04T11:05:51")
@StaticMetamodel(Auteur.class)
public class Auteur_ { 

    public static volatile SingularAttribute<Auteur, Integer> num;
    public static volatile SingularAttribute<Auteur, String> nom;
    public static volatile ListAttribute<Auteur, Livre> livres;

}