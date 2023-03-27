package controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import modelo.Archivos;
import modelo.Persona;

public class Agenda {

  // El arrchivo que guarda los datos
  public Archivos archivoAgenda = new Archivos("agenda.txt");
  // La agenda en memoria
  public ArrayList<Persona> agendaViva = new ArrayList<Persona>();

  // LLama al metodo guardaArchivo cuando se instancie la clase
  public Agenda() {
    guardaArchivo();
  }

  // Los getters y setters de la ArrayList agendaViva.
  public ArrayList<Persona> getAgendaViva() {
    return agendaViva;
  }

  public void setAgendaViva(ArrayList<Persona> agendaViva) {
    this.agendaViva = agendaViva;
  }

  /**
   * Esta funcion anade un contacto en la lista agendaViva y guarda los cambios.
   *
   * @param pepe es el nombre del objeto que quiero que se anada a agendaViva.
   */
  public void insertarContacto(Persona pepe) {
    agendaViva.add(pepe);
    guardar();
  }

  /**
   * Este metodo realiza la funcion de escribir en el documento txt los cambios realizados en la app
   * @param todosContactos es el nombre del ArrayList en donde se va a ir almacenando los datos realizados en la app
   * @param p es el nombre que se le ha asignado al objeto persona
   */

  /**
   * (Bucle for dentro del anterior bucle)
   * En este bucle se recorre todos los contactos junto sus datos en donde se van almacenando en la variable dato
   * @param dato es el nombre de la variable en donde se almacena los datos de cada contacto
   */
  public void guardar() {
    ArrayList<String> todosContactos = new ArrayList<>();

    for (Persona p : agendaViva) {
      for (String dato : p.datosPersona()) {
        todosContactos.add(dato + ";");
      }

      todosContactos.add("\n");
    }

    archivoAgenda.escribe(todosContactos);
  }

  /**
   * En este metodo se guardan los valores/propiedades introducidos de cada contacto y los construye anadiendo asi personas/contactos
   *
   */
  /**
   * Lee un archivo y crea una lista de objetos a partir de los datos del archivo.
   */

  public void guardaArchivo() {
    ArrayList<String> miArrayList = new ArrayList<>();

    miArrayList = archivoAgenda.lee();

    for (String a : miArrayList) {
      String[] miArray = a.split(";");

      Persona persona = new Persona(miArray[0]);

      persona.setApellidos(miArray[1]);

      persona.setEmail(miArray[2]);

      persona.setNumTelefono(miArray[3]);

      persona.setFechaNacimiento(LocalDate.parse(miArray[4]));

      agendaViva.add(persona);
    }
  }

  /**
   * Guarda la informacion del ArrayList en el cual estan todos los contactos y lo almacena en otro ArrayList de tipo string, el cual se mostrara por pantalla
   * @param p es el nombre de la variable que se le ha asignado al objeto persona
   * @param dato es el nombre de la variable en donde se almacena los datos de cada contacto
   */

  public void leerContactos() {
    ArrayList<String> todosContactos = new ArrayList<>();

    for (Persona p : agendaViva) {
      for (String dato : p.datosPersona()) {
        todosContactos.add(dato + ";");
      }

      todosContactos.add("\n");
    }

    System.out.println(todosContactos);
  }

  /**
   * Este metodo modifica los datos de un contacto y guarda los cambios
   * @param i es la variable de tipo int en la que se escoje a que contacto cambiar sus datos
   * @param apellidos es la variable de tipo string en la que se almacena los apellidos del contacto
   * @param email es la variable de tipo string en la que se almacena el email del contacto
   * @param telefono es la variable de tipo string en la que se almacena el telefono del contacto
   * @param fechanacimiento es la variable de tipo string en la que se almacena la fecha de nacimiento del contacto
   */

  public void modificarContacto(
    int i,
    String apellidos,
    String email,
    String telefono,
    String fechanacimiento
  ) {
    Persona p = agendaViva.get(i);

    p.setApellidos(apellidos);

    p.setEmail(email);

    p.setNumTelefono(telefono);

    p.setFechaNacimiento(LocalDate.parse(fechanacimiento));

    guardar();
  }

  /**
   * Metodo para comprobar si hoy es el dia de su cumpleaños
   * @return Si es el cumpleaños devuelve el numero de años que cumple y si no pues te indica que no es su cumpleaños.
   */

  public int comprobarCumple(int i) {
    // Obtener la fecha de nacimiento de la persona en la agendaViva.
    int res = 0;

    Persona p = agendaViva.get(i);

    p.getFechaNacimiento();

    //Obtenemos la fecha de hoy
    LocalDate hoy = LocalDate.now();

    if (
      hoy.getDayOfMonth() == p.getFechaNacimiento().getDayOfMonth() &&
      hoy.getMonthValue() == p.getFechaNacimiento().getMonthValue()
    ) {
      System.out.println(
        "Hoy es el cumpleanyos de: " +
        p.getNombre() +
        " y cumple: " +
        (hoy.getYear() - p.getFechaNacimiento().getYear()) +
        " años"
      );
    }

    return res;
  }
}
