public class UseGeometric2 {
    public static void main(String[] args) {
        GeometricFigure2[] arr = new GeometricFigure2[2];
        arr[0] = new Square2(20);
        arr[1] = new Triangle2(20, 10);

        for(int i = 0; i < 2; i++){
            arr[i].printSides();
        }
    }
}
