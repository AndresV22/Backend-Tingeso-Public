package tingeso.backend.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class StudentDto {
    private Integer id;
    private String name;
    private String rut;
    private String birthday;
    private String career;
}