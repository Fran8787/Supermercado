
public class Producto implements Comparable<Producto>{

private int codigo;
private String nombre;
private double precio;
private int stock;    
private Categoria rubro;

    public Producto(int codigo, String nombre, double precio, int stock, Categoria rubro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Producto t) {
        if(codigo==t.codigo){
            return 0;
        }else if(codigo>t.codigo){
            return 1;
        }else{
            return -1;
        }
        
        
    }



       

    
}
