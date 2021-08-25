
package SocialNetwork;
import java.security.Principal;

import java.util.ArrayList;

public class Post {
    private String nome;
    private long data;
    private int likes;
    private ArrayList <String> comentarios;

    public void post(String autor){
        nome=autor;
        data=System.currentTimeMillis();
        likes=0;
        comentarios= new ArrayList<String>();
    }

    public void likes(){
        likes++;
    }

    public void unlike(){
        if(likes>0){
            likes--;
        }
    }

    void add_comentario(String texto){
        comentarios.add(texto);
    }

    public String getName(){
        return nome;
    }

    public long getData(){
        return data;
    }    

    public int getLikes(){
        return likes;
    }

    public ArrayList<String> getComentario(){
        return comentarios;
    }

    public String getTempoDecorrido(long time){
        long momento = System.currentTimeMillis();
        long diferenca = momento-time;
        long seg = diferenca/1000;
        long min = seg/60;

        if(min>0){
            return min + "minutes ago";
        }else{
            return seg + "seconds ago";
        }
    }




}
