package com.gcp.entity;

import com.gcp.repo.GoogleCloudRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class GoogleCloud {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ServiceId;

    @NotBlank(message="Service name can not be blank")
    private String ServiceName;
    @NotBlank(message="Service name can not be blank")
    private double ServiceCost;
    @NotBlank(message="Service name can not be blank")
    private String ServiceDescription;


}
