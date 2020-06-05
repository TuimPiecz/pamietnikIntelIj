package com.example.pamietnik.service;

import com.example.pamietnik.model.Wpis;
import com.example.pamietnik.repository.WpisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WpisServiceImpl implements WpisService{
    private WpisRepository wpisRepository;

    @Autowired
    public WpisServiceImpl(WpisRepository wpisRepository){
        this.wpisRepository = wpisRepository;
    }

    @Override
    public List<Wpis> getAllEntries(){
        return this.wpisRepository.findAll();
    }

    @Override
    public List<Wpis> getPublicEntries(){
        return this.wpisRepository.getPublicEntries();
    }

    @Override
    public Wpis zapiszWpis(Wpis wpis){
        return this.wpisRepository.saveAndFlush(wpis);
    }

    @Override
    public void deleteAllData(){
        wpisRepository.deleteAll();
    }
}
