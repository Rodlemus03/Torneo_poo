import java.util.Scanner;;

public class Principal {
    public static void main(String[] args) {
        // Se crea el objeto teclado
        Scanner teclado;
        // Se crean los objetos torneo
        Torneo torneo=new Torneo();
        // Banderas-auxiliares
        short contador = 0;
        teclado = new Scanner(System.in);
        int entrada;
        entrada = 0;
        int numeroEquipo;
        numeroEquipo=0;




        while (entrada != 8) {
            System.out.println("BIENVENIDO");
            System.out.println("1. Ingresar equipo ");
            System.out.println("2. Listar equipos ");
            System.out.println("3. Resumen de goles ");
            System.out.println("4. Resumen de tiros de esquina ");
            System.out.println("5. Resumen de tarjetas amarillas");
            System.out.println("6. Resumen de tarjetas rojas");
            System.out.println("7. Resumen individual de equipos ");
            System.out.println("8. Salir");
            entrada = teclado.nextInt();
            if (entrada == 1) {
                if (contador < 5) {
                    String nombre;
                    int posicion;
                    int tirosEsquina;
                    int juegosGanados;
                    int juegosPerdidos;
                    int tirosGol;
                    int goles;
                    int tarjetasAmarilla;
                    int tarjetasRojas;
                    int faltas;

                    System.out.println("Ingresa los datos del equipo: ");
                    System.out.println("Nombre ");
                    nombre = teclado.next();
                    System.out.println("Posicion en tabla ");
                    posicion = teclado.nextInt();
                    System.out.println("Cantidad de tiros de esquina");
                    tirosEsquina = teclado.nextInt();
                    System.out.println("Cantidad de juegos ganados ");
                    juegosGanados = teclado.nextInt();
                    System.out.println("Cantidad de juegos perdidos ");
                    juegosPerdidos = teclado.nextInt();
                    System.out.println("Cantidad de tiros a gol ");
                    tirosGol = teclado.nextInt();
                    System.out.println("Cantidad de goles ");
                    goles = teclado.nextInt();
                    System.out.println("Cantidad de tarjetas amarillas ");
                    tarjetasAmarilla = teclado.nextInt();
                    System.out.println("Cantidad de tarjetas rojas ");
                    tarjetasRojas = teclado.nextInt();
                    System.out.println("Cantidad de faltas");
                    faltas = teclado.nextInt();
                    if (contador == 0) {
                        torneo.equipo1(nombre,posicion,tirosEsquina,juegosGanados,juegosPerdidos,tirosGol,goles,tarjetasAmarilla,tarjetasRojas,faltas);
                        System.out.println(torneo.equipo1.toString());

                    } else if (contador == 1) {
                        torneo.equipo2(nombre,posicion,tirosEsquina,juegosGanados,juegosPerdidos,tirosGol,goles,tarjetasAmarilla,tarjetasRojas,faltas);
                        System.out.println(torneo.equipo2.toString());

                    } else if (contador == 2) {
                        torneo.equipo3(nombre,posicion,tirosEsquina,juegosGanados,juegosPerdidos,tirosGol,goles,tarjetasAmarilla,tarjetasRojas,faltas);
                        System.out.println(torneo.equipo3.toString());

                    } else if (contador == 3) {
                        torneo.equipo4(nombre,posicion,tirosEsquina,juegosGanados,juegosPerdidos,tirosGol,goles,tarjetasAmarilla,tarjetasRojas,faltas);
                        System.out.println(torneo.equipo4.toString());

                    } else if (contador == 4) {
                        torneo.equipo5(nombre,posicion,tirosEsquina,juegosGanados,juegosPerdidos,tirosGol,goles,tarjetasAmarilla,tarjetasRojas,faltas);
                        System.out.println(torneo.equipo5.toString());
                    }
                    contador += 1;

                } else {
                    System.out.println("Ya se metieron 5 equipos ");
                }

            } else if (entrada == 2) {
                System.out.println(torneo.equipo1.toString());
                System.out.println(torneo.equipo2.toString());
                System.out.println(torneo.equipo3.toString());
                System.out.println(torneo.equipo4.toString());
                System.out.println(torneo.equipo5.toString());
            } else if (entrada == 3) {
                if(contador!=5){
                    System.out.println("Ingresa primero los 5 equipos ");
                
                }else{
                    int goles=torneo.goles();
                    System.out.println("Cantidad de goles: ");
                    System.out.println(goles);
                }
            }else if(entrada==4){
                if(contador!=5){
                    System.out.println("Ingresa primero los 5 equipos ");
                
                }else{
                   int esquinas=torneo.sumaEsquinas();
                    System.out.println("Cantidad de tiros de esquina: ");
                    System.out.println(esquinas);
                }
            }else if(entrada==5){
                if(contador!=5){
                    System.out.println("Ingresa primero los 5 equipos ");
                
                }else{
                    int amarillas=torneo.tarjetasAmarilla();
                    System.out.println("Cantidad de tarjetas amarillas: ");
                    System.out.println(amarillas);
                }
            } else if(entrada==6){
                if(contador!=5){
                    System.out.println("Ingresa primero los 5 equipos ");
                
                }else{
                    int rojas=torneo.tarjetasRojas();
                    System.out.println("Cantidad de tarjetas rojas: ");
                    System.out.println(rojas);
                }
            }else if(entrada==7){
                System.out.println("Ingresa el equipo del que quieres resumen ");
                numeroEquipo=teclado.nextInt();
                if(numeroEquipo==1){
                    System.out.println(torneo.equipo1.toString());
                }else if(numeroEquipo==2){
                    System.out.println(torneo.equipo2.toString());
                    
                }else if(numeroEquipo==3){
                    System.out.println(torneo.equipo3.toString());
                    
                }else if(numeroEquipo==4){
                    System.out.println(torneo.equipo4.toString());
                    
                }else if(numeroEquipo==5){
                    System.out.println(torneo.equipo5.toString());
                    
                }else{
                    System.out.println("Ingresa un equipo correcto porfavor ");
                }
            }
            else if (entrada == 8) {
                entrada = 8;
                System.out.println("Feliz dia");
            }else{
                System.out.println("Ingresa una opcion correcta del menu porfavor.");
            }
        }
    }


}
