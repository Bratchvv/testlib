package org.brainacad.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

@Value //все в final
public class BankCard {
    String bankName;
    String serialNumber;
    String cvv;
    boolean isPayPass;
}
