package tingeso.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tingeso.backend.dao.StudentDao;
import tingeso.backend.dto.StudentDto;
import tingeso.backend.mapper.StudentMapper;
import tingeso.backend.model.Student;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private StudentDao studentDao;

    public List<StudentDto> getAllStudents(){
        List<Student> studentList = studentDao.findAll();
        return studentMapper.mapToDtoArrayList(studentList);
    }

    public StudentDto getStudentById(Integer id){
        if(studentDao.findById(id).isPresent()){
            return studentMapper.mapToDto(studentDao.findStudentById(id));
        }else{
            return  null;
        }
    }

    public StudentDto createStudent(StudentDto studentDto){return studentMapper.mapToDto(studentDao.save(studentMapper.mapToModel(studentDto))); }

    public void updateStudent(StudentDto studentDto, Integer id){
        if(studentDao.findById(id).isPresent()){
            Student studentFinded = studentDao.findStudentById(id);
            studentFinded.setName(studentDto.getName());
            studentFinded.setRut(studentDto.getRut());
            studentFinded.setBirthday(studentDto.getBirthday());
            studentFinded.setCareer(studentDto.getCareer());
            studentDao.save(studentFinded);
        }
    }

    public void deleteStudent(Integer id){
        studentDao.delete(studentDao.findStudentById(id));
    }
}