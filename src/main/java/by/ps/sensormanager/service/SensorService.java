package by.ps.sensormanager.service;

import by.ps.sensormanager.entity.Sensor;

import java.util.List;

/**
 * Service interface for {@link Sensor} class.
 */

public interface SensorService {

    Sensor addSensor(Sensor sensor);

    Sensor updateSensor(Sensor sensor);

    List<Sensor> getAllSensors();

    void deleteSensor(Long id);

    Sensor findSensorById(Long id);
}
