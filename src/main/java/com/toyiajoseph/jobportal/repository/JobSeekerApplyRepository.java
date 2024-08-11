package com.toyiajoseph.jobportal.repository;

import com.toyiajoseph.jobportal.entity.JobPostActivity;
import com.toyiajoseph.jobportal.entity.JobSeekerApply;
import com.toyiajoseph.jobportal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity userId);
}
