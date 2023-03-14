public interface iFigura2D {

    /**
     * Para devolver el perimetro de la figura
     * @return perimetro de la figura
     */

    public double perimetro();

    /**
     * Para devolver el area de la figura
     * @return area de la figura
     */

     public double area();

     /**
      * Para esablecer la escalada de la figura
      *@param escala a la que escalar la figura 
      */

      public void escalar(double escala);

      /**
       * Para mostrar la informacion de la figura 
       */

       public void imprimir();
}