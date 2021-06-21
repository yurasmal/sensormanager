package by.ps.sensormanager.service;

import by.ps.sensormanager.entity.Sensor;
import by.ps.sensormanager.exception.SensorNotFoundException;
import by.ps.sensormanager.repository.SensorRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementation of {@link SensorService} interface.
 */

@Service
@Slf4j
public class JpaSensorService implements SensorService{

    private final SensorRepository sensorRepository;

    @Autowired
    public JpaSensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }


    @Override
    public Sensor addSensor(Sensor sensor) {
        log.info("IN JpaSensorService addSensor {}", sensor);
        return sensorRepository.save(sensor);
    }

    @Override
    public Sensor updateSensor(Sensor sensor) {
        log.info("IN JpaSensorService {}", sensor);
        return sensorRepository.save(sensor);
    }

    @Override
    public List<Sensor> getAllSensors() {
        log.info("IN JpaSensorService getAllSensors");
        return sensorRepository.findAll();
    }

    @Override
    public void deleteSensor(Long id) {
        log.info("IN JpaSensorService deleteSensor {}", id);
        sensorRepository.deleteSensorById(id);
    }

    @Override
    public Sensor findSensorById(Long id) {
        log.info("IN JpaSensorService findSensorById {}", id);
        return sensorRepository.findSensorById(id)
                .orElseThrow(() -> new SensorNotFoundException("Sensor by id " + id + " was not found"));
    }
}
