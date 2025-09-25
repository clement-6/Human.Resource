package management.human.resource.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @Version
    @Column(name = "VERSION" , nullable = false)
    private Long version;

    @Column(name = "CREATED", nullable = false, updatable = false)
    @CreatedDate
    private LocalDateTime createdDate;


    @Column(name = "LAST_MODIFIED", nullable = false)
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @Column(name = "CREATED_BY")
    @CreatedBy
    private String createdBy;

    @Column(name = "LAST_MODIFIED_BY")
    @LastModifiedBy
    private String lastModifiedBy;
}
