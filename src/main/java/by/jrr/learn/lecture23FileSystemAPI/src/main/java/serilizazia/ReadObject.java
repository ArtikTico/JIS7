package serilizazia;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Collection;

public class ReadObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        long start = System.currentTimeMillis();
        try(var objectInputStream = new ObjectInputStream(new FileInputStream("user-list.txt"))) {
            Collection<User> userList = (Collection<User>) objectInputStream.readObject();
            userList.forEach(System.out::println);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
