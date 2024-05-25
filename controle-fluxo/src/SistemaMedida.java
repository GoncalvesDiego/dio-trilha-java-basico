public class SistemaMedida {
    public static void main(String[] args) {
        /*String sigla = "M";

        if(sigla == "P")
            System.out.println("Pequeno");
        else if(sigla == "M")
            System.out.println("Médio");
        else if(sigla == "G")
            System.out.println("Grande");
        else 
        System.out.println("Indefinido");
*/

        //Switch case

        String sigla = "M";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}

    }

    
}
