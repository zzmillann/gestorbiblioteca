import java.util.ArrayList;

public class biblioteca {
   
private String nombre;
private String direccion;
private int codigobiblioteca;
 ArrayList<biblioteca>bibliotecas = new ArrayList<>();
ArrayList<libros>libro;



//getters and setters





public String getNombre() {
    return nombre;
}




public void setNombre(String nombre) {
    this.nombre = nombre;
}




public String getDireccion() {
    return direccion;
}




public void setDireccion(String direccion) {
    this.direccion = direccion;
}




public int getCodigobiblioteca() {
    return codigobiblioteca;
}




public void setCodigobiblioteca(int codigobiblioteca) {
    this.codigobiblioteca = codigobiblioteca;
}




//constructor
public biblioteca(String nombre, String direccion, int codigobiblioteca) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.codigobiblioteca = codigobiblioteca;
    libro = new ArrayList<>();
}



//ToString

@Override
public String toString() {
    return "Nombre = " + nombre +"  Direccion = " + direccion + "  Codigo de biblioteca = " + codigobiblioteca + "\n";
   
}



//metodo para crear una biblioteca
public void crearBiblioteca(String nombre  ,String direccion , int codigobiblioteca){

    bibliotecas.add(new biblioteca(nombre, direccion, codigobiblioteca));
    System.out.println("Biblioteca creada correctamente");
}


//ver bibliotecas

public void verBilbiotecas(){

    for (biblioteca b : bibliotecas) {
        
        System.out.println(b.toString());
    }
}

public void crearLibros(int codigo, int isbn, String nombre , String editorial, Boolean FALSEE ){

   for (biblioteca bi : bibliotecas) {
    if(bi.codigobiblioteca == codigo){
         bi.libro.add(new libros(isbn, nombre, editorial, false));
         }
     
   }
}




public  void verLibrosBiblioteca(int codigoBiblioteca) {
    for (biblioteca b : bibliotecas) {
        if (b.codigobiblioteca == codigoBiblioteca) {
            System.out.println(" Libros en la biblioteca: " + b.nombre);
            for (libros l : b.libro) {
                System.out.println(l);
            }
            return; 
        }
    }
}


public void eliminarLibroBilbioteca(int codigoBiblioteca, int isbn){
    for(biblioteca b : bibliotecas){
        if(b.codigobiblioteca == codigoBiblioteca){
            for (int i = b.libro.size() - 1; i >= 0; i--) {
                if(b.libro.get(i).getISBN() == isbn){
                    b.libro.remove(i);
                }
            
            }
        }
    }
    


}






    
}

