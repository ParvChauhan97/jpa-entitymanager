package Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
  
  private static final EntityManagerFactory emf;

  static {
        emf = Persistence.createEntityManagerFactory("MyJpaUtil");
    }

  public static EntityManager getentitymanager() {
        return emf.createEntityManager();
    }
}
