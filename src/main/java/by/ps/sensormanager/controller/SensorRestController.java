package by.ps.sensormanager.controller;

import by.ps.sensormanager.entity.Sensor;
import by.ps.sensormanager.entity.SensorType;
import by.ps.sensormanager.entity.SensorUnit;
import by.ps.sensormanager.service.SensorService;
import by.ps.sensormanager.service.SensorTypeService;
import by.ps.sensormanager.service.SensorUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sensors")
public class SensorRestController {

    private final SensorService sensorService;

    private final SensorTypeService sensorTypeService;

    private final SensorUnitService sensorUnitService;

    @Autowired
    public SensorRestController(SensorService sensorService, SensorTypeService sensorTypeService, SensorUnitService sensorUnitService) {
        this.sensorService = sensorService;
        this.sensorTypeService = sensorTypeService;
        this.sensorUnitService = sensorUnitService;
    }

    @GetMapping
    public ResponseEntity<List<Sensor>> getAllSensors() {
        List<Sensor> sensors = sensorService.getAllSensors();
        return new ResponseEntity<>(sensors, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sensor> getSensorById(@PathVariable("id") Long id) {
        Sensor sensor = sensorService.findSensorById(id);
        return new ResponseEntity<>(sensor, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Sensor> addSensor(@RequestBody Sensor sensor) {
        Sensor newSensor = sensorService.addSensor(sensor);
        return new ResponseEntity<>(newSensor, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Sensor> updateSensor(@RequestBody Sensor sensor) {
        Sensor updateSensor = sensorService.updateSensor(sensor);
        return new ResponseEntity<>(updateSensor, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSensor(@PathVariable("id") Long id) {
        sensorService.deleteSensor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/types")
    public ResponseEntity<List<SensorType>> getSensorTypes() {
        List<SensorType> sensorTypes = sensorTypeService.getAllSensorTypes();
        return new ResponseEntity<>(sensorTypes, HttpStatus.OK);
    }

    @GetMapping("/units")
    public ResponseEntity<List<SensorUnit>> getSensorUnits() {
        List<SensorUnit> sensorUnits = sensorUnitService.getAllSensorUnits();
        return new ResponseEntity<>(sensorUnits, HttpStatus.OK);
    }
}
