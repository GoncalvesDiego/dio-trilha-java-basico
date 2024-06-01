public class autodromo {
    public static void main(String[] args) {
        carro jeep = new carro();
        jeep.setChassi("897897");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("467553");
        //z400.ligar();

        Veiculo coringa = jeep;

        coringa.ligar();
    }

}
