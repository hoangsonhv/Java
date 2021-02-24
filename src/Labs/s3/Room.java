package Labs.s3;

import java.util.ArrayList;

public class Room {
    private String room;
    private String index;
    ArrayList<String> users;

    public Room() {
        users = new ArrayList<String>();
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void addUser(String u){
        users.add(u);
    }

    public void removeUser(String u){
        users.remove(u);
    }

    public void printRoom(){
        System.out.println("Room: "+getRoom());
        System.out.println("index: "+getIndex());
        System.out.println("users:");
        for (String i:users){
            System.out.println(i);
        }
    }
}
