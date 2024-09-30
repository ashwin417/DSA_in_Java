import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args) {
        Area rectProto = new Rectangle("Simple Rectangle");
        AreaClient client = new AreaClient(rectProto);
        Area rectSimple = client.createArea();
        rectSimple.draw();
    }
}

interface Area{
    Area clone();  // making the duplicate copy of the interface itself
    void draw();
}

//------Prototype class--------//
class Rectangle implements Area{
    private String name;
    public Rectangle(String name){
        this.name = name;
    }
    @Override
    public Area clone(){
        return new Rectangle(this.name) ; //creating a duplicate copy of the class Recatngle object
    }
    @Override
    public void draw(){
        System.out.println(" Drawing the clone copy of the rectangle : "+ name);
    }
}

class AreaClient{
    private Area proto;
    public AreaClient(Area proto)
    {
        this.proto = proto;
    }
    public Area createArea()
    {
        return proto.clone();
    }
}