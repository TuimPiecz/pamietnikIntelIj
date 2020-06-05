package com.example.pamietnik.service;

import com.example.pamietnik.model.Wpis;

import java.util.List;

public interface WpisService {
    List<Wpis> getAllEntries();
    Wpis zapiszWpis(Wpis wpis);
    List<Wpis> getPublicEntries();
    void deleteAllData();
}
