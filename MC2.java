public class MC2{
    public void MC2point2_1C(){
        Thing someThing;
        System.out.println("There's literally no way to check if it's null because BlueJ won't compile it if it hasn't been initialized");
    }
    
    public void MC2point9_1B(){
        System.out.println((int)(Math.random()*4+1));
    }
    
    
}

class Thing{
    private String color;
    
    public Thing(){
        color = "Blue";
    }
    
    public Thing(String setColor){
        color = setColor;
    }
}