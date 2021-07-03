package connections.oneToOne;

public interface StudyService {
    
    Student createStudent(String name, RecordBook recordBook);
    
    RecordBook createRecordBook(String number);
    Student findStudentById(Long id);
}
