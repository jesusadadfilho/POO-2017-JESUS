package QuartaQuesta.Model.Model;

public class Circulo extends FigurasGeometricas {
    double Raio;

    @Override
    double CalculaArea() {
        return Raio * Raio * 3.14;
    }

    @Override
    double CalculaPerimetro() {
        return 2 * 3.14 * Raio;
    }
}
