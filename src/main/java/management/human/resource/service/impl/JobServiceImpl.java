package management.human.resource.service.impl;

import lombok.RequiredArgsConstructor;
import management.human.resource.dto.job.JobCreateDto;
import management.human.resource.dto.job.JobResponse;
import management.human.resource.entity.Job;
import management.human.resource.exception.ExceptionsMessages;
import management.human.resource.exception.ResourceNotFoundException;
import management.human.resource.mappers.JobMappers;
import management.human.resource.repository.JobRepository;
import management.human.resource.service.JobService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JobServiceImpl implements JobService {


    private final JobRepository jobRepository;
    private final JobMappers jobMappers;

    public Job getInternalJob(String jobKey) {
        return jobRepository.findJobByJobKey(jobKey).orElseThrow(() -> new ResourceNotFoundException(ExceptionsMessages.M_RESOURCE_NOT_FOUND,"The post with the key has not been found"));
    }

    @Override
    public JobResponse createJob(JobCreateDto dto) {
        Job job = jobMappers.mapToEntity(dto);
        return jobMappers.mapToResponse(jobRepository.save(job));
    }
}
