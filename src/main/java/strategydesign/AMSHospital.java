package strategydesign;

import strategydesign.operation.HighLevelOperation;
import strategydesign.operation.OperationInterface;

public class AMSHospital extends Hospital{

    // --------------Old Strategy-------------------
//    @Override
//    public void operation() {
//        System.out.println("This is high level operation");
//    }

    // --------------new Strategy-------------------

    public AMSHospital(HighLevelOperation highLevelOperation) {
        super(highLevelOperation);
    }

}
