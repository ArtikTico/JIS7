package serilizazia;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Base64;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Externalizable {

    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.id);
        out.writeObject(this.firstName);
        out.writeObject(this.lastName);
        out.writeObject(this.username);
        out.writeObject(this.encryptPass(this.password));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = (Long) in.readObject();
        firstName = (String) in.readObject();
        lastName = (String) in.readObject();
        username = (String) in.readObject();
        password = this.decryptPass((String) in.readObject());
    }

    private String decryptPass(String pass) {
        String decryptPass = new String(Base64.getDecoder().decode(pass));
        System.out.println(decryptPass);
        return decryptPass;
    }

    private String encryptPass(String password) {
        password = Base64.getEncoder().encodeToString(password.getBytes());
        System.out.println(password);
        return password;
    }
}
