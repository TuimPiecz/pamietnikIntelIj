package com.example.pamietnik.controller;

import com.example.pamietnik.model.Wpis;
import com.example.pamietnik.service.WpisService;
import com.example.pamietnik.service.WpisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/wpisy")
public class WpisController {
    private final WpisServiceImpl wpisService;

    @Autowired
    public WpisController(WpisServiceImpl wpisService){
        this.wpisService = wpisService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Wpis>> getAllEntries(){
        List<Wpis> wpisy = wpisService.getAllEntries();
        if(wpisy.size() != 0)return new ResponseEntity<>(wpisy, HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/public")
    public ResponseEntity<List<Wpis>> getPublicEntries(){
        List<Wpis> wpisy = wpisService.getPublicEntries();
        if(wpisy.size() != 0)return new ResponseEntity<>(wpisy, HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/save")
    public ResponseEntity<Wpis> zapiszWpis(@RequestBody Wpis wpis){
        return new ResponseEntity<>(wpisService.zapiszWpis(wpis), HttpStatus.OK);
    }

    @DeleteMapping("/delete/all")
    public void deleteAll(){wpisService.deleteAllData();}

}
