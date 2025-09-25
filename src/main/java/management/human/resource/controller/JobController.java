package management.human.resource.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import management.human.resource.dto.job.JobCreateDto;
import management.human.resource.dto.job.JobResponse;
import management.human.resource.service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static management.human.resource.ApiConstant.API_ROOT_SERVICE;
import static management.human.resource.ApiConstant.JOB;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_ROOT_SERVICE + JOB)
public class JobController {

    private final JobService jobService;

    @PostMapping
    public ResponseEntity<JobResponse> createJob(@Valid @RequestBody JobCreateDto dto) {
        return new ResponseEntity<>(jobService.createJob(dto), HttpStatus.CREATED);
    }
}
