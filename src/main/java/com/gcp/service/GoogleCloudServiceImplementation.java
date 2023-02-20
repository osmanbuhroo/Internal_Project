package com.gcp.service;

import com.gcp.entity.GoogleCloud;
import com.gcp.repo.GoogleCloudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.ServiceNotFoundException;
import java.util.Objects;
import java.util.Optional;

@Service
public class GoogleCloudServiceImplementation implements GoogleCloudService{

    @Autowired
    GoogleCloudRepo googleCloudRepo;

   public GoogleCloud addData(GoogleCloud googleCloud){
       return googleCloudRepo.save(googleCloud);
   }

   @Override
    public GoogleCloud find(long id) throws ServiceNotFoundException {
       Optional<GoogleCloud> googleCloud = googleCloudRepo.findById(id);
       if (Objects.isNull(googleCloud)) {
           throw new ServiceNotFoundException("Not found");

       }
       return googleCloud.get();
   }
   @Override
    public GoogleCloud updateData(Long id,GoogleCloud googleCloud) {
       GoogleCloud googleCloudDatabase = googleCloudRepo.findById(id).get();
       if (Objects.nonNull((googleCloud.getServiceName()))) {
           googleCloudDatabase.setServiceName((googleCloud.getServiceName()));
       }

       if(Objects.nonNull((googleCloud.getServiceCost()))){
           googleCloudDatabase.setServiceCost((googleCloud.getServiceCost()));
       }

       if(Objects.nonNull((googleCloud.getServiceId()))){
           googleCloudDatabase.setServiceId((googleCloud.getServiceId()));
       }
       return googleCloudRepo.save(googleCloudDatabase);
   }




}
