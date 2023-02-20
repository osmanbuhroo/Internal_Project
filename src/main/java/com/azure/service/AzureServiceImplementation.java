package com.azure.service;

import com.azure.entity.Azure;
import com.azure.exception.ServiceNotFondException;
import com.azure.repository.AzureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;

@Component
public class AzureServiceImplementation implements AzureService{

    @Autowired
    AzureRepository azureRepository;

    public Azure addData(Azure azure) {
        return azureRepository.save(azure);
    }

    @Override
    public Azure find(Long id) throws ServiceNotFondException {
        Optional<Azure> azure=azureRepository.findById(id);
        if (Objects.isNull(azure)){
            throw new ServiceNotFondException("ID does not belongs to any Data");
        }
        return azure.get();
    }

    @Override
    public Azure updateData(Long id, Azure azure) throws ServiceNotFondException {
        Azure azureDatabase = azureRepository.findById(id).get();
        if (Objects.isNull(azureDatabase)){
            throw new ServiceNotFondException("ID does not belongs to any Data");
        }
        if (Objects.nonNull(azure.getServiceName())) {
            azureDatabase.setServiceName((azure.getServiceName()));
        }

        if (Objects.nonNull(azure.getServiceCost())) {
            azureDatabase.setServiceCost(azure.getServiceCost());
        }

        if (Objects.nonNull(azure.getServiceDescription())) {
            azureDatabase.setServiceDescription((azure.getServiceDescription()));
        }
        return azureRepository.save(azureDatabase);
    }


}
