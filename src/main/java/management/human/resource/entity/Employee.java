package management.human.resource.entity;

import management.human.resource.enums.EmployeeStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EMPLOYEE")
public class Employee extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEE_GEN")
    @SequenceGenerator(name = "EMPLOYEE_GEN", sequenceName = "EMPLOYEE_SEQ", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private long id;

    @Column(name = "EMPLOYEE_KEY",nullable = false, unique = true, updatable = false)
    @UuidGenerator
    private String employeeKey;

    @Column(name = "NAME", nullable = false)
    private String employeeName;

    @Column(name = "EMAIL", nullable = false)
    @Email
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "JOB_KEY", referencedColumnName = "JOB_KEY")
    private Job job;

    @Column(name = "PHONE", nullable = false)
    private String phone;

    @Column(name = "BIRTH_DATE", nullable = false)
    private Date birthDate;

    @Column(name = "MATRICULE", nullable = false)
    private String matricule;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;
}
