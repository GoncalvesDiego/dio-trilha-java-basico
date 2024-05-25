public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSaldo = 22.0;

        if(valorSaldo < saldo){

            saldo = saldo - valorSaldo;
            System.out.println("Novo Saldo: " + saldo);

        }else
            System.out.println("Saldo Insuficiente");

    }
    
}