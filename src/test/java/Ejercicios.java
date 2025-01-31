import com.world.HibernateUtil;
import com.world.model.Continent;
import com.world.model.Country;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Ejercicios {
    // Obtén todos los países de la base de datos.
    @Test
    public void ejercicio1() {
        Session s = HibernateUtil.getSessionFactory().openSession();

        List<Country> listaPaises =
                s.createQuery("FROM Country", Country.class).list();

        int i = 1;
        for (Country c: listaPaises) {
            System.out.println(i + " " + c);
            i++;
        }

        s.close();
    }

    // Muestra los nombres y continentes de todos los países.
    @Test
    public void ejercicio2() {
        Session s = HibernateUtil.getSessionFactory().openSession();

        List<Object[]> listaNombres =
                s.createQuery("SELECT c.name, c.continent FROM Country c ORDER BY c.continent ASC").list();

        int i = 1;
        for (Object[] o: listaNombres) {
            String nombre = (String) o[0];
            Continent continente = (Continent) o[1];
            System.out.println(i + " País: " + nombre + " Continente: " + continente);
            i++;
        }

        s.close();
    }

    
}
