import  java.time.LocalDate;
/**
 * Clase Tarea.
 * 
 * @author (Luis González de Haro) 
 * @version (15/12/2016)
 */
public class Tarea
{
    //Colección
    private String descripcion;
    private boolean terminada;
    private int prioridad;
    private LocalDate fecha;

    

    /**
     * Constructor
     */

    public Tarea(String descripcionTarea){
        terminada = false;
        this.descripcion = descripcion;
        prioridad = 0;
        
    }

    public String getDescripcion(){
        return descripcion;
    }

    public boolean estaTerminada(){
        return terminada;}

    public void marcarComoCompletada(){
        terminada = true;
    }

    public String toString(){
        String textoADevolver = "";
        
        if(terminada) {

            textoADevolver += "Hecha";
        }
        textoADevolver += descripcion +  " ( " + prioridad + "). " + fecha;
        return textoADevolver;
    }

    public void cambiarPrioridad(int nuevaPrioridad)
    {

        if(nuevaPrioridad >= 0 && nuevaPrioridad <= 5){
            prioridad = nuevaPrioridad;}
    }
    
    public void fijarVencimiento(int year, int month, int dayOfMonth){
    LocalDate today = LocalDate.of(year, month, dayOfMonth);
    fecha = today;
    }
}

