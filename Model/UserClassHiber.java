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
}
