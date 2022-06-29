
package ec.edu.intsuperior.modelo;

public class Automovil {
    
    private String placa;
    public enum TipoMarca{CHEVROLET, TOYOTA, VMW, AUDI,LAMBORGHINI}
    private TipoMarca marca;
    private int anio;
    public enum TipoColor{ROJO,BLANCO,NEGRO,AZUL,CONCHEVINO}
    private TipoColor color;
    public Automovil(){
    }    

    public Automovil(String placa, TipoMarca marca, int anio, TipoColor color) {
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.color = color;
    }
    
    
    //Este es un metodo de instancia que voy a utilizar para
    //asignar un numero de placa a un objeto que vaya a crear 
    //y esto un metodo de retorno null por q es de tipo void.
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(TipoMarca marca) {
        this.marca = marca;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }

    
    //Este es un metodo de instancia que voy a utilizar para 
    //retonar el numero de placa de un determinado objeto que 
    //vaya a crear.
    public String getPlaca() {
        return placa;
    }

    public TipoMarca getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public TipoColor getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Los datos de vehiculo son:\n"
                + "Placa: "+getPlaca()+"\n"
                + "Marca: "+getMarca()+"\n"
                + "Año: "+getAnio()+"\n"
                + "Color: "+getColor();
    }
    
    
    
    
}
