package management.human.resource.mappers;

import management.human.resource.dto.job.JobCreateDto;
import management.human.resource.dto.job.JobResponse;
import management.human.resource.dto.job.JobUpdateDto;
import management.human.resource.entity.Job;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface JobMappers {

    Job mapToEntity(JobCreateDto jobCreateDto);

    JobResponse mapToResponse(Job job);

    Job mapToUpdate(JobUpdateDto jobUpdateDto, @MappingTarget Job job);
}
