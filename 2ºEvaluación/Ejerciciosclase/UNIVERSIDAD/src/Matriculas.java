public class Matriculas {

    private Integer alumnoId;
    private String nombreMateria;
    private Integer notaMateria;
    private Integer porfesorId;
    
    public Integer getAlumnoId() {
        return alumnoId;
    }
    public String getNombreMateria() {
        return nombreMateria;
    }
    public Integer getNotaMateria() {
        return notaMateria;
    }
    public Integer getPorfesorId() {
        return porfesorId;
    }
    public void setAlumnoId(Integer alumnoId) {
        this.alumnoId = alumnoId;
    }
    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    public void setNotaMateria(Integer notaMateria) {
        this.notaMateria = notaMateria;
    }
    public void setPorfesorId(Integer porfesorId) {
        this.porfesorId = porfesorId;
    }
    
    @Override
    public String toString() {
        return "Matriculas [alumnoId=" + alumnoId + ", nombreMateria=" + nombreMateria + ", notaMateria=" + notaMateria
                + ", porfesorId=" + porfesorId + "]";
    }
    public Matriculas(Integer alumnoId, String nombreMateria, Integer porfesorId) {
        this.alumnoId = alumnoId;
        this.nombreMateria = nombreMateria;
        this.porfesorId = porfesorId;
    }
    
    public Matriculas() {
    }

    

    

}