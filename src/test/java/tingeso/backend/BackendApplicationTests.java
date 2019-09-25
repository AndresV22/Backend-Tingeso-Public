package tingeso.backend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tingeso.backend.dto.StudentDto;
import tingeso.backend.mapper.StudentMapper;
import tingeso.backend.model.Student;
import tingeso.backend.service.StudentService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BackendApplicationTests {

	@Test
	public void TestMapToModel() {
		StudentMapper studentMapper = new StudentMapper();
		StudentDto studentDto = new StudentDto();
		Student studentExpected = new Student();
		Student studentReal = new Student();

		//Set Parameter StudentDto
		studentDto.setId(1);
		studentDto.setName("Juanito Perez");
		studentDto.setRut("19.654.978-2");
		studentDto.setBirthday("12-07-95");
		studentDto.setCareer("Ingeniería Civil Informática");

		//Set Parameter StudentExpected
		studentExpected.setId(1);
		studentExpected.setName("Juanito Perez");
		studentExpected.setRut("19.654.978-2");
		studentExpected.setBirthday("12-07-95");
		studentExpected.setCareer("Ingeniería Civil Informática");

		//Testing Method
		studentReal = studentMapper.mapToModel(studentDto);
		assertEquals(studentExpected, studentReal);
	}

	@Test
	public void TestMapToDto() {
		StudentMapper studentMapper = new StudentMapper();
		Student student = new Student();
		StudentDto studentDtoExpected = new StudentDto();
		StudentDto studentDtoReal = new StudentDto();

		//Set Parameter Student
		student.setId(1);
		student.setName("Pedrito Contreras");
		student.setRut("18.765.021-k");
		student.setBirthday("07-10-93");
		student.setCareer("Ingeniería de Ejecución en Computación e Informática");

		//Set Parameter StudentDtoExpected
		studentDtoExpected.setId(1);
		studentDtoExpected.setName("Pedrito Contreras");
		studentDtoExpected.setRut("18.765.021-k");
		studentDtoExpected.setBirthday("07-10-93");
		studentDtoExpected.setCareer("Ingeniería de Ejecución en Computación e Informática");

		//Testing Method
		studentDtoReal = studentMapper.mapToDto(student);
		assertEquals(studentDtoExpected,studentDtoReal);
	}

	@Test
	public void TestMapToDtoArrayList() {
		StudentMapper studentMapper = new StudentMapper();
		List<Student> studentArrayList = new ArrayList<>();
		List<StudentDto> studentDtoArrayList = new ArrayList<>();
		Student student = new Student();
		Student student2 = new Student();

		//Set Student 1
		student.setId(1);
		student.setName("Pedrito Contreras");
		student.setRut("18.765.021-k");
		student.setBirthday("07-10-93");
		student.setCareer("Ingeniería de Ejecución en Computación e Informática");

		//Set Student 2
		student2.setId(2);
		student2.setName("Juanito Perez");
		student2.setRut("19.654.978-2");
		student2.setBirthday("12-07-95");
		student2.setCareer("Ingeniería Civil Informática");

		//Add Students to array list
		studentArrayList.add(student);
		studentArrayList.add(student2);

		//Testing Method
		studentDtoArrayList = studentMapper.mapToDtoArrayList(studentArrayList);
		assertNotNull(studentDtoArrayList);

	}

	@Test
	public void TestGetAllStudents() {
		StudentService studentService = new StudentService();
		List<StudentDto> studentDtoList = studentService.getAllStudents();
		assertNotNull("There's no Students in the data base", studentDtoList);
	}

	@Test
	public void TestGetStudentdById() {
		StudentService studentService = new StudentService();
		StudentDto studentDtoExpected = new StudentDto();
		StudentDto studentDtoReal = new StudentDto();

		//Set Parameter Student
		studentDtoExpected.setId(1);
		studentDtoExpected.setName("Julio");
		studentDtoExpected.setRut("19700195k");
		studentDtoExpected.setBirthday("2019-10-22");
		studentDtoExpected.setCareer("Ingeniería Civil Informática");

		//Testing Method
		studentDtoReal = studentService.getStudentById(1);
		assertEquals(studentDtoExpected, studentDtoReal);

	}
}
