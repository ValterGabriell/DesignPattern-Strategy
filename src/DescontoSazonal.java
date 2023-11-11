public class DescontoSazonal implements IDesconto{
    @Override
    public double calcularDesconto(double totalCompra) {
        return totalCompra * 0.05;
    }
}
