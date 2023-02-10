public class App {
    public static void main(String[] args) throws Exception {
        
        Animal miAnimal = new Animal();

        miAnimal.alimentarse();

        Perro miPerro = new Perro();

        Dalmata miDalmata = new Dalmata();

        miPerro.alimentarse();

        miPerro.alimentarse(500);

        miDalmata.alimentarse();
        
        miDalmata.alimentarse(500);

        
    }
}
