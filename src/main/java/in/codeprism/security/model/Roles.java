package in.codeprism.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Roles {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="role")
    private String role;
}
