package Controller;

public class JpaDemoMain {
    public static void main(String[] args) {
      EntityManager em = JPAUtil.getentitymanager();

        try {
            UserClassHiber user = new UserClassHiber("rahul", "rahul@gmail.com");
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
            System.out.println("User saved: " + user.getId());
        }
    }
}
