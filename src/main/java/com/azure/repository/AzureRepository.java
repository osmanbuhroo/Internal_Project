package com.azure.repository;

import com.azure.entity.Azure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AzureRepository extends JpaRepository<Azure, Long> {
}
