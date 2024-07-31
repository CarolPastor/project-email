package next.school.cesar.project_email.entities;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Entity 
@Data 
@Builder 
@NoArgsConstructor 
@AllArgsConstructor 
public class UserEntity implements Serializable{
	private static final long serialVersionUID = 1L;

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private UUID id;

    
    @NotNull(message = "O Campo name Não pode ser vazio.")
    @Column(nullable = false) 
    private String name;
 
    
    @NotNull(message = "O campo Email não pode ser vazio.")
    @Column(nullable = false, unique = true) 
    private String email;
    
    @NotNull(message = "O campo institution não pode ser vazio.")
    @Column(nullable = false) 
    private String institution;
}

