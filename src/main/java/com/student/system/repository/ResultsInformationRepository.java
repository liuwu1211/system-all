package com.student.system.repository;

import com.student.system.domain.ResultsInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        collectionResourceRel = "results-information",
        path = "results-information",
        itemResourceRel = "results-information")
public interface ResultsInformationRepository extends JpaRepository<ResultsInformation, String> {
}
