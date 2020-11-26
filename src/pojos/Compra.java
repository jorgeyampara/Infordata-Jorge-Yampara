package pojos;

import java.util.Date;

public class Compra {
    private Prooveedor prooveedor;
    private Producto producto;
    private Date fecha;
    private int cantidad;

    public Compra(Prooveedor prooveedor, Producto producto, Date fecha, int cantidad) {
        this.setProoveedor(prooveedor);
        this.setProducto(producto);
        this.setFecha(fecha);
        this.setCantidad(cantidad);
    }

    public Prooveedor getProoveedor() {
        return prooveedor;
    }

    public void setProoveedor(Prooveedor prooveedor) {
        this.prooveedor = prooveedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
