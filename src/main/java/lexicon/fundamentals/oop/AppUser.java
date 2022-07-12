package lexicon.fundamentals.oop;
import java.lang.Exception.*;

public class AppUser {
    private String userName;
    private String password;
    AppRole role;

     public AppUser(String userName, String password, AppRole role){
         this.userName=userName;
         this.password=password;
         this.role=role;
     }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(userName.equals(null)){
            IllegalStateException exception;
        }
        else {
            this.userName = userName;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.equals(null)){
            IllegalStateException exception;
        }

        this.password = password;

    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if(role.equals(null)){
            IllegalStateException exception;
        }
        this.role = role;
    }

    public boolean equals(Object object){

        if(object==this){
            return true;
        }

        if(object==null || object.getClass()!=this.getClass()){
            return false;
        }

        AppUser appUser=(AppUser) object;
        return (userName!=null && userName.equals(appUser.getUserName())) && this.userName.equals(appUser.userName );

    }
    public int hashCode(Object o){
        final int prime =31;
        int result=1;
        result=prime*result+((userName==null)?0:userName.hashCode());
        return result;
    }

    public String toString(){
        return "User Name: "+userName+ " Role: "+role ;
    }





}
