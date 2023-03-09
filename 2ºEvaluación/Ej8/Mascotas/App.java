public class App {

  public static void main(String[] args) throws Exception {

    System.out.println("...........................");
    System.out.println("          PERRO");
    System.out.println("............................");
    System.out.println(" ");
    Perro miPerro = new Perro();

    String miraza = "Doberman";

    //RAZA//

    miPerro.setRaza(miraza);
    System.out.println("RAZA:");
    System.out.println(miPerro.getRaza());


    //PULGAS//
    System.out.println("PULGAS:");

    miPerro.setPulgas(false);

    if (miPerro.isPulgas() == false) {
      System.out.println("No tiene pulgas");
    } else {
      System.out.println("Si tiene pulgas");
    }

    //LADRA O HABLA//
    System.out.println("HABLA:");
    miPerro.habla();

    System.out.println(" ");
    System.out.println("...........................");
    System.out.println("          GATO");
    System.out.println("............................");
    System.out.println(" ");

    //COLOR//
    System.out.println("COLOR:");
    Gato miGato = new Gato();

    String miColor = "Blanco";

    miGato.setColor(miColor);

    System.out.println(miGato.getColor());

    //PELO LARGO//
    System.out.println("PELO:");
    miGato.setPeloLargo(true);

    if(miGato.isPeloLargo() == true){
        System.out.println("Mi gato tiene el pelo largo");
    }else{
        System.out.println("Mi gato no tiene el pelo largo");
    }

    //HABLAR O MAULLAR//
    System.out.println("HABLA:");
    miGato.habla();


    System.out.println(" ");
    System.out.println("...........................");
    System.out.println("          LORO");
    System.out.println("............................");
    System.out.println(" ");

    Loro miLoro = new Loro();

    String miOrigen = "Tropical";

    miLoro.setOrigen((miOrigen));
    System.out.println("ORIGEN:");

    System.out.println(miLoro.getOrigen());

    System.out.println("SALUDA:");
    miLoro.saluda();

    System.out.println("VUELA:");
    miLoro.volar();

  }
}
