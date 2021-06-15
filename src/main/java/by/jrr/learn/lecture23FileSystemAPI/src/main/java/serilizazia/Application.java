package serilizazia;

import serilizazia.service.UserCreateFileApiService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) throws IOException {

//        User userOne = new User(1L,"Artsemi","Stankevich", "Ticon", "Krevedko");
//        User userTwo = new User(2L,"Alex","Demchenko", "Sanekгыы", "lol");
//        User userThree = new User(3L,"Roma","Gasparevich", "SOAD", "fuckTheSystem");
//
//        List<User> userList = List.of(userOne, userTwo, userThree);
//        var collect = userList.stream()
//                .map(User::toString).collect(Collectors.joining(",\n"));
//
//        var path = Paths.get("D:\\projects\\github\\JIS7\\src\\main\\java\\by\\jrr\\learn\\lecture22FileSystemAPI\\src\\main\\resources\\testFolder");
//        var pathForCreateFile = Paths.get("D:\\projects\\github\\JIS7\\src\\main\\java\\" +
//                "by\\jrr\\learn\\lecture22FileSystemAPI\\src\\main\\resources\\testFolder\\userList.txt");
//
//        if (!path.toFile().exists()) {
//            var file = Files.createDirectory(path);
//            var newFile = Files.createFile(pathForCreateFile);
//        }
//
//        var users = Files.write(pathForCreateFile, Collections.singleton(collect));
//        System.out.println(pathForCreateFile.getParent());
//        System.out.println(pathForCreateFile.getFileSystem());
//        System.out.println(pathForCreateFile.getFileName());
//        System.out.println(pathForCreateFile.getNameCount());
//        System.out.println(pathForCreateFile.getRoot());
//        System.out.println(pathForCreateFile.toUri());
//        System.out.println(pathForCreateFile.toAbsolutePath());
//
////        Files.copy(pathForCreateFile, Paths.get("D:\\someFileCopy.txt"));
////        Files.move(pathForCreateFile, Paths.get("D:\\games\\movedFolder.txt"));
//        Files.deleteIfExists(Paths.get("D:\\games\\movedFolder.txt"));
//
//        List<String> strings = Files.readAllLines(pathForCreateFile);
//        strings.forEach(System.out::println);
//
//    var listFiles = Files.readAllLines(Paths.get("D:\\projects\\github\\JIS7\\src\\main\\java\\" +
//            "by\\jrr\\learn\\lecture22FileSystemAPI\\src\\main\\resources\\testFolder\\users.txt"));
//        listFiles.forEach(System.out::println);
//
//        var userCreateFileApiService = new UserCreateFileApiService();
//        listFiles.forEach(userCreateFileApiService::createUserFromFile);
//        List<char[]> collect1 = listFiles.stream().map(String::toCharArray).collect(Collectors.toList());
//        collect1.forEach(System.out::println);
//        collections.forEach(System.out::println);
//
        Integer a = null;
        Integer b = 1;
        boolean equals = Objects.equals(a, b);
        System.out.println(equals);

        Integer a1 = 1;
        Integer b1 = null;
        boolean equals1 = Objects.equals(a1, b1);
        System.out.println(equals1);

        Integer a2 = null;
        Integer b2 = null;
        boolean equals2 = Objects.equals(a2, b2);
        System.out.println(equals2);
    }
}
