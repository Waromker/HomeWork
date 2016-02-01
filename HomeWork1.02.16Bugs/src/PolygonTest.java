import java.awt.*;

public class PolygonTest {
    public static void main(String[] args) {
        int[] xPoints = {-2, 2, -2, 2};
        int[] yPoints = {2, 2, -2, -2};

        Polygon polygon = new Polygon(xPoints, yPoints, xPoints.length);
        for (int i: xPoints){
            for (int j : yPoints) {

                boolean checkPoint = polygon.contains(i, j);
            //    System.out.print(checkPoint);//why false?) -> should be true)) нет совпадений в этих точка и я их не могу найти
                // нашел -4 и -4 =)
                if (checkPoint){
                    System.out.println(i+j);
                    break;
                }
            }}
    }
}
