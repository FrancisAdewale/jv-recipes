import entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.JdbcSettings.*;

public class Database {


    public static SessionFactory getSessionFactory(){
          var sessionFactory = new Configuration()
                        // use H2 in-memory database
                        .setProperty(URL, "jdbc:h2:mem:db1")
                        // default username / password
                        .setProperty(USER, "sa")
                        .setProperty(PASS, "")
                        .setProperty("hibernate.agroal.maxSize", "20")
                  .addAnnotatedClass(ChefUser.class)
                  .addAnnotatedClass(Recipe.class)
                  .addAnnotatedClass(Category.class)
                  .addAnnotatedClass(Image.class)
                  .addAnnotatedClass(Ingredient.class)
                  .addAnnotatedClass(Rating.class)
                  .addAnnotatedClass(Tag.class)
                        // options to display SQL in console
                        .setProperty(SHOW_SQL, TRUE.toString())
                        .setProperty(FORMAT_SQL, TRUE.toString())
                        .setProperty(HIGHLIGHT_SQL, TRUE.toString())
                        .buildSessionFactory();
          return sessionFactory;
    }
}


