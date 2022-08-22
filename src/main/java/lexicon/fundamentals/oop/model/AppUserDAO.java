package lexicon.fundamentals.oop.model;

import lexicon.fundamentals.oop.AppUser;

import java.util.Collection;

public interface AppUserDAO {
    //public AppUser persist(AppUser appUser);

    public AppUser persist(AppUser appUser);

    public AppUser findByUsername(String userName);
    public Collection<AppUser> findAll();
    public void remove(String userName);

}
