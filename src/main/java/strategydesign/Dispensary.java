package strategydesign;

import strategydesign.operation.NormalOperation;
import strategydesign.operation.OperationInterface;

public class Dispensary extends Hospital{

    ////// We are going to use parent operation function
    public Dispensary(NormalOperation normalOperation) {
        super(normalOperation);
    }
}
