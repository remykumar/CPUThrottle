import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

/*import static java.lang.StrictMath.atan;
import static java.lang.StrictMath.tan;*/

class SimpleThread extends Thread
{
    public static int duration;

    public SimpleThread(String str) {
        super(str);
    }


    public void run()   {
        /*int currentMin = LocalDateTime.now().getMinute();
        int currentHour = LocalDateTime.now().getHour();
        int currentSec = LocalDateTime.now().getSecond();*/
       // int a[] = new int[-2];
       //Integer value  = Integer.valueOf("8.1");


        int newTimeMin = LocalDateTime.now().plusMinutes(duration).getMinute();
        int newTimeHour = LocalDateTime.now().plusMinutes(duration).getHour();
        int newTimeSec = LocalDateTime.now().plusMinutes(duration).getSecond();

        /*LocalDate ab = LocalDate.of(2014,3,26);
        Period p = Period.ofDays(1);
        ab.plus(p);*/
       // System.out.println(duration);
        //System.out.println(currentMin);
        //System.out.println(newTimeMin);
        while (Math.abs(LocalDateTime.now().getMinute() - newTimeMin) != 0  || newTimeSec != LocalDateTime.now().getSecond() ||  newTimeHour != LocalDateTime.now().getHour()) {
              System.out.println(LocalDateTime.now() + ": Current Running = " + getName());
           /*  for (int i=0; i<1000000; i++) {
                double d = tan(atan(tan(atan(tan(atan(tan(atan(tan(atan(123456789.123456789))))))))));

            }*/
            StringBuffer s1 = new StringBuffer();
            for (long  j = 0; j < 10000000; j++) {
                s1.append(getName());

                for (int k = 0; k < 1000; k++) {
                    StringBuilder S2 = new StringBuilder(1000);
                }
            }
                try {
                    sleep((int) (Math.random() * 1000));
                } catch (InterruptedException e) {
                }

        }
        System.out.println("DONE! " + getName());
    }
}

class TwoThreadsTest {
    public static void main (String[] args) {
        // Creating the number of threads
        Scanner input = new Scanner(System.in);
        System.out.println("To create max CPU usage on host. Enter, number of threads = CPU count on host ");
        System.out.print("Enter the number of threads to start (Please don't exceed your CPU count on host) :\t ");
        int threadCount = input.nextInt();

        System.out.print("Ctrl + C on the console to kill the program. \n");
        SimpleThread.duration = 60;

        for (int i = 1; i <= threadCount; i++) {
           new Thread(new SimpleThread("Thread "+i)).start();
        }

        //new SimpleThread("Fiji").start();
    }
}

