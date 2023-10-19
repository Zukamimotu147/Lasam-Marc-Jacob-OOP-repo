import java.util.*;

class RouteChecker {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double speed, distance = 0;
      int choice, choice2;
      
      System.out.print("Enter your Speed: ");
      speed = scan.nextDouble();
      
      System.out.println("Starting Point: Cebu City");
      System.out.println("Route 1 (Mingla)\nRoute 2 (San Fernando)\nRoute 3 (CarCar)");
      System.out.println("Is Route 4.1 (Barili) obstructed?\n [1] Yes or [2] No");
      
      choice = scan.nextInt();
      
      switch (choice) {
         case 1:
            System.out.println("========");
            System.out.println("Route 4.2 (Sibonga)");
            System.out.println("Is Route 4.2.1 (Dumanjug) obstructed?\n [1] Yes or [2] No");
            System.out.println("========");
            choice2 = scan.nextInt();
            switch (choice2) {
               case 1:
                  System.out.println("========");
                  System.out.println("Route 5 (Argao)");
                  System.out.println("Route 5.1 (Ronda)");
                  System.out.println("Route 5.2 (Alcantara)");
                  System.out.println("END (MoalBoal)");
                  System.out.println("========");
                  distance = 103;
                  break;
               case 2:
                  System.out.println("========");
                  System.out.println("Route 4.2.1 (Dumanjug)");
                  System.out.println("Route 4.2.2 (Alcantara)");
                  System.out.println("END (MoalBoal)");
                  System.out.println("========");
                  distance = 96.2;
                  break;
               }
               break;
          case 2:
            System.out.println("========");
            System.out.println("Route 4.1 (Barili)");
            System.out.println("Route 4.1.1 (Dumanjug)");
            System.out.println("Route 4.1.2 (Alcantara)");
            System.out.println("END (MoalBoal)");
            System.out.println("========");
            distance = 84.9;
            break; 
      }
      double calETA = distance/speed;
      int hour = (int)calETA;
      int mins = (int)(calETA*100) % 100;
      if (mins >= 60) {
         mins = mins - 60;
         hour++;
      }
      System.out.printf("\nSpeed = %.2f km/hr", speed);
      System.out.printf("\nTotal Distance = %.2f km", distance);
      System.out.printf("\nEstimated Time of Arrival = %d hour/s and %d minutes",hour, mins);
   }
}
