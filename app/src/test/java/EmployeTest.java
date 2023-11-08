import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EmployeTest {
    
    private Employe employe;
    
    // Initialisation d'un employé avant chaque test
    @Before
    public void setUp() {
        employe = new Employe("John Doe", "123 rue de la Paix", "0102030405", "123456789", 3000.0);
    }

    // Test pour vérifier le calcul du salaire
    @Test
    public void testCalculerSalaire() {
        // Le salaire de base est supposé être le salaire total pour un employé sans heures supplémentaires
        double salaireAttendu = 3000.0;
        assertEquals(salaireAttendu, employe.calculerSalaire(), 0.0);
    }

    // Test pour vérifier le fonctionnement des getters
    @Test
    public void testGetters() {
        assertEquals("John Doe", employe.getNom());
        assertEquals("123 rue de la Paix", employe.getAdresse());
        assertEquals("0102030405", employe.getTelephone());
        assertEquals("123456789", employe.getNumeroSecuriteSociale());
        assertEquals(3000.0, employe.getSalaireBase(), 0.0);
    }

    // Test pour vérifier le fonctionnement des setters
    @Test
    public void testSetters() {
        employe.setNom("Jane Doe");
        assertEquals("Jane Doe", employe.getNom());

        employe.setAdresse("456 avenue du Général");
        assertEquals("456 avenue du Général", employe.getAdresse());

        employe.setTelephone("0607080910");
        assertEquals("0607080910", employe.getTelephone());

        employe.setNumeroSecuriteSociale("987654321");
        assertEquals("987654321", employe.getNumeroSecuriteSociale());

        employe.setSalaireBase(3500.0);
        assertEquals(3500.0, employe.getSalaireBase(), 0.0);
    }

    // Eventuellement un test pour la méthode afficherInfos() si elle a une logique spécifique à tester
    // Cependant, puisque afficherInfos() peut simplement imprimer les informations sans retourner de valeur,
    // il pourrait être nécessaire d'utiliser un OutputStream personnalisé pour capturer les sorties de la console.
}
