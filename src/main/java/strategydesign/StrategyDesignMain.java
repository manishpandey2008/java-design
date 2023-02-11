package strategydesign;

import strategydesign.operation.HighLevelOperation;
import strategydesign.operation.MediumLevelOperation;

public class StrategyDesignMain {
    public static void main(String[] args) {
        // User for remove duplicate codes
        // Make a interface with some function and create implementation class
        // And use implementation class in our main class
        // Not create function direct in main function

        // old Strategy
//        Hospital hospital=new AMSHospital();
//        hospital.operation();

        // New Strategy
        //Hospital hospital=new MuskanHospital(new MediumLevelOperation());

        Hospital hospital=new MuskanHospital(new HighLevelOperation());
        hospital.operationInterface.operation();
    }
}
