package com.gft.finance.services;

import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gft.finance.models.PatientModel;

@FeignClient("patient-service")
public interface PatientService {

    @GetMapping("/patient/{id}")
    public PatientModel getPatientById(@PathVariable UUID id);
}