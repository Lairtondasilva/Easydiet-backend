package com.gft.dietsgroups.services;

import java.util.List;
import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gft.dietsgroups.models.PatientModel;

@FeignClient("patient-service")
@Service
public interface PatientService {

    @GetMapping(value = "/patient/diets-groups/{dietGroupId}")
    List<PatientModel> findPatientByDietsGroupsId(@PathVariable UUID dietGroupId);
}
