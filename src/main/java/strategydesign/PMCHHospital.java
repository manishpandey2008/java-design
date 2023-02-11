package strategydesign;

import strategydesign.operation.HighLevelOperation;

public class PMCHHospital extends Hospital{
    // --------------Old Strategy-------------------
//    @Override
//    public void operation() {
//        System.out.println("This is high level operation");
//    }

    // --------------New Strategy-------------------

    public PMCHHospital(HighLevelOperation highLevelOperation){
        super(highLevelOperation);
    }

}
