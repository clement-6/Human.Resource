package management.human.resource.repository;

import management.human.resource.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface JobRepository extends JpaRepository<Job,Long> {

    Optional<Job> findJobByJobKey(String jobKey);
}
