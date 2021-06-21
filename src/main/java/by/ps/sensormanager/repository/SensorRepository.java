package by.ps.sensormanager.repository;

import by.ps.sensormanager.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Repository interface for {@link Sensor} class.
 */

public interface SensorRepository extends JpaRepository<Sensor, Long> {

    void deleteSensorById(Long id);

    Optional<Sensor> findSensorById(Long id);
}
