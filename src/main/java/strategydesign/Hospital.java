package strategydesign;

import strategydesign.operation.OperationInterface;

public class Hospital {

    // --------------Old Strategy-------------------
//    public void operation(){
//        System.out.println("This is main class operation");
//    }

    // --------------New Strategy-------------------

    public OperationInterface operationInterface;
    public Hospital(OperationInterface operationInterface){
        this.operationInterface=operationInterface;
    }


}
