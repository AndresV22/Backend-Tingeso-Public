package tingeso.backend.mapper;

import org.springframework.stereotype.Component;
import tingeso.backend.dto.StudentDto;
import tingeso.backend.model.Student;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentMapper {

    public Student mapToModel(StudentDto studentDto){
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setRut(studentDto.getRut());
        student.setBirthday(studentDto.getBirthday());
        student.setCareer(studentDto.getCareer());
        return student;
    }

    public List<StudentDto> mapToDtoArrayList(List<Student> studentList) {
        int i;
        List<StudentDto> studentDtoArrayList = new ArrayList<>();
        for(i=0;i<studentList.size();i++){
            studentDtoArrayList.add(mapToDto(studentList.get(i)));
        }
        return studentDtoArrayList;
    }

    public StudentDto mapToDto (Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setRut(student.getRut());
        studentDto.setBirthday(student.getBirthday());
        studentDto.setCareer(student.getCareer());
        return studentDto;
    }
}