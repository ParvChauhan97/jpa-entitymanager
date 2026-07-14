package Model;

import jakarta.persistence.*;

@Entity
public class UserClassHiber {
  
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;


    UserClassHiber() {
    }

  UserClassHiber(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

  public UserClassHiber(String name, String email) {
        this.name = name;
        this.email = email;
    }

  public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

  public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
