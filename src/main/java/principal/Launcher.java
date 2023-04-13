package principal;

import model.Computadores;
import model.DispositivoTecnologico;
import model.Pantalla;

public class Launcher {
    public static void main(String[] args) {

    }

    public void start(){
        Pantalla pantalla =new Pantalla("marca","modelo",2013);
        DispositivoTecnologico computador1 = new Computadores("marca","ram","almacenamiento",
                "procesador","modelo",2000,1000,10,"Video",
                "fuente","chasis",pantalla);
    }

}
