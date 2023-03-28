
import java.io.FileWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
//block number 0
        FileWriter fileWriter0 = new FileWriter("visited.txt", true);
        fileWriter0.write("Block number " +0+ " is visited\n");
        fileWriter0.close();

        int x=5;
        //ANTLRFileStream input=new ANTLRFileStream("C:\\Users\\Sayed\\IdeaProjects\\trial\\src\\trial.java");
        if(5>=4){
//block number 1
        FileWriter fileWriter1 = new FileWriter("visited.txt", true);
        fileWriter1.write("Block number " +1+ " is visited\n");
        fileWriter1.close();

            if(1==0){
//block number 2
        FileWriter fileWriter2 = new FileWriter("visited.txt", true);
        fileWriter2.write("Block number " +2+ " is visited\n");
        fileWriter2.close();


            }
            for( int i=0;i<5;i++){
//block number 3
        FileWriter fileWriter3 = new FileWriter("visited.txt", true);
        fileWriter3.write("Block number " +3+ " is visited\n");
        fileWriter3.close();

                System.out.println("Hello");
            }
        }
    }
}
