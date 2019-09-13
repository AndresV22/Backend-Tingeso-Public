package tingeso.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tingeso.backend.dto.StudentDto;
import tingeso.backend.service.StudentService;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<List<StudentDto>> getAllStudents(){
        try{
            return ResponseEntity.ok(studentService.getAllStudents());
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<StudentDto> getStudentById (@PathVariable("id") Integer id){
        try{
            return ResponseEntity.ok(studentService.getStudentById(id));
        }catch(Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity createStudent (@RequestBody StudentDto studentDto){
        try{
            return ResponseEntity.ok(studentService.createStudent(studentDto));
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/edit/{id}")
    @ResponseBody
    public ResponseEntity updateStudent (@PathVariable("id") Integer id, @RequestBody StudentDto studentDto){
        try{
            studentService.updateStudent(studentDto, id);
            return ResponseEntity.ok(HttpStatus.OK);
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public ResponseEntity deleteStudent (@PathVariable Integer id){
        try{
            studentService.deleteStudent(id);
            return ResponseEntity.ok(HttpStatus.OK);
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}