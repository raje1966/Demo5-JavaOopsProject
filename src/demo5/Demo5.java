package demo5;

class Plane 
{
    void takeoff() 
    {
        System.out.println("Plane is taking off");
    }
    void fly() 
    {
        System.out.println("Plane is flying");
    }
    void land() 
    {
        System.out.println("Plane is landing");
    }
    
}

class cargoPlane extends Plane 
{
    void takeoff() 
    {
        System.out.println("cargoPlane is taking off");
    }
    void fly() 
    {
        System.out.println("CargoPlane is flying");
    }
    void land() 
    {
        System.out.println("CargoPlane is landing");
    }
}

class passengerPlane extends Plane 
{
    void takeoff() 
    {
        System.out.println("PassengerPlane is taking off");
    }
    void fly() 
    {
        System.out.println("PassengerPlane is flying");
    }
    void land() 
    {
        System.out.println("PassengerPlane is landing");
    }
}

class fighterPlane extends Plane 
{
    void takeoff() 
    {
        System.out.println("FighterPlane is taking off");
    }
    void fly() 
    {
        System.out.println("FighterPlane is flying");
    }
    void land() 
    {
        System.out.println("FighterPlane is landing");
    }
}

class Airport 
{
    void permit(Plane ref) 
    {
        ref.takeoff();
        ref.fly();
        ref.land();
        
    }
            
}
public class Demo5 {
    
    
    public static void main(String[] args) {
        
        cargoPlane cp = new cargoPlane();
        passengerPlane pp = new passengerPlane();
        fighterPlane fp = new fighterPlane();
        
        Airport a = new Airport();
        a.permit(fp);
        a.permit(pp);
        a.permit(cp);
        
    }
    
}
