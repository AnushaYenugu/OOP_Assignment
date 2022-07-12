import lexicon.fundamentals.oop.AppRole;
import lexicon.fundamentals.oop.AppUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppUserTest {

    String userName="Anusha Yenugu";
    String password="anusha";
    AppRole role=AppRole.ROLE_APP_USER;

    AppUser appUser;
    AppUser appUser2;

    @BeforeEach
    void setUp(){
        AppUser appUser=new AppUser(userName,password,role);
        AppUser appUser2=new AppUser("Sree Divisha","sree",AppRole.ROLE_APP_ADMIN);


    }


    @Test
    public void appUserGetNameTest(){
        AppUser appUser=new AppUser(userName,password,role);
        Assertions.assertEquals(userName,appUser.getUserName());

    }

    @Test
    public void appUserInformationTest(){
        AppUser appUser=new AppUser(userName,password,role);
        appUser.toString();
    }

    @Test
    public void testEqualsMethodOfAppUser(){
        AppUser appUser=new AppUser(userName,password,role);
        AppUser appUser1=new AppUser(userName, password,role);
        AppUser appUser3=new AppUser("Sree Divisha","sree",AppRole.ROLE_APP_ADMIN);
        Assertions.assertTrue(appUser.getUserName().equals(appUser1.getUserName()));
        Assertions.assertFalse(appUser.getUserName().equals(appUser3.getUserName()));
    }

    @Test
    public void testHashCodeWhenEquals(){

        AppUser appUser=new AppUser(userName,password,role);
        AppUser appUser1=new AppUser(userName, password,role);
        Assertions.assertTrue(appUser.getUserName().hashCode()==appUser1.getUserName().hashCode());
        Assertions.assertTrue(appUser.getPassword().hashCode()==appUser1.getPassword().hashCode());
        Assertions.assertTrue(appUser.getRole().hashCode()==appUser1.getRole().hashCode());
    }

    @Test
    public void testHashCodeWhenNotEquals(){
        AppUser appUser=new AppUser(userName,password,role);
        AppUser appUser3=new AppUser("Sree Divisha","sree",AppRole.ROLE_APP_ADMIN);
        Assertions.assertFalse(appUser.getUserName().hashCode()==appUser3.getUserName().hashCode());

        Assertions.assertFalse(appUser.getPassword().hashCode()==appUser3.getUserName().hashCode());
        Assertions.assertFalse(appUser.getRole().hashCode()==appUser3.getRole().hashCode());

    }

}
