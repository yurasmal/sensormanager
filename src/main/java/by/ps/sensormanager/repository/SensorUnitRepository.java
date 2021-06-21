package by.ps.sensormanager.repository;

import by.ps.sensormanager.entity.SensorUnit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link SensorUnit} class.
 */

public interface SensorUnitRepository extends JpaRepository<SensorUnit, Long> {
}
