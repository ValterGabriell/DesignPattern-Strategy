public class Main {
    public static void main(String[] args) {
        double valorCompra = 10.5;
      /*
        CalculaDescontoDEPRECATED calculaDescontoDEPRECATED
                = new CalculaDescontoDEPRECATED(TIPOS_DESCONTO.FERIADO);
        double totalDesconto = calculaDescontoDEPRECATED.calcularDesconto(valorCompra);
        double valorTotal = valorCompra - totalDesconto;
        System.out.println("Valor compra: " + valorTotal);
       */

        IDesconto iDesconto = new NovoDesconto();
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto(iDesconto);
        double desconto = calculadoraDeDesconto.calculaDesconto(valorCompra);
        double totalValor = valorCompra - desconto;
        System.out.println("Valor total: " + totalValor);
    }
}