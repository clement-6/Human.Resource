package management.human.resource.service;

import management.human.resource.dto.job.JobCreateDto;
import management.human.resource.dto.job.JobResponse;
import management.human.resource.entity.Job;


public interface JobService {

    Job getInternalJob(String jobKey);
    JobResponse createJob(JobCreateDto dto);
}
