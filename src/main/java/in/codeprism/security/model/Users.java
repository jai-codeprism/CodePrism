package in.codeprism.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
public class Users {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Integer id;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="name")
    private String name;
    @Column(name="last_name")
    private String lastName;
    @Column(name="active")
    private Integer active;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles",joinColumns = @JoinColumn(name="user"))
    private Set<Roles> role;

    public Users(Users users) {
        this.active=users.getActive();
        this.email= users.getEmail();
        this.id=users.getId();
        this.lastName=users.getLastName();
        this.name= users.getName();
        this.password=users.getPassword();
        this.role=users.getRole();
    }
}
