package management.human.resource.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "JOB")
public class Job extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "JOB_GEN")
    @SequenceGenerator(name = "JOB_GEN", sequenceName = "JOB_SEQ", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private long id;

    @Column(name = "JOB_KEY", nullable = false, unique = true)
    @UuidGenerator
    private String jobKey;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;
}
