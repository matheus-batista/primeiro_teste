package SocialNetwork;

public class MessagePost extends Post {
    private String message;
    
    public messagePost(String nome,String text){
        super(nome);
        message=text;
    }

    public String getText(){
        return message;
    }

    public void interface(){
        System.out.println(getName());
        System.out.println(message);
        System.out.println(getTempoDecorrido(getData()));
        if(getLikes() > 0){
            System.out.println("-"+ getLikes()+"pessoas curtiram.");       
        }else{
            System.out.println();
        }

        if(getComentario().isEmpty()){
            System.out.println("  Sem comentario  ");
        }else{
            System.out.println("  "+ getComentario().size()+"comentarios.");
        }
    }
}
