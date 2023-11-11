public class DescontoFeriado implements IDesconto{
    @Override
    public double calcularDesconto(double totalCompra) {
        return totalCompra * 0.1;
    }
}
