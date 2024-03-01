package org.example.Ejercicios;

public class StairsSnakes {
    private static final int TamañoTablero = 64;
    private static final int MaxCaraDado = 6;

    private static final int Bloqueado = 1;

    private int [] CasillasEspecialesOrigen;
    private int [] CasillasEspecialesDestino;
    private int[] tablero;

    private int PosicionActualJugador;
    private int NumeroTirosConsecutivosSeis;

    public StairsSnakes(){
        this.CasillasEspecialesOrigen = new int[]{7, 11, 31, 30, 40, 43, 50, 59};
        this.CasillasEspecialesDestino = new int[]{38, 37, 46, 2, 21, 60, 5, 42};
        this.tablero = new int[TamañoTablero];
        this.PosicionActualJugador = 1;
        this.NumeroTirosConsecutivosSeis = 0;
    }

    public void Jugar(){
        while(!haGanado()){
            int TiradaDado = TirarDado();
            if (NumeroTirosConsecutivosSeis < 3){
                MoverJugador(TiradaDado);
            }else {
                ReiniciarPosicionJugador();
            }
            if (TiradaDado == MaxCaraDado){
                NumeroTirosConsecutivosSeis++;
            }else {
                NumeroTirosConsecutivosSeis = 0;
                System.out.println("El jugador ha sacado un " + TiradaDado + " y se encuentra en la casilla " + PosicionActualJugador);
            }
            System.out.println(("Felicidades, has ganado el juego!"));
        }
    }

    private void MoverJugador(int NumeroCasillas){
        PosicionActualJugador += NumeroCasillas;
        if (PosicionActualJugador > TamañoTablero){
            PosicionActualJugador = TamañoTablero - (PosicionActualJugador - TamañoTablero);
        }
        int PosicionDestinoEspecial = ObtenerPosicionDestinoEspecial(PosicionActualJugador);
        if (PosicionDestinoEspecial != -1){
            PosicionActualJugador = PosicionDestinoEspecial;
        }
    }

    private int ObtenerPosicionDestinoEspecial(int PosicionActual){
        for(int i = 0; i <CasillasEspecialesOrigen.length; i++){
            if (CasillasEspecialesOrigen[i] == PosicionActual){
                return CasillasEspecialesDestino[i];
            }
        }
        return -1;
    }

    private void ReiniciarPosicionJugador(){
        PosicionActualJugador = Bloqueado;
        NumeroTirosConsecutivosSeis = 0;
    }

    private boolean haGanado(){
        return PosicionActualJugador == TamañoTablero;
    }

    private int TirarDado(){
        return (int) (Math.random() * MaxCaraDado) + 1;
    }

}