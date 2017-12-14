package QuartaQuesta.Model.Model;

public class Quadrado  extends FigurasGeometricas {
    double lado;
    @Override
    double CalculaArea() {
        return lado * lado;
    }

    @Override
    double CalculaPerimetro() {
        return lado * 4;
    }
}
