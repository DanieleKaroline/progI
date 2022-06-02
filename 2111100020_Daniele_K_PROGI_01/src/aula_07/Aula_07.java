package aula_07;

public class Aula_07 {

    public static void main(String[] args) {
        Vidro v = new Vidro();
        Farol f = new Farol();
        v.subirVidro();
        v.subirVidro();
        v.subirVidro();
        v.subirVidro();
        v.subirVidro();
        v.baixarVidro();
        v.baixarVidro();
        v.subirVidro();
        v.subirVidro();
        v.baixarVidro();
        System.out.println(v.getPosicao());
        
        f.LigarFarol();
        f.getLuz();
        f.LigarFarol();
        f.DesligarFarol();
        f.DesligarFarol();
        f.LigarAlerta();
        f.LigarAlerta();
        f.DesligarAlerta();
        f.DesligarAlerta();
        f.LigarFarol();
        f.getLuz();
    }
    
}
