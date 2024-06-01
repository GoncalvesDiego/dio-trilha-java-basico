public class carro extends Veiculo {
   
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    
    }
    private void confereCombustivel() {
        System.out.println("Conferindo Combustivel");
        
    }

    private void confereCambio() {
        System.out.println("Conferindo Cambio em P");
    }    
}
