import java.util.ArrayList;
public class TestBall
{
   
    public TestBall()
    {
    }

    public static ArrayList<Ball> testBall()
    {   ArrayList<Ball> balls = new ArrayList<>();
       
        Ball a = new Ball();
        Ball b = new Ball();
         balls.add(a);
        balls.add(b);
        a.x = 3;
        a.y = 5;
        a.gravity = 9.8;
        b.x = 6;
        b.y = 7;
        b.gravity = 6;
        Ball.gravity = 4;
        System.out.println("a.x "+a.x);
        System.out.println("a.gravity "+a.gravity);
        return balls;
        
    }
}
