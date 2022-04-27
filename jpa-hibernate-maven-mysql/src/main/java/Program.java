import domain.People;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

//        People p1 = new People(null, "Carlos da Silva", "carlos@gmail.com");
//        People p2 = new People(null, "Torres Pereira", "torresp@gmail.com");
//        People p3 = new People(null, "José Leandro", "jleandro@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

//        em.getTransaction().begin();
//        em.persist(p1);
//        em.persist(p2);
//        em.persist(p3);
//        em.getTransaction().commit();
        People p = em.find(People.class, 2);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        System.out.println(p);
        System.out.println("Pronto!");
        emf.close();
        em.close();

    }
}
