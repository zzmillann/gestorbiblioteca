import java.util.ArrayList;

public class alummnos {
    
private String DNI;
private String nombre;
private String direccion;
private biblioteca gestorBiblioteca;
ArrayList<alummnos> alummno = new ArrayList<>();

//ToString
@Override
public String toString() {
    return "_________________________________________________ \nalummnos  DNI = " + DNI + ", Nombre =" + nombre + ", Direccion =" + direccion + ", Libros =" + libro.size() + "\n_________________________________________________";
                
}


//geters and setters
public String getDNI() {
    return DNI;
}


public void setDNI(String dNI) {
    DNI = dNI;
}


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


ArrayList <libros> libro;


//constructor
public alummnos(String dNI, String nombre, String direccion, biblioteca gestorBiblioteca) {
    DNI = dNI;
    this.nombre = nombre;
    this.direccion = direccion;
    this.gestorBiblioteca = gestorBiblioteca;
    libro = new ArrayList<>();
}


public void crearAlumnos(String DNI , String nombre, String direccion){

    alummno.add(new alummnos(DNI, nombre, direccion, gestorBiblioteca));
}


public void eliminarAlumno(String dni){
    for (int i = 0; i < alummno.size(); i++) {
       if(alummno.get(i).DNI.equals(dni)){
        alummno.remove(i);
        break;
       }
       
    }
}






public void verAlumnos(){

    for (alummnos al : alummno) {
        System.out.println(al.toString());
    }
}





public void comprarLibro(int codigobiblioteca, int isbn, String dni) {
    for (biblioteca b : gestorBiblioteca.bibliotecas) { 
        if (b.getCodigobiblioteca() == codigobiblioteca) {
            for (int i = 0; i < b.libro.size(); i++) {
                if (b.libro.get(i).getISBN() == isbn) {
                    libros comprado = b.libro.get(i);
                    
                    for (alummnos alumno : alummno) {
                        if (alumno.getDNI().equals(dni)) {
                            alumno.libro.add(comprado); 
                            b.libro.remove(i); 
                            System.out.println(" Libro comprado con éxito por " + alumno.getNombre());
                            return;
                        }
                    }
                }
            }
        }
    }
    System.out.println("❌ Libro no encontrado en la biblioteca o alumno no existe.");
}

public void pedirPrestado(int codigobiblioteca, int isbn) {
    for (biblioteca b : gestorBiblioteca.bibliotecas) {
        if (b.getCodigobiblioteca() == codigobiblioteca) {
            for (libros l : b.libro) {
                if (l.getISBN() == isbn && !l.isReservado()) {
                    l.setReservado(true); 
                    libro.add(l); 
                    System.out.println(" Libro prestado: " + l.getTitulo());
                    return;
                }
            }
        }
    }
    System.out.println(" No se pudo prestar el libro.");
}

public void devolverLibro(int isbn) {
    for (libros l : libro) {
        if (l.getISBN() == isbn) {
            l.setReservado(false); 
            System.out.println(" Libro devuelto: " + l.getTitulo());
            return;
        }
    }
    System.out.println(" No tienes este libro en préstamo.");
}


public void verLibrosDeAlumno(String dni) {
    for (alummnos alumno : alummno) {
        if (alumno.getDNI().equals(dni)) {
            System.out.println(" Libros de " + alumno.getNombre() + ":");
            for (libros l : alumno.libro) {
                System.out.println(l);
            }
            return;
        }
    }
    System.out.println("❌ No se encontró al alumno con DNI: " + dni);
}

}


