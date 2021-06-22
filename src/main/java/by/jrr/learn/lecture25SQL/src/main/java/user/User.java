package user;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private Integer id;
    private String firstName;
    private String lastName;
    private String username;
    private Status status;
    private String email;
//    private Collection<Address> addresses;

    public User(String firstName, String lastName, String username, Status status, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.status = status;
        this.email = email;
    }

    public User(Integer id, String firstName, String lastName, String username, Status status, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.status = status;
        this.email = email;
    }
}
