public class MC1{
    public void MC1point5_2A(){
        System.out.println(2/5%3 + "!=1");
        System.out.println(2/(5%3) + "==1");
        System.out.println(2/5+1 + "==1");
    }
    
    public void MC1point7_2B(){
        double d = 0.25;
        int i = 3;
        double diff = d-i;
        System.out.println((int)diff - 0.5);
    }
    
    public void MC1point7_5B(){
        double fact1=1/2; //wrong
        double fact1_=1/(double)2;
        double fact2=3*4;
        double product = fact1*fact2;
        double product_ = fact1_*fact2;
        System.out.println(product + "<-- wrong");
        System.out.println(product_ + "<-- right");
    }
}