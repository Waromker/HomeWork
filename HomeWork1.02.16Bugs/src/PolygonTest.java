import java.awt.*;

public class PolygonTest {
    public static void main(String[] args) {
        int[] xPoints = {-2, 2, -2, 2};
        int[] yPoints = {2, 2, -2, -2};

        Polygon polygon = new Polygon(xPoints, yPoints, xPoints.length);
        for (int i = -20;;i++){
            for (int j = -20;;j++) {

                boolean checkPoint = polygon.contains(i, j);
            //    System.out.print(checkPoint);//why false?) -> should be true)) нет совпадений в этих точка и я их не могу найти
                // я видимо не совсем понимаю построение многоугольника в пространстве
                if (checkPoint){
                    System.out.println(i+j);
                    break;
                }
            }}
    }
}
