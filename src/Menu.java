public class Menu {

    public void principal(){
        System.out.println("""
                
                ************************************************************
                Sea bienvenido/a al Conversor de moneda
                
                1) Dolar =>> Peso argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real brasileño
                4) Real brasileño =>> Dolar
                5) Dolar =>>  Peso colombiano 
                6) Peso colombiano =>> Dolar
                7) Salir
                Elija una opcion valida:
        
                ************************************************************
                
                """);
    }

    public void resultado(double monto, String monedaBase, double resultado, String monedaDestino){
        System.out.println(monto + " " + monedaBase + " son " + resultado + " " + monedaDestino+"\n");
    }

    public void casos(int eleccion, double monto){
        ConversorMoneda conversor = new ConversorMoneda();

        double resultadoMonto = 0;

        switch (eleccion){
            case 1:
               resultadoMonto = conversor.obtenerTasaDeCambio("USD","ARS", monto);
               this.resultado(monto,"USD",resultadoMonto,"ARS");
               break;
            case 2:
                resultadoMonto = conversor.obtenerTasaDeCambio("ARS","USD", monto);
                this.resultado(monto,"ARS",resultadoMonto,"USD");
                break;
            case 3:
                resultadoMonto = conversor.obtenerTasaDeCambio("USD","BRL", monto);
                this.resultado(monto,"USD",resultadoMonto,"BRL");
                break;
            case 4:
                resultadoMonto = conversor.obtenerTasaDeCambio("BRL","USD", monto);
                this.resultado(monto,"BRL",resultadoMonto,"USD");
                break;
            case 5:
                resultadoMonto = conversor.obtenerTasaDeCambio("USD","COP", monto);
                this.resultado(monto,"USD",resultadoMonto,"COP");
                break;
            case 6:
                resultadoMonto = conversor.obtenerTasaDeCambio("COP","USD", monto);
                this.resultado(monto,"COP",resultadoMonto,"USD");
                break;

            default:
                System.out.println("Opcion no valida, por favor intentelo de nuevo");
        }
    }
}
