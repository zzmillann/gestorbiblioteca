package DAW;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        biblioteca GESTORBIBLIOTECA = new biblioteca(null, null, 0);
        alummnos ALUMNOS = new alummnos(null, null, null, GESTORBIBLIOTECA);

        int opcionprincipal;

        do {
            String dialogo1 = JOptionPane.showInputDialog(
                    "¿ QUÉ DESEA HACER ? " 
                    + "\n1) Gestionar Bibliotecas " 
                    + "\n2) Gestionar Alumnos" 
                    + "\n3) Gestionar Libros" 
                    + "\n4) SALIR");

            opcionprincipal = Integer.parseInt(dialogo1);

            switch (opcionprincipal) {
                case 1:
                    int opcionsecundaria;
                    do {
                        // Menú de bibliotecas
                        String dialogo2 = JOptionPane.showInputDialog(
                                "¿ QUÉ DESEA HACER ? " 
                                + "\n1) Crear Biblioteca" 
                                + "\n2) Ver Bibliotecas" 
                                + "\n3) VOLVER ATRÁS");

                        opcionsecundaria = Integer.parseInt(dialogo2);

                        switch (opcionsecundaria) {
                            case 1:
                                String nombreBiblioteca = JOptionPane.showInputDialog("NOMBRE DE LA BIBLIOTECA");
                                String direccionBiblioteca = JOptionPane.showInputDialog("DIRECCIÓN DE LA BIBLIOTECA");
                                String codigoBibliotecaString = JOptionPane.showInputDialog("CÓDIGO IDENTIFICATIVO DE LA BIBLIOTECA");
                                int codigobiblioteca = Integer.parseInt(codigoBibliotecaString);
                                GESTORBIBLIOTECA.crearBiblioteca(nombreBiblioteca, direccionBiblioteca, codigobiblioteca);
                                break;

                            case 2:
                                GESTORBIBLIOTECA.verBilbiotecas();
                                JOptionPane.showMessageDialog(null, "Fin de la lista de bibliotecas.");
                                break; 

                            case 3:
                                break; 
                        }
                    } while (opcionsecundaria != 3); 
                    break;

                case 2:
                int opcionterciaria;
                    do {
                        
                        String dialogo3 = JOptionPane.showInputDialog(
                                "¿ QUÉ DESEA HACER ? " 
                                + "\n1) Crear Alumno" 
                                + "\n2) Eliminar Alumno" 
                                + "\n3) Ver Alumnos" 
                                + "\n4) VOLVER ATRÁS");

                        opcionterciaria = Integer.parseInt(dialogo3);

                        switch (opcionterciaria) {
                            case 1:
                                String dniAlumno = JOptionPane.showInputDialog("DNI DEL ALUMNO");
                                String nombreAlumno = JOptionPane.showInputDialog("NOMBRE DEL ALUMNO");
                                String direccionAlumno = JOptionPane.showInputDialog("DIRECCIÓN DEL ALUMNO");
                                ALUMNOS.crearAlumnos(dniAlumno,nombreAlumno,direccionAlumno);
                                break;
                            case 2:
                                String dniAlumnoEliminar = JOptionPane.showInputDialog("DNI DEL ALUMNO");
                                ALUMNOS.eliminarAlumno(dniAlumnoEliminar);
                                break; 

                            case 3:
                               ALUMNOS.verAlumnos();
                               break;
                            case 4:
                            break;
                        }
                    } while (opcionterciaria != 4); 
                    break;
                case 3:
                    int opcioncuaternaria;
                    do {
                        // Menú de bibliotecas
                        String dialogo4 = JOptionPane.showInputDialog(
                                "¿ QUÉ DESEA HACER ? " 
                                + "\n1) Crear Libro " 
                                + "\n2) Ver libros de biblioteca especifica " 
                                + "\n3) Eliminar libros de biblioteca especifica" 
                                + "\n4) Comprar Libro"
                                + "\n5) Pedir libro prestado"
                                + "\n6) Devolver Libro"
                                + "\n7) VOLVER ATRÁS");


                                opcioncuaternaria = Integer.parseInt(dialogo4);

                        switch (opcioncuaternaria) {
                            case 1:
                                String codigoLibroString = JOptionPane.showInputDialog("CODIGO BIBLIOTECA");
                                int codigoBiblioteca = Integer.parseInt(codigoLibroString);
                                String ISBNString = JOptionPane.showInputDialog("ISBN LIBRO");
                                int ISBN = Integer.parseInt(ISBNString);
                                String  NombreLibro = JOptionPane.showInputDialog("NOMBRE DEL LIBRO");
                                String EditorialLibro = JOptionPane.showInputDialog("EDITORIAL DEL LIBRO");
                                GESTORBIBLIOTECA.crearLibros(codigoBiblioteca, ISBN, NombreLibro, EditorialLibro, false);

                                break;
                            case 2:
                            String codigoLibroEspecificoString = JOptionPane.showInputDialog("CODIGO BIBLIOTECA");
                            int codigoBibliotecaEspecidica = Integer.parseInt(codigoLibroEspecificoString);
                                GESTORBIBLIOTECA.verLibrosBiblioteca(codigoBibliotecaEspecidica);
                                break; 

                            case 3:
                            String codigoLibroEspecificoString1 = JOptionPane.showInputDialog("CODIGO BIBLIOTECA");
                            int codigoBibliotecaEspecidica1 = Integer.parseInt(codigoLibroEspecificoString1);
                            String ISBNString1 = JOptionPane.showInputDialog("ISBN LIBRO");
                                int ISBN1 = Integer.parseInt(ISBNString1);
                            GESTORBIBLIOTECA.eliminarLibroBilbioteca(codigoBibliotecaEspecidica1, ISBN1);
                            break;
                            case 4:
                            String codigoLibroEspecificoString2 = JOptionPane.showInputDialog("CODIGO BIBLIOTECA");
                            int codigoBibliotecaEspecidica2 = Integer.parseInt(codigoLibroEspecificoString2);
                            String ISBNString2 = JOptionPane.showInputDialog("ISBN LIBRO");
                                int ISBN2 = Integer.parseInt(ISBNString2);
                                String dniAlumno1 = JOptionPane.showInputDialog("DNI DEL ALUMNO");

                              ALUMNOS.comprarLibro(codigoBibliotecaEspecidica2, ISBN2,dniAlumno1);
                                break;

                            case 5:
                            String codigoLibroEspecificoString3 = JOptionPane.showInputDialog("CODIGO BIBLIOTECA");
                            int codigoBibliotecaEspecidica3 = Integer.parseInt(codigoLibroEspecificoString3);
                            String ISBNString3 = JOptionPane.showInputDialog("ISBN LIBRO");
                                int ISBN3 = Integer.parseInt(ISBNString3);
                               ALUMNOS.pedirPrestado(codigoBibliotecaEspecidica3, ISBN3);
                               break;
                            case 6:
                            String ISBNString4 = JOptionPane.showInputDialog("ISBN LIBRO");
                            int ISBN4 = Integer.parseInt(ISBNString4);
                               ALUMNOS.devolverLibro(ISBN4);
                               break;
                            case 7:
                            break;
                        }
                    } while (opcioncuaternaria != 7); 
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, " Saliendo del programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, " Opción no válida. Intente nuevamente.");
            }
        } while (opcionprincipal != 4);
    }
}
