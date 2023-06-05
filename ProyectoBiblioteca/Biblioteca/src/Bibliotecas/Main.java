package Bibliotecas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Libreria libreria1 = new Libreria();
Libro Libro1 = new Libro("001", "La odisea", 11,
"Homero",58.50);
Libro Libro2 = new Libro("002", "Ilíada", 2,
"Homero",62.75);
Libro Libro3 = new Libro("003", "El extranjero", 12,
"Albert Camus",32.45);
libreria1.agregarLibro(Libro1);
libreria1.agregarLibro(Libro2);
libreria1.agregarLibro(Libro3);
System.out.println("\n=================================");
System.out.println("Costo de Libros de mayor a menor");
System.out.println("1)Titulo:"+Libro2.getTitulo()+"\t\tPrecio:"+
Libro2.getPrecio());
System.out.println("2)Titulo:"+Libro1.getTitulo()+"\tPrecio:"+Libro1.getPrecio());
System.out.println("3)Titulo:"+Libro3.getTitulo()+"\tPrecio:"+Libro3.getPrecio());
System.out.println("\n=================================");
System.out.println("Codigos de Libros \n001:Laodisea\n002:Iliada\n003:El Extranjero\n");
System.out.println("=================================");
System.out.println("Para mas informacion");
Scanner libro = new Scanner(System.in);
System.out.printf("Ingrese el codigo del Libro:");
String codigo=libro.nextLine();
Libro result = libreria1.getLibro(codigo);
if(result!=null) {
System.out.println("Libro:"+result.getTitulo()+"\nCantidad:"+result.getCantidad()+" \nAutor:"+result.getAutor()+"\nCodigo:"+result.getCodigo()+"\nPrecio:"+result.
getPrecio());
} else {
System.out.println("El codigo del Libro " + codigo +
" no existe en la biblioteca");
return;
}
Scanner venta=new Scanner(System.in);
System.out.println("=================================");
System.out.printf("Ingrese cuantos libros desea:");
int vendido=venta.nextInt();
if(vendido>result.getCantidad())
{
System.out.println("La libreria no tiene esa cantidad");
System.out.println("=================================");
return;
}
libreria1.vender(result, vendido);
result.setVenta(vendido*result.getPrecio());
System.out.println("\nCantidad despues de la venta");
System.out.println("=================================");
result = libreria1.getLibro(codigo);
if(result!=null) {
System.out.println("\nLibro:"+result.getTitulo()+"\nCantidad:"+result.getCantidad()+" \nAutor:"+result.getAutor()+"\nCodigo:"+result.getCodigo()+"\nPrecio:"+result.getPrecio()+"\nTotal:"+result.getVenta());
System.out.println("=================================");
if (result.getCantidad()==0)
{
System.out.println("EL libro se agoto");
System.out.println("=================================");
}
}
else {
System.out.println("El Libro " + codigo + " no existe");
System.out.println("=================================");
}
}
}