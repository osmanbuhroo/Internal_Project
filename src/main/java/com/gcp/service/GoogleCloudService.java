package com.gcp.service;

import com.gcp.entity.GoogleCloud;
import org.springframework.stereotype.Component;

import javax.management.ServiceNotFoundException;


public interface GoogleCloudService {

    GoogleCloud find(long id) throws ServiceNotFoundException;
    GoogleCloud addData(GoogleCloud googleCloud);

    GoogleCloud updateData(Long id,GoogleCloud googleCloud);
}
