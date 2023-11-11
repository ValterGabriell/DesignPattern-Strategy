public class CalculadoraDeDesconto {
    private final IDesconto iDesconto;

    public CalculadoraDeDesconto(IDesconto iDesconto) {
        this.iDesconto = iDesconto;
    }

    public double calculaDesconto(double totalCompra){
        return iDesconto.calcularDesconto(totalCompra);
    }
}
