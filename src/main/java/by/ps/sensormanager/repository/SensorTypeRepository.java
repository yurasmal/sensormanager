package by.ps.sensormanager.repository;

import by.ps.sensormanager.entity.SensorType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link SensorType} class.
 */

public interface SensorTypeRepository extends JpaRepository<SensorType, Long> {
}
