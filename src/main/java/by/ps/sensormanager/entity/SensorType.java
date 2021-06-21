package by.ps.sensormanager.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sensor_types")
@Data
public class SensorType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value")
    private String value;
}
