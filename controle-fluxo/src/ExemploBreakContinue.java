public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3)
                break;

                System.out.println(numero);
        }
/*
        //continue
        for(int numero = 1; numero <= 5; numero++){
            continue;

            System.out.println(numero);
        }
*/
    }
}
