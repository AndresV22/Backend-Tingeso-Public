package tingeso.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private String rut;
    @NonNull
    private String birthday;
    @NonNull
    private String career;
}