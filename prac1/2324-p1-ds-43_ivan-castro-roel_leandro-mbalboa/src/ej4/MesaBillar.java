package ej4;

import java.util.ArrayList;
public class MesaBillar {
    //Atributos
    private ArrayList <BolaBillar> cajetin;
    private ArrayList <BolaBillar> bolasEnJuego;
    private boolean enJuego;

    //Constructores
    public MesaBillar(){
        enJuego = false;
        cajetin = new ArrayList<BolaBillar>();
        bolasEnJuego = new ArrayList<BolaBillar>();
        BolaBillar[] valores = BolaBillar.values();
        for(BolaBillar bola : valores){
            cajetin.add(bola);
        }
    }

    //Métodos
    public void iniciarPartida(){
        enJuego = true;
        bolasEnJuego.addAll(cajetin);
        cajetin.clear();
    }

    public void meterBola(BolaBillar bola){

        if(bola.getNumero() == 8){
            enJuego = false;
        }
        else if(bola.getNumero() == 0){
            if(enJuego == false){
                cajetin.add(bola);
                bolasEnJuego.remove(bola);
            }
        }
        else if(bola.getNumero() > 0 && bola.getNumero() < 16){
            cajetin.add(bola);
            bolasEnJuego.remove(bola);
        }
    }

    public ArrayList<BolaBillar> bolasMesa(){
        return bolasEnJuego;
    }

    public ArrayList<BolaBillar> bolasCajetin(){
        return cajetin;
    }

    public boolean esPartidaIniciada(){
        return enJuego;
    }

    public String obtenerGanador(){
        int numLisas = 0;
        int numRayadas = 0;
        String resultado = "";
        for(int i = 0; i < bolasEnJuego.size(); i++){
            if (bolasEnJuego.get(i).getTipo().equals("LISA") && bolasEnJuego.get(i).getNumero() != 0 && bolasEnJuego.get(i).getNumero() !=8){
                numLisas ++;
            }else if(bolasEnJuego.get(i).getTipo().equals("RAYADA")){
                numRayadas++;
            }
        }
        if (enJuego){
            if(numLisas < numRayadas){
                resultado = "Van ganando las lisas";
            }else if(numRayadas < numLisas){
                resultado = "Van ganando las rayadas";
            }else if(numRayadas == numLisas){
                resultado = "Van empatados";
            }
        }else{
            if(numLisas < numRayadas){
                resultado = "Han ganado las lisas";
            }else if(numRayadas < numLisas){
                resultado = "Han ganado las rayadas";
            }
        }
        return resultado;
    }
}