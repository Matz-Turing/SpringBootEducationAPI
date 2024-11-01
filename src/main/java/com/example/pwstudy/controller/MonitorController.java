package com.example.pwstudy.controller;

import com.example.pwstudy.model.Monitor;
import com.example.pwstudy.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monitores")
public class MonitorController {
    @Autowired
    private MonitorService monitorService;

    @GetMapping
    public List<Monitor> findAll() {
        return monitorService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Monitor> findById(@PathVariable Long id) {
        return monitorService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Monitor> save(@RequestBody Monitor monitor) {
        return new ResponseEntity<>(monitorService.save(monitor), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        monitorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}