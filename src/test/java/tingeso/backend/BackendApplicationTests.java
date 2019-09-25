package tingeso.backend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tingeso.backend.dto.StudentDto;
import tingeso.backend.mapper.StudentMapper;
import tingeso.backend.model.Student;
import tingeso.backend.service.StudentService;

import static org.junit.Assert.assertEquals;

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
	

}
