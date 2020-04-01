package cl.ucn.disc.dsm.DaDichatdisc.model;

import java.sql.Time;

public class Conversacion {

    private int id;
    private Usuario usuario_uno;
    private Usuario usuario_dos;
    private Time hora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }
}
