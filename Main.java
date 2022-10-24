import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        System.out.println("Project For Hacktoberfest!!");

        System.out.println("DSA Programs for practicing ");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int ch;
        System.out.println("1. Sorting");
        System.out.println("2. Linked List");
        System.out.println("3. searching");
        System.out.println("4. Trees ");

        try{
            ch=Integer.parseInt(br.readLine());
            switch(ch){
                case 1:
                    new ClassSort();
                    break;
                case 2:
                    new ClassSearch();
                    break;
            }

        } catch (Exception e) {
            System.out.println("error");
        }


    }
}