/**
 * Created by alumno on 27/06/2017.
 */
public class Deporte {
    String nombreDeporte;
    boolean usaBalon;

    public Deporte() {
    }

    public Deporte(String nombreDeporte, boolean usaBalon) {
        this.nombreDeporte = nombreDeporte;
        this.usaBalon = usaBalon;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public boolean isUsaBalon() {
        return usaBalon;
    }

    public void setUsaBalon(boolean usaBalon) {
        this.usaBalon = usaBalon;
    }
}
