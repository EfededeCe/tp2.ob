public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // if
        int numeroIf = 48;

        if (numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf == 0) {
            System.out.println("El número es 0");
        } else {
            System.out.println("El número es negativo");
        }


        // while
        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile ++;
        }


        // do while
        int numeroDo = 5645;

        do {
            System.out.println(numeroDo);
            numeroDo ++;
        } while (numeroWhile < 0);

        // for
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }


        // switch
        String estacion = "No soy una estación";

        switch (estacion){
            case "Verano":
                System.out.println("La estación es Verano");
                break;
            case "Otoño":
                System.out.println("La estación es Otoño");
                break;
            case "Invierno":
                System.out.println("La estación es Invierno");
                break;
            case "Primavera":
                System.out.println("La estación es Primavera");
                break;
            default:
                System.out.println("No es una estación");
        }


    }
}