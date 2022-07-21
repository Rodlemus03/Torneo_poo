
public class Equipo {
    private String nombre;
    private int posicion;
    private int tirosEsquina;
    private int juegosGanados;
    private int juegosPerdidos;
    private int tirosGol;
    private int goles;
    private int tarjetasAmarilla;
    private int tarjetasRojas;
    private int faltas;

//constructor
public Equipo(String nombre,int posicion, int tirosEsquina, int juegosGanados, int juegosPerdidos, int tirosGol,int goles, int tarjetasAmarilla, int tarjetasRojas,int faltas){
    this.nombre=nombre;
    this.posicion=posicion;
    this.tirosEsquina=tirosEsquina;
    this.juegosGanados=juegosGanados;
    this.juegosPerdidos=juegosPerdidos;
    this.tirosGol=tirosGol;
    this.goles=goles;
    this.tarjetasAmarilla=tarjetasAmarilla;
    this.tarjetasRojas=tarjetasRojas;
    this.faltas=faltas;
}

//Gets
public String getNombre(){
    return this.nombre;
}
public int getPosicion(){
    return this.posicion;
}
public int getTirosEsquina(){
    return this.tirosEsquina;
}
public int getJuegosGanados(){
    return this.juegosGanados;
}
public int getJuegosPerdidos(){
    return this.juegosPerdidos;
}
public int getTirosGol(){
    return this.tirosGol;
}
public int getGoles(){
    return this.goles;
}
public int getTarjetasAmarillas(){
    return this.tarjetasAmarilla;
}
public int getTarjetasRojas(){
    return this.tarjetasRojas;
}
public int getFaltas(){
    return this.faltas;
}

//Sets
public void setNombre(String nombre){
    this.nombre=nombre;
}

public void setPosicion(int posicion){
    this.posicion=posicion;
}

public void setTirosEsquina(int tirosEsquina){
    this.tirosEsquina=tirosEsquina;
}

public void setJuegosGanados(int juegosGanados){
    this.juegosGanados=juegosGanados;
}

public void setJuegosPerdidos(int juegosPerdidos){
    this.juegosPerdidos=juegosPerdidos;
}

public void setTirosGol(int tirosGol){
    this.tirosGol=tirosGol;
}
public void setGoles(int goles){
    this.goles=goles;
}

public void setAmarillas(int tarjetasAmarilla){
    this.tarjetasAmarilla=tarjetasAmarilla;
}

public void setRojas(int tarjetasRojas){
    this.tarjetasRojas=tarjetasRojas;
}

public void setFaltas(int faltas){
    this.faltas=faltas;
}


//ToString
public String toString(){
    String cadena="";
    cadena+="#####################################################\n";
    cadena+="\nNombre del equipo:"+nombre;
    cadena+="\nPosicion:"+posicion;
    cadena+="\nTiros de esquina:"+tirosEsquina;
    cadena+="\nJuegos ganados:"+juegosGanados;
    cadena+="\nJuegos perdidos:"+juegosPerdidos;
    cadena+="\nTiros a gol:"+tirosGol;
    cadena+="\nTarjetas amarillas:"+tarjetasAmarilla;
    cadena+="\nTarjetas Rojas:"+tarjetasRojas;
    cadena+="\nFaltas:"+faltas;
    return cadena;

}
}
