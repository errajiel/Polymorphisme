import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DirecteurTest {
    
    private Directeur directeur;
    private final double EPSILON = 1e-6; // Epsilon pour comparer les doubles

    // Initialisation d'un directeur avant chaque test
    @Before
    public void setUp() {
        directeur = new Directeur("John Doe", "123 rue de la Paix", "0102030405", "123456789", 5000.0, 1000.0, 0.1);
    }

    // Test pour vérifier le calcul du salaire
    @Test
    public void testCalculerSalaire() {
        // Supposons que la méthode calculerSalaire tient compte du salaire de base, du bonus annuel
        // et de 10% des bénéfices qui sont ici simulés par un montant fictif (par exemple, 50000 pour les bénéfices de l'entreprise)
        double benefices = 50000.0;
        double pourcentageBenefices = 0.1; // 10%
        double salaireAttendu = 5000.0 + 1000.0 + (benefices * pourcentageBenefices);
        assertEquals(salaireAttendu, directeur.calculerSalaire(), EPSILON);
    }

    // Test pour vérifier les getters et setters pour le pourcentage des bénéfices
    @Test
    public void testGettersSettersPourcentageBenefices() {
        directeur.setPourcentageBenefices(0.15); // Modification pour 15%
        assertEquals(0.15, directeur.getPourcentageBenefices(), EPSILON);
    }

    // Test pour vérifier les getters et setters hérités de la classe Manager et Employe
    @Test
    public void testGettersSettersHerites() {
        // ... (comme dans les tests précédents pour les Managers et Employes)
    }

    // Test pour vérifier que le bonus annuel est bien pris en compte
    @Test
    public void testGettersSettersBonusAnnuel() {
        directeur.setBonusAnnuel(2000.0);
        assertEquals(2000.0, directeur.getBonusAnnuel(), EPSILON);
    }

    // Si la classe Directeur a une implémentation spécifique de afficherInfos(),
    // vous pouvez également la tester comme mentionné précédemment.
}
