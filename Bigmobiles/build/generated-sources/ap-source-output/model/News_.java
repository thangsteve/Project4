package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2019-05-27T00:55:17")
@StaticMetamodel(News.class)
public class News_ { 

    public static volatile SingularAttribute<News, Integer> newsID;
    public static volatile SingularAttribute<News, String> description;
    public static volatile SingularAttribute<News, String> imageNews;
    public static volatile SingularAttribute<News, String> title;
    public static volatile SingularAttribute<News, Date> newsDate;

}