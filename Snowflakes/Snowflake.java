package Snowflakes;

public class Snowflake {

    private double xPos;
    private double yPos;
    private double yVel;
    private double size;
    private double theta;

    private static int snowflakecount;

    public Snowflake(){
        yPos = Math.random()*100+25;
        xPos = Math.random()*100;
        size = Math.random()*0.5+.5;
        yVel = Math.random()*50+20;
        theta = Math.random()*100+10;
    }

    public void calculate(double timeElapsed){
        yPos = yPos - yVel*timeElapsed;
        xPos = xPos + (Math.random()*0.5)*Math.sin(yPos*0.2);
        if(yPos < 0){
            yPos = 100;
            snowflakecount++;
            System.out.println(snowflakecount);
        }
    }

    public void draw(){
        StdDraw.setPenColor(StdDraw.WHITE);
        //StdDraw.filledCircle(xPos, yPos, size);
        StdDraw.picture(xPos, yPos, "H:\\My Drive\\APCSA\\src\\Demo.png", 12,10,theta);
        theta+=5;
        if(theta == 360) {
            theta = 0;

        }
    }

}