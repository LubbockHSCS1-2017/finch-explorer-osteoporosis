

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * Created by: James Spann
 * Date: 1/12/2016
 * A starter file to use the Finch
 */

public class FinchTemplateFile
   {
   public static void main(final String[] args)
      {
      // Instantiating the Finch object
      Finch myFinch = new Finch();

      // Write some code here!
      
      myFinch.setLED(0, 255, 255);
      myFinch.setWheelVelocities(100, -100, 4000);
      myFinch.setWheelVelocities(255, 255, 1000);
      myFinch.setWheelVelocities(100, -100, 4000);
      myFinch.setWheelVelocities(255, 255, 1000);
      myFinch.setWheelVelocities(100, -100, 4000);
      myFinch.setWheelVelocities(255, 255, 1000);
      myFinch.setWheelVelocities(100, -100, 4000);
      myFinch.setWheelVelocities(255, 255, 1000);
      myFinch.setWheelVelocities(-100, 100, 800);
      myFinch.sleep(900000);

      // Always end your program with finch.quit()
      myFinch.quit();
      System.exit(0);
      }
   }

