package lekcja23;

public class CalculatorApp {
    public static void main(String[] args) {
        CalculatorController calculatorController = new CalculatorController();
        NewFeature newFeature = new NewFeature();
        newFeature.start();
        //calculatorController.start();
    }
}
