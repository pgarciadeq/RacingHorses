import java.util.Random;

public class RaceMain {
    static final int NUM_HORSES = 5;
    static final int TRACK_LENGTH = 50;

    public static void main(String[] args) throws InterruptedException{
        char[] horses = {'A','B','C','D','E'};
        int[] positions = new int[NUM_HORSES];
        Random rand = new Random();
        boolean raceOver = false;

        while(!raceOver){

            for(int i=0;i<30;i++) System.out.println();

            for(int i=0; i <NUM_HORSES;i++){
                int move = rand.nextInt(3);
                positions[i]+=move;
                for(int j = 0;j<positions[i];j++) System.out.print(" ");
                System.out.println(horses[i]);
                if(positions[i]>=TRACK_LENGTH){
                    System.out.println("\nHorse "+horses[i]+" wins!");
                    raceOver =true;
                }
            }
            Thread.sleep(500);
        }


    }
}
