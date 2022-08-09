package pl.marcin.savingsapi;

import org.springframework.beans.factory.annotation.Autowired;

public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;
}
