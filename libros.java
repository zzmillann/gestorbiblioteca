public class libros {
    

private int ISBN;
private String titulo;
private String editorial;
private boolean reservado;




@Override
public String toString() {
    return "libros [ISBN=" + ISBN + ", titulo=" + titulo + ", editorial=" + editorial + ", reservado=" + reservado
            + "]";
}


//getters y setters
public int getISBN() {
    return ISBN;
}


public void setISBN(int iSBN) {
    ISBN = iSBN;
}


public String getTitulo() {
    return titulo;
}


public void setTitulo(String titulo) {
    this.titulo = titulo;
}


public String getEditorial() {
    return editorial;
}


public void setEditorial(String editorial) {
    this.editorial = editorial;
}


public boolean isReservado() {
    return reservado;
}


public void setReservado(boolean reservado) {
    this.reservado = reservado;
}


//constructor
public libros(int iSBN, String titulo, String editorial, boolean reservado) {
    ISBN = iSBN;
    this.titulo = titulo;
    this.editorial = editorial;
    this.reservado = reservado;
}








}
