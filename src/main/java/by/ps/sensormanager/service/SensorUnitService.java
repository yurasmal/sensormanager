package by.ps.sensormanager.service;

import by.ps.sensormanager.entity.SensorUnit;
import by.ps.sensormanager.repository.SensorUnitRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SensorUnitService {

    private final SensorUnitRepository sensorUnitRepository;

    @Autowired
    public SensorUnitService(SensorUnitRepository sensorUnitRepository) {
        this.sensorUnitRepository = sensorUnitRepository;
    }

    public List<SensorUnit> getAllSensorUnits() {
        log.info("IN SensorUnitService getAllSensorUnits");
        return sensorUnitRepository.findAll();
    }
}
