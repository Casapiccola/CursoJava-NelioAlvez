package models.services;

import models.entities.Contract;
import models.entities.Installment;

import java.util.ArrayList;
import java.util.List;

public class ContractService {

    private OnlinePaymentService service;

    public ContractService(OnlinePaymentService service) {
        this.service = service;
    }

    public void processContract(Contract contract, Integer months) {
        for (int i = 1; i <= months; i++) {
            double value = contract.getTotalValue() / months;
            value += service.interest(value, i);
            value += service.paymentFee(value);
            contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), value));
        }
    }
}
