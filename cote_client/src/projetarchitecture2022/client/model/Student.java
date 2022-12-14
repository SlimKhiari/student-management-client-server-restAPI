package projetarchitecture2022.client.model;

public class Student {

    public Integer id;
    public String firstname;
    public String lastname;

    public Student(int id, String firstname, String lastname) {
        super();
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Student(String firstname, String lastname) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return firstname.toUpperCase() + " " + lastname;
    }

    //@Override
    /*public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        return getId().equals(((Student) obj).getId());
    }*/
}
