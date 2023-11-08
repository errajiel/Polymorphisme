import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ManagerTest {

    private Manager manager;

    // Initialisation d'un manager avant chaque test
    @Before
    public void setUp() {
        // Supposons que le constructeur de Manager est similaire à celui de Directeur, mais sans le pourcentage des bénéfices
        manager = new Manager("Jane Doe", "456 avenue de la Liberté", "0506070809", "987654321", 4000.0, 500.0);
    }

    // Test pour vérifier le calcul du salaire avec bonus
    @Test
    public void testCalculerSalaire() {
        // Le salaire attendu est le salaire de base plus le bonus
        double salaireAttendu = 4500.0; // 4000 salaire de base + 500 bonus
        assertEquals(salaireAttendu, manager.calculerSalaire(), 0.0);
    }

    // Test pour vérifier le fonctionnement des getters et setters pour le bonus
    @Test
    public void testBonus() {
        manager.setBonusAnnuel(600.0);
        assertEquals(600.0, manager.getBonusAnnuel(), 0.0);
    }

    // Test pour vérifier les getters et setters hérités
    @Test
    public void testGettersSettersHerites() {
        manager.setNom("John Doe");
        assertEquals("John Doe", manager.getNom());

        manager.setAdresse("789 boulevard de l'égalité");
        assertEquals("789 boulevard de l'égalité", manager.getAdresse());

        manager.setTelephone("0908070605");
        assertEquals("0908070605", manager.getTelephone());

        manager.setNumeroSecuriteSociale("192837465");
        assertEquals("192837465", manager.getNumeroSecuriteSociale());

        manager.setSalaireBase(4200.0);
        assertEquals(4200.0, manager.getSalaireBase(), 0.0);
    }

    // Si vous avez une méthode afficherInfos dans Manager, vous devriez également tester cela.
    // Assurez-vous de rediriger la sortie standard avant de l'appeler si vous voulez capturer l'affichage.
}