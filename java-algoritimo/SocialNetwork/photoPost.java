package SocialNetwork;

public class PhotoPost extends Post {
    private
}

/*
public class PhotoPost extends Post
{
    private String filename;
    private String caption;

    public PhotoPost(String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
    }    
    
    public String getImageFile()
    {
        return filename;
    }    
    
    public String getCaption()
    {
        return caption;
    }    
    
    public void display()
    {
        System.out.println(getUserName());
        System.out.println(" [" + filename + "]");
        System.out.println(" " + caption);
        System.out.print(getTimeString(getTimeStamp()));  
        
        if(getLikes() > 0) 
        {
            System.out.println(" — " + getLikes() + " people like this.");
        }
        else 
        {
            System.out.println();
        }        
        if(getComments().isEmpty()) 
        {
            System.out.println("No comments.");            
        }
        else 
        {
            System.out.println("   " + getComments().size() +
            " comment(s). Click here to view.");
        }        
    }
}
*/