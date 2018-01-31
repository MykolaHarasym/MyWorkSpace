package JavaPartFour;

public class Test {
    private static RandomShapeGenerator generator = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape [] s = new Shape[20];
        for(Shape shap: s){
            shap = generator.next();
            shap.draw();
        }

    }
}
