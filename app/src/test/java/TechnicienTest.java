import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TechnicienTest {
    
    private Technicien technicien;
    
    // Initialisation d'un technicien avant chaque test
    @Before
    public void setUp() {
        technicien = new Technicien("John Doe", "123 rue de la Paix", "0102030405", "123456789", 3000.0, 10, 20.0);
    }

    // Test pour vérifier le calcul du salaire avec les heures supplémentaires
    @Test
    public void testCalculerSalaire() {
        // Le salaire attendu est le salaire de base plus le paiement pour les heures supplémentaires
        // Supposons que le calcul est simplement heuresSupplementaires * tauxHoraireSupplementaire ajouté au salaire de base
        double salaireAttendu = 3000.0 + (10 * 20.0); // 10 heures * 20.0 taux horaire
        assertEquals(salaireAttendu, technicien.calculerSalaire(), 0.0);
    }

    // Test pour vérifier les getters et setters pour les heures supplémentaires et le taux horaire
    @Test
    public void testGettersSettersHeuresEtTaux() {
        technicien.setHeuresSupplementaires(15);
        assertEquals(15, technicien.getHeuresSupplementaires());

        technicien.setTauxHoraireSupplementaire(25.0);
        assertEquals(25.0, technicien.getTauxHoraireSupplementaire(), 0.0);
    }

    // Test pour vérifier les getters et setters hérités de la classe Employe
    @Test
    public void testGettersSettersHerites() {
        technicien.setNom("Jane Doe");
        assertEquals("Jane Doe", technicien.getNom());

        technicien.setAdresse("456 avenue du Général");
        assertEquals("456 avenue du Général", technicien.getAdresse());

        technicien.setTelephone("0607080910");
        assertEquals("0607080910", technicien.getTelephone());

        technicien.setNumeroSecuriteSociale("987654321");
        assertEquals("987654321", technicien.getNumeroSecuriteSociale());

        technicien.setSalaireBase(3500.0);
        assertEquals(3500.0, technicien.getSalaireBase(), 0.0);
    }

    // Encore une fois, un test pour la méthode afficherInfos si nécessaire.
}