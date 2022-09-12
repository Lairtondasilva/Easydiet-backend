package com.gft.nutritionist.services;

import java.util.List;
import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gft.nutritionist.model.DietGroupModel;

@FeignClient(name = "diets-groups-service")
public interface DietGroupService {

    @GetMapping(value = "/diet-groups/nutritionist/{nutritionistId}")
    List<DietGroupModel> findDietsGroupsByNutritionistId(@PathVariable("nutritionistId") UUID nutritionistId);
}