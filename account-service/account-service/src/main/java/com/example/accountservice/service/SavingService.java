package com.example.accountservice.service;
import com.example.accountservice.model.Saving;
import com.example.accountservice.repository.SavingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SavingService {

    private final SavingRepository savingRepository;

    public SavingService(SavingRepository savingRepository) {
        this.savingRepository = savingRepository;
    }

    public List<Saving> getAllSavings() {
        return savingRepository.findAll();
    }

    public Saving getSaving(String accountID) {
        return savingRepository.findById(accountID).orElse(null);
    }


    public Saving create(Saving saving) {
        return savingRepository.save(saving);
    }

    public void delete(String accountID) {
       savingRepository.deleteById(accountID);
    }

    public Saving update(Saving saving, String accountID) {
        Saving saving1= savingRepository.findById(accountID).get();
        saving1.setAccount_number(saving.getAccount_number());
      saving1.setCustomer_name(saving.getCustomer_name());
       saving1.setAccount_balance(saving.getAccount_balance());
         saving1.setBranch_name(saving.getBranch_name());
         savingRepository.save( saving1);
        return  saving1;
    }

    public void deleteAll() {
        savingRepository.deleteAll();
    }
}
