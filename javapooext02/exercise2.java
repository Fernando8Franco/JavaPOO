package javapooext02;

import javapooext02.Entity.Points;
import javapooext02.Service.PointService;

public class exercise2 {
    public static void main(String[] args) {
        Points points = PointService.createPoints();
        PointService.distance(points);
    }
}
