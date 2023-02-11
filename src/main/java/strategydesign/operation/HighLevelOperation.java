package strategydesign.operation;

public class HighLevelOperation implements OperationInterface{

    @Override
    public void operation() {
        System.out.println("This is high level operation");
    }
}
