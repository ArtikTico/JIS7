package serilizazia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WriteUser {
    public static void main(String[] args) throws IOException {
        User userOne = new User(1L,"Artsemi","Stankevich", "Ticon", "Krevedko");
        User userTwo = new User(2L,"Alex","Demchenko", "Sanekгыы", "lol");
        User userThree = new User(3L,"Roma","Gasparevich", "SOAD", "fuckTheSystem");
        try (var objectOutputStream = new ObjectOutputStream(new FileOutputStream("user-list.lox"))) {
            objectOutputStream.writeObject(List.of(userOne, userTwo, userThree));
        }
    }
}
