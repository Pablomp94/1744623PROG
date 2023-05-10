package modelo;

public class Publication {
    private final Integer id;
    private String bookTitle;
    private String publishDate;
    private String publishCo;

    
    //Este es un método constructor que crea una nueva instancia de la clase Publicación con un
    //identificador especificado. Inicializa el valor de la variable id con el valor pasado como argumento.
    public Publication(Integer id) {
        this.id = id;
    }    

   //Este es un método constructor que crea una nueva instancia de la clase Publicación con
   //parámetros especificados: id, título del libro, fecha de publicación y compañía de publicación. El constructor inicializa los
   //valores de las variables de instancia con los valores pasados ​​como argumentos.
    public Publication(Integer id, String bookTitle, String publishDate, String publishCo) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.publishDate = publishDate;
        this.publishCo = publishCo;
    }

    public Integer getId() {
        return id;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public String getPublishDate() {
        return publishDate;
    }
    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
    public String getPublishCo() {
        return publishCo;
    }
    public void setPublishCo(String publishCo) {
        this.publishCo = publishCo;
    }

    @Override
    public String toString() {
        return "Publication [id=" + id + 
        ", Título=" + bookTitle + 
        ", fechaPublicación=" + publishDate + 
        ", Editorial=" + publishCo + "]";
    }
    
}
