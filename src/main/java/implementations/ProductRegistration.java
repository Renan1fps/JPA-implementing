package implementations;

import model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class ProductRegistration {
    public static void main(String[] args) {
        Produto product = new Produto();

        product.setName("Cellphone");
        product.setDescription("This is a cellphone");
        product.setPrice(new BigDecimal("800"));

        // Criando conexão com o banco (como se fosse o manager do typeorm)
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("Loja");
        EntityManager manager = managerFactory.createEntityManager();

        manager.getTransaction().begin();
        manager.persist(product);
        manager.getTransaction().commit();
        manager.close();
    }
}
