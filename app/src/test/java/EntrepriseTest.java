import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EntrepriseTest {

    private Entreprise entreprise;
    private Employe employe;
    private Manager manager;
    private Technicien technicien;
    private Directeur directeur;

    @Before
    public void setUp() {
        // Initialize your entreprise with a name
        entreprise = new Entreprise("MyEnterprise");

        // Create instances of your employee types
        // Assuming you have the correct constructors in your Employee, Manager, Technician, and Director classes
        employe = new Employe("John Doe", "JD123", "Development", "Employee", 30000.0);
        manager = new Manager("Jane Doe", "JD124", "Development", "Manager", 50000.0, 5000.0);
        technicien = new Technicien("Mike Ross", "MR125", "Development", "Technician", 35000.0, 10, 150.0);
        directeur = new Directeur("Harvey Specter", "HS126", "Management", "Director", 70000.0, 10000.0, 0.05);
    }

    @Test
    public void testAjouterEmploye() {
        // Test adding an employee
        entreprise.ajouterEmploye(employe);
        assertEquals(1, entreprise.getEmployes().size());
    }

    @Test
    public void testCalculerMasseSalariale() {
        // Add employees and test the total salary mass
        entreprise.ajouterEmploye(employe);
        entreprise.ajouterEmploye(manager);
        entreprise.ajouterEmploye(technicien);
        entreprise.ajouterEmploye(directeur);

        double expectedMasseSalariale = employe.calculerSalaire() + manager.calculerSalaire() +
                                        technicien.calculerSalaire() + directeur.calculerSalaire();
        assertEquals(expectedMasseSalariale, entreprise.calculerMasseSalariale(), 0.001);
    }

    @Test
    public void testAfficherInfosEmployes() {
        // This is a bit trickier to test since it involves printing to the console
        // You might want to check that the method is called the correct number of times,
        // or redirect the console output and verify it contains certain strings.
        // For simplicity, we'll just check that no exceptions are thrown when calling the method
        entreprise.ajouterEmploye(employe);
        entreprise.afficherInfosEmployes();
        // If we get here, the method has executed without throwing an exception
        assertTrue(true);
    }
}
