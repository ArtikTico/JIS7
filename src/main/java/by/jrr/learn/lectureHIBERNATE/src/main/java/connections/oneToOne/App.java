package connections.oneToOne;

public class App {
    public static void main(String[] args) {
        StudyService studyService = new StudyServiceImpl();
        var recordBook = studyService.createRecordBook("ABA-1001-PM");
        Student artemiy = studyService.createStudent("Artemiy", recordBook);
        Student studentById = studyService.findStudentById(1L);
        System.out.println(studentById);
    }
}
