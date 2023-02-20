package com.azure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Azure {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serviceId;
    @NotBlank(message = "Service name can not be blank")
    private  String serviceName;
    @NotBlank(message = "Service cost can not be blank")
    private Double serviceCost;
    @NotBlank(message = "Service description can not be blank")
    private String ServiceDescription;
}
