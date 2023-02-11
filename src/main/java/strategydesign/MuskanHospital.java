package strategydesign;

import strategydesign.operation.MediumLevelOperation;
import strategydesign.operation.OperationInterface;

public class MuskanHospital extends Hospital{
//    MuskanHospital(MediumLevelOperation mediumLevelOperation){
//        super(mediumLevelOperation);
//    }

    MuskanHospital(OperationInterface operationInterface){
        super(operationInterface);
    }
}
