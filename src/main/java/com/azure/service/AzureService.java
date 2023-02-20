package com.azure.service;

import com.azure.entity.Azure;
import com.azure.exception.ServiceNotFondException;

public interface AzureService {
    Azure addData(Azure azure);
    Azure find(Long id) throws ServiceNotFondException;
    Azure updateData(Long id, Azure azure) throws ServiceNotFondException;
}
