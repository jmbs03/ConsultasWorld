import com.world.HibernateUtil;
import com.world.model.Country;
import org.junit.jupiter.api.Test;
import org.hibernate.Session;

public class PruebasCountry {

    @Test
    public void prueba1() {
        Session s = HibernateUtil.getSessionFactory().openSession();

        Country c = s.find(Country.class, "ESP");

        System.out.println(c);

        s.close();

    }
}
