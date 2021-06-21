package by.ps.sensormanager.service;

import by.ps.sensormanager.entity.SensorType;
import by.ps.sensormanager.repository.SensorTypeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SensorTypeService {

    private final SensorTypeRepository sensorTypeRepository;

    @Autowired
    public SensorTypeService(SensorTypeRepository sensorTypeRepository) {
        this.sensorTypeRepository = sensorTypeRepository;
    }

    public List<SensorType> getAllSensorTypes() {
        log.info("IN SensorTypeService getAllSensorTypes");
        return sensorTypeRepository.findAll();
    }
}
