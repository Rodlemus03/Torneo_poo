public class Torneo {
        Equipo equipo1=new Equipo("FALTANTE", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Equipo equipo2=new Equipo("FALTANTE", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Equipo equipo3=new Equipo("FALTANTE", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Equipo equipo4=new Equipo("FALTANTE", 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Equipo equipo5=new Equipo("FALTANTE", 0, 0, 0, 0, 0, 0, 0, 0, 0);


        //CREACION DE EQUIPOS
        public String equipo1(String nombre, int posicion,int tirosEsquina,int juegosGanados,int juegosPerdidos,int tirosGol,int goles,int tarjetasAmarilla,int tarjetasRojas,int faltas){
            equipo1.setNombre(nombre);
            equipo1.setPosicion(posicion);
            equipo1.setTirosEsquina(tirosEsquina);
            equipo1.setJuegosGanados(juegosGanados);
            equipo1.setJuegosPerdidos(juegosPerdidos);
            equipo1.setTirosGol(tirosGol);
            equipo1.setGoles(goles);
            equipo1.setAmarillas(tarjetasAmarilla);
            equipo1.setRojas(tarjetasRojas);
            equipo1.setFaltas(faltas);
            return equipo1.toString();
        }
        public String equipo2(String nombre, int posicion,int tirosEsquina,int juegosGanados,int juegosPerdidos,int tirosGol,int goles,int tarjetasAmarilla,int tarjetasRojas,int faltas){
            equipo2.setNombre(nombre);
            equipo2.setPosicion(posicion);
            equipo2.setTirosEsquina(tirosEsquina);
            equipo2.setJuegosGanados(juegosGanados);
            equipo2.setJuegosPerdidos(juegosPerdidos);
            equipo2.setTirosGol(tirosGol);
            equipo2.setGoles(goles);
            equipo2.setAmarillas(tarjetasAmarilla);
            equipo2.setRojas(tarjetasRojas);
            equipo2.setFaltas(faltas);
            return equipo2.toString();
        }
        public String equipo3(String nombre, int posicion,int tirosEsquina,int juegosGanados,int juegosPerdidos,int tirosGol,int goles,int tarjetasAmarilla,int tarjetasRojas,int faltas){
            equipo3.setNombre(nombre);
            equipo3.setPosicion(posicion);
            equipo3.setTirosEsquina(tirosEsquina);
            equipo3.setJuegosGanados(juegosGanados);
            equipo3.setJuegosPerdidos(juegosPerdidos);
            equipo3.setTirosGol(tirosGol);
            equipo3.setGoles(goles);
            equipo3.setAmarillas(tarjetasAmarilla);
            equipo3.setRojas(tarjetasRojas);
            equipo3.setFaltas(faltas);
            return equipo3.toString();
        }
        public String equipo4(String nombre, int posicion,int tirosEsquina,int juegosGanados,int juegosPerdidos,int tirosGol,int goles,int tarjetasAmarilla,int tarjetasRojas,int faltas){
            equipo4.setNombre(nombre);
            equipo4.setPosicion(posicion);
            equipo4.setTirosEsquina(tirosEsquina);
            equipo4.setJuegosGanados(juegosGanados);
            equipo4.setJuegosPerdidos(juegosPerdidos);
            equipo4.setTirosGol(tirosGol);
            equipo4.setGoles(goles);
            equipo4.setAmarillas(tarjetasAmarilla);
            equipo4.setRojas(tarjetasRojas);
            equipo4.setFaltas(faltas);
            return equipo4.toString();
        }
        public String equipo5(String nombre, int posicion,int tirosEsquina,int juegosGanados,int juegosPerdidos,int tirosGol,int goles,int tarjetasAmarilla,int tarjetasRojas,int faltas){
            equipo5.setNombre(nombre);
            equipo5.setPosicion(posicion);
            equipo5.setTirosEsquina(tirosEsquina);
            equipo5.setJuegosGanados(juegosGanados);
            equipo5.setJuegosPerdidos(juegosPerdidos);
            equipo5.setTirosGol(tirosGol);
            equipo5.setGoles(goles);
            equipo5.setAmarillas(tarjetasAmarilla);
            equipo5.setRojas(tarjetasRojas);
            equipo5.setFaltas(faltas);
            return equipo5.toString();
        }
        //METODOS PARA OBTENER DATOS NUMERICOS
        public int goles(){
            int sumaGoles,goles1,goles2,goles3,goles4,goles5;
                    goles1=equipo1.getGoles();
                    goles2=equipo2.getGoles();
                    goles3=equipo3.getGoles();
                    goles4=equipo4.getGoles();
                    goles5=equipo5.getGoles();
                    sumaGoles=goles1+goles2+goles3+goles4+goles5;
            return sumaGoles;
        }
        public int sumaEsquinas(){
            int sumaEsquinas,esquina1,esquina2,esquina3,esquina4,esquina5;
            esquina1=equipo1.getTirosEsquina();
            esquina2=equipo2.getTirosEsquina();
            esquina3=equipo3.getTirosEsquina();
            esquina4=equipo4.getTirosEsquina();
            esquina5=equipo5.getTirosEsquina();
            sumaEsquinas=esquina1+esquina2+esquina3+esquina4+esquina5;
            return sumaEsquinas;
        }
        public int tarjetasAmarilla(){
            int sumaTargetasAmarillas,amarillas1,amarillas2,amarillas3,amarillas4,amarillas5;
                    amarillas1=equipo1.getTarjetasAmarillas();
                    amarillas2=equipo2.getTarjetasAmarillas();
                    amarillas3=equipo3.getTarjetasAmarillas();
                    amarillas4=equipo4.getTarjetasAmarillas();
                    amarillas5=equipo5.getTarjetasAmarillas();
                    sumaTargetasAmarillas=amarillas1+amarillas2+amarillas3+amarillas4+amarillas5;
                    return sumaTargetasAmarillas;
        }
        public int tarjetasRojas(){
            int sumaTargetasRojas,rojas1,rojas2,rojas3,rojas4,rojas5;
                    rojas1=equipo1.getTarjetasRojas();
                    rojas2=equipo2.getTarjetasRojas();
                    rojas3=equipo3.getTarjetasRojas();
                    rojas4=equipo4.getTarjetasRojas();
                    rojas5=equipo5.getTarjetasRojas();
                    sumaTargetasRojas=rojas1+rojas2+rojas3+rojas4+rojas5;
                    return sumaTargetasRojas;
        }
        

}
