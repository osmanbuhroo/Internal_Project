package com.gcp.repo;

import com.gcp.entity.GoogleCloud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoogleCloudRepo extends JpaRepository<GoogleCloud, Long> {



}
