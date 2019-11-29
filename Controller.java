import java.util.*;
public class Controller{
    Stack gleis1 = new Stack<Waggon>();
    Stack gleis2 = new Stack<Waggon>();
    Stack gleis3 = new Stack<Waggon>();
    public Controller(int pAnzahlWaggons){
        for(int i = 0 ; i < pAnzahlWaggons ; i++)
        {
            int randomNum = new java.util.Random().nextInt(pAnzahlWaggons;
            gleis1.push(new Waggon(randomNum));
        }
    }
    public sort()
    {
        gleis2.push(gleis1.getTop());
        gleis1.pop();
        while(!gleis1.isEmpty())
        {
        }
    }
}
