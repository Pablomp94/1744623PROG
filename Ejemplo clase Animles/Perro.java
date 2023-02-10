public class Perro extends Animal {
    private String raza;

    public void ladrar() {

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    @Override     
    public void alimentarse() {
        System.out.println("Alimentando Perro");

    }

    public void alimentarse(Integer calorias) {
        System.out.println("Alimentando Perro con " + calorias);

    }
}
