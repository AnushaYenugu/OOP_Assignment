package lexicon.fundamentals.oop.model;
import lexicon.fundamentals.oop.AppUser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AppUserDAOImplementation implements AppUserDAO {

    Collection<AppUser> appUsers=new ArrayList<>();
    @Override
    public AppUser persist(AppUser appUser) {
        appUsers.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String userName) {
        for(AppUser appuser: appUsers){
            if(appuser.getUserName().equals(userName)){
                return appuser;
            }
        }
        return null;
    }

    @Override
    public Collection<AppUser> findAll() {
        return  appUsers;
    }

    @Override
    public void remove(String userName) {
        Iterator<AppUser> iterator = appUsers.iterator();
        while(iterator.hasNext()) {
            if(iterator.next().getUserName().equals(userName)) {
                iterator.remove();
            }
        }
    }
}
