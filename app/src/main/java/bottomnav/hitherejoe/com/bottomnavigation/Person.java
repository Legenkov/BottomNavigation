package bottomnav.hitherejoe.com.bottomnavigation;

/**
 * Created by User on 15.03.2018.
 */

public class Person {


    String name;

    String lastMessage;

    String lastMsgDate;

    String photoUrl;

    String lastMessageTime;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return  name;
    }



    public void setLastMessage(String lastMessage){
        this.lastMessage=lastMessage;
    }

    public String getLastMessage(){
        return  lastMessage;
    }


    public  void setLastMsgDate (String theme){
        this.lastMsgDate = theme;
    }

    public  String getLastMsgDate(){
        return lastMsgDate;
    }


    public  void setPhotoUrl (String photoUrl){
        this.photoUrl = photoUrl;
    }

    public  String getPhotoUrl(){
        return photoUrl;
    }


    public  void setLastMessageTime (String lastMessageTime){
        this.lastMessageTime = lastMessageTime;
    }

    public  String getLastMessageTime(){
        return lastMessageTime;
    }


    public Person (String name, String lastMessage, String theme, String photoUrl, String lastMessageTime){
        this.lastMessage = lastMessage;
        this.name = name;
        this.lastMsgDate=theme;
        this.photoUrl=photoUrl;
        this.lastMessageTime=lastMessageTime;
    }


}
