package QuartaQuesta.Model.Model;

public class Triangulo extends FigurasGeometricas {
    double base;
    double altura;
    double L1;
    double L2;
    double L3;

    @Override
    double CalculaPerimetro() {
        return L1 + L2 + L3;
    }

    @Override
    double CalculaArea() {
        return (base * altura) / 2;
    }
}
