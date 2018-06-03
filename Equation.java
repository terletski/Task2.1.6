import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.D;

public class Equation {
// поиск корней квадратного уравнения ax2 + bx + c = 0
    double D;

    public Equation(double a, double b, double c){

    D = (int) (b * b - (4 * a * c));// дискриминант
    if (D > 0) {                    // если дискриминант > 0
        double x1, x2;
        x1 = (-b - Math.sqrt(D)) / (2 * a);
        x2 = (-b + Math.sqrt(D)) / (2 * a);
        System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
    }
    else if (D == 0) {              // если дискриминант < 0
        double x;
        x = -b / (2 * a);
        System.out.println("Уравнение имеет единственный корень: x = " + x);
    }
    else {
        System.out.println("Уравнение не имеет вещественных корней!");
    }
}
    // аргументы a b c
    public static void main(String[] args) {
        if (args.length >= 3) {
            new Equation(Double.valueOf(args[0]), Double.valueOf(args[1]),
                    Double.valueOf(args[2]));
        } else {
            System.out.println("Введите параметы шаблону: 2 4 6");
            return;
        }
    }
}
