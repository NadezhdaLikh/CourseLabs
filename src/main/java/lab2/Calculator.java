package lab2;

public class Calculator {

    // Суммирование
    public int add(int x, int y) {
        return x + y;
    }

    public long add(long x, long y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    // Вычитание
    public int sub(int x, int y) {
        return x - y;
    }

    public long sub(long x, long y) {
        return x - y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    // Умножение
    public int mul(int x, int y) {
        return x * y;
    }

    public long mul(long x, long y) {
        return x * y;
    }

    public double mul(double x, double y) {
        return x * y;
    }

    // Деление
    public double div(int x, int y) {
        if (y == 0) throw new ArithmeticException("Делить на ноль нельзя!");
        return (double) x / y;
    }

    public double div(long x, long y) {
        if (y == 0) throw new ArithmeticException("Делить на ноль нельзя!");
        return (double) x / y;
    }

    public double div(double x, double y) {
        if (y == 0) throw new ArithmeticException("Делить на ноль нельзя!");
        return x / y;
    }
}
