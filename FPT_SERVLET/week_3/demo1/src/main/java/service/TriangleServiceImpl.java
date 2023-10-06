package service;

public class TriangleServiceImpl implements TriangleService {

    @Override
    public boolean checkTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
