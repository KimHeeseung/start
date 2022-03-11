import java.util.*;
public class Test03 {

 public static void main(String[] args) {

	 int [] sung = new int [5];

	 int tot = 0;

	 double avg = 0;




	 for (int i = 0; i < sung.length; ++i) {

	 System.out.print("성적을 입력하소 : ");

	 sung[i] = Integer.parseInt(in.readLine());

	 tot += sung[i];

	 }


	 avg = tot / sung.length;


	 System.out.println(avg);

	 }



	 }