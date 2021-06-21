package by.ps.sensormanager.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "sensor_units")
@Data
public class SensorUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value")
    private String value;
}
