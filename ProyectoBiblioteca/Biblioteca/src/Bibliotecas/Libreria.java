package Bibliotecas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Libreria
{
private List<Libro> lbr = new ArrayList<>();
public void agregarLibro(Libro libro) {
lbr.add(libro);
}
public void vender(Libro libro, int cantidadVenta)
{
Libro result = this.getLibro(libro.getCodigo());
if(result == null) {
System.out.println("El Libro " + result.getCodigo() + " no existe");
return;
}
int cantidadActual = result.getCantidad();
if(cantidadVenta>cantidadActual) {
System.out.println("La Libreria no tiene la cantidad requerida");
return;
}
result.setCantidad(result.getCantidad() - cantidadVenta);
}
public Libro getLibro(String codigo) {
for(Libro libro: lbr) {
if(libro.getCodigo().equals(codigo))
return libro;
}
return null;
}
public List<Libro> getLbr() {
return lbr;
}
}
