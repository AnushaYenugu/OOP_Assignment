package lexicon.fundamentals.oop;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credentials;

    public Person(int id, String firstName, String lastName, String email){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        if(firstName==null){
            System.out.println("First Name cannot be null");
        }
        else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if(lastName==null){
            System.out.println("Last Name cannot be null");
        }
        else {
        this.lastName = lastName;
        }
    }

    public void setEmail(String email) {
        if(email==null){
            System.out.println("Email address cannot be null");
        }
        else {
        this.email = email;
        }
    }

    public AppUser getCredentials(){
        return credentials;
    }

    public void setCredentials(AppUser credentials){
        this.credentials=credentials;

    }
// changed getSummary to toString
    @Override
    public String toString(){
        return "Id: "+id+" Name: "+firstName+" "+lastName+" email: "+email;
    }



    public boolean equals(Object object) {
        if(object==this){
            return true;
        }
        if(object==null || object.getClass()!=this.getClass()){
            return false;
        }

        Person person=(Person) object;

        return id==person.id && (firstName.equals(person.firstName)|| (firstName!=null && firstName.equals(person.getFirstName())))
                   && (lastName.equals(person.lastName)|| (lastName!=null && lastName.equals(person.getLastName())))
                   && (email.equals(person.email)|| (email!=null) && email.equals(person.getEmail()));

    }

    public int hashCode(Object o) {
        final int prime=31;
        int result=1;
        result=prime*result+id;
        result=prime*result+((firstName==null)?0:firstName.hashCode());
        result=prime*result+((lastName==null)?0:lastName.hashCode());
        result=prime*result+((email==null)?0:email.hashCode());

        return result;
    }
}
