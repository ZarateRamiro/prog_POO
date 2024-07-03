package org.example;

import entidades.Producto;

public class Main {
    public static void main(String[] args) {

        // crear un objeto de la clase producto (instancia de la clase producto)
        // uso new Producto() crear producto vacio

            Producto producto1= new Producto();
            producto1.setId(1);
            producto1.setNomProducto("Honda...");
            producto1.setPrecio( 1500000);
            producto1.setStockActual(1000);

            producto1.mostrarProducto();

            Producto producto2=new Producto();
            producto2.setNomProducto("Motomel ZZZ");
            producto2.setPrecio(1200000);
            producto2.setId(2);

            producto2.mostrarProducto();

           System.out.println(producto2.getNomProducto() );

            producto1.actualizarStock();
            producto1.actualizarStock(5);
            producto1.mostrarProducto();

            Producto producto3= new Producto();
            producto3.mostrarProducto();

            Producto producto4 = new Producto(4, "Zanella ... ZZ");
            producto4.mostrarProducto();
            Producto producto5 = new Producto(5, "Yamaha YY", 2500000, 5 );
            producto5.mostrarProducto();
    }




}