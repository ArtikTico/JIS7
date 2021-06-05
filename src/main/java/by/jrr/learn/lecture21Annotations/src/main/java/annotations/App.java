package annotations;

public class App {
    public static void main(String[] args) throws Exception {
        var calculatorObject = CalculatorObject.builder()
                .firstValue(addSomeInteger())
                .secondValue(addSomeInteger())
                .build();

        var calO = new CalculatorObject(addSomeInteger(), addSomeInteger());

        var timeFrameDefinitionProcessor = new TimeFrameDefinitionAnnotationProcessor();
        calculatorObject.setFirstValue(addSomeInteger());
        calculatorObject.setSecondValue(20);
        calculatorObject.calculate(1, 3);
        calculatorObject.calculate(10, 30);
    }

    private static Integer addSomeInteger() {
        return 10;
    }
}
