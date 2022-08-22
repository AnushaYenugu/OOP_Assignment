package lexicon.fundamentals.oop.model;

import lexicon.fundamentals.oop.AppRole;
import lexicon.fundamentals.oop.AppUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class AppUserDAOImplementationTest {
    private AppUserDAOImplementation appUserDAOImplementation;

    @BeforeEach
    public void setUp() {
        appUserDAOImplementation = new AppUserDAOImplementation();
    }

    @Test
    void persist() {
        setupAppUsers();
        Collection<AppUser> allUsers = appUserDAOImplementation.appUsers;
        assertEquals(allUsers.size(), 1);
    }

    @Test
    void findByUsername() {
        setupAppUsers();
        AppUser result = appUserDAOImplementation.findByUsername("anusha");
        assertEquals(result.getUserName(), "anusha");
    }

    private void setupAppUsers() {
        AppUser testAppUser1 = new AppUser("anusha", "anusha", AppRole.ROLE_APP_USER);
        appUserDAOImplementation.persist(testAppUser1);
    }

    @Test
    void findAll() {
        setupAppUsers();
        Collection<AppUser> findAllUsersResult = appUserDAOImplementation.findAll();
        assertEquals(findAllUsersResult.size(), 1);
    }

    @Test
    void remove() {
        setupAppUsers();
        assertEquals(appUserDAOImplementation.appUsers.size(), 1);
        appUserDAOImplementation.remove("anusha");
        assertEquals(appUserDAOImplementation.appUsers.size(), 0);
    }
}