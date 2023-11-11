public class CalculaDescontoDEPRECATED {
    private final TIPOS_DESCONTO tiposDesconto;

    public CalculaDescontoDEPRECATED(TIPOS_DESCONTO tiposDesconto) {
        this.tiposDesconto = tiposDesconto;
    }

    public double calcularDesconto(double totalCompra) {
        switch (tiposDesconto) {
            case FERIADO -> {
                return totalCompra * 0.1;
            }
            case SAZONAL -> {
                return totalCompra * 0.05;
            }
            case REGULAR -> {
                return totalCompra * 0.15;
            }
            default -> {
                return 0;
            }
        }
    }
}


