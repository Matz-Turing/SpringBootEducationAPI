package com.example.pwstudy.service;

import com.example.pwstudy.model.Monitor;
import com.example.pwstudy.repository.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonitorService {
    @Autowired
    private MonitorRepository monitorRepository;

    public List<Monitor> findAll() {
        return monitorRepository.findAll();
    }

    public Optional<Monitor> findById(Long id) {
        return monitorRepository.findById(id);
    }

    public Monitor save(Monitor monitor) {
        return monitorRepository.save(monitor);
    }

    public void delete(Long id) {
        monitorRepository.deleteById(id);
    }
}