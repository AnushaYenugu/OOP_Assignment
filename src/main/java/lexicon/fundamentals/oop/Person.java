package lexicon.fundamentals.oop;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

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

    public String getSummary(){
        return "Id: "+id+" Name: "+firstName+" "+lastName+" email: "+email;
    }



}
