package Bibliotecas;
public class Libro
{
private String codigo;
private String titulo;
private String autor;
private int cantidad;
private double precio;
private double venta;
public Libro(String codigo, String titulo, int cantidad,String
autor,double precio)
{
super();
this.codigo = codigo;
this.titulo = titulo;
this.cantidad = cantidad;
this.autor = autor;
this.precio=precio;
}
public String getCodigo()
{
return codigo;
}
public void setCodigo(String codigo)
{
this.codigo = codigo;
}
public int getCantidad()
{
return cantidad;
}
public void setCantidad(int cantidad)
{
this.cantidad = cantidad;
}
public String getTitulo()
{
return titulo;
}
public void setTitulo(String titulo)
{
this.titulo = titulo;
}
public String getAutor()
{
return autor;
}
public void setAutor(String autor)
{
this.autor = autor;
}
public double getPrecio()
{
return precio;
}
public void setPrecio(double precio)
{
this.precio = precio;
}
public double getVenta()
{
return venta;
}
public void setVenta(double venta)
{
this.venta = venta;
}
}
