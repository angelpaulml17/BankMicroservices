package com.example.accountservice.controller;
import com.example.accountservice.model.Saving;
import com.example.accountservice.service.SavingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/account")
@RestController
public class SavingController {
    private final SavingService savingService;

    public SavingController(SavingService savingService) {
        this.savingService = savingService;
    }

    @GetMapping("/getAllSavings")
    public List<Saving> getAllSavings() {
        return savingService.getAllSavings();
    }

    @GetMapping("/get/{accountID}")
    public Saving getSaving(@PathVariable String accountID) {
        return savingService.getSaving(accountID);
    }

    @PostMapping("/createSaving")
    public Saving createSaving(@RequestBody Saving saving) {
        return savingService.create(saving);
    }

    @DeleteMapping("/deleteSaving/{accountID}")
    public String deleteSaving(@PathVariable String accountID) {
        savingService.delete(accountID);
        return "Savings Deleted";
    }

    @PutMapping("/updateSaving/{accountID}")
    public Saving updateSaving(@RequestBody Saving saving, @PathVariable String accountID) {
        return savingService.update(saving, accountID);
    }

    @DeleteMapping("/deleteAll")
    public String deleteSavings() {
        savingService.deleteAll();
        return "All savings data deleted";
    }
}
