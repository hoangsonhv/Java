package Practical;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Hotel> hotel = new ArrayList<>();
        hotel.add(new Hotel("hotela", "location.1", "ownername"));
        hotel.add(new Hotel("hotelb", "location.2", "ownername11"));
        hotel.add(new Hotel("hotelc", "location.3", "ownername22"));
        hotel.add(new Hotel("hoteld", "location.4", "ownername33"));
        hotel.add(new Hotel("hotele", "location.5", "ownername44"));
        hotel.add(new Hotel("hotelf", "location.6", "ownername55"));
        hotel.add(new Hotel("hotelg", "location.7", "ownername66"));
        hotel.add(new Hotel("hotelh", "location.8", "ownername77"));
        hotel.add(new Hotel("hoteli", "location.9", "ownername88"));
        hotel.add(new Hotel("hotelk", "location.10", "ownername99"));

        Scanner sc = new Scanner(System.in);
        String ownerName;
        System.out.println("Input the Owner’s Name:");
        ownerName = sc.nextLine();
        for (int i = 0;i<hotel.size();i++){
            if (ownerName.equals(hotel.get(i).getOwnerName())){
                System.out.println("Name Hotel: "+hotel.get(i).getName()+"\n"+"Location Hotel: "+hotel.get(i).getLocation()+"\n"+"Ownername Hotel: "+hotel.get(i).getOwnerName());
            }
        }
    }
}
