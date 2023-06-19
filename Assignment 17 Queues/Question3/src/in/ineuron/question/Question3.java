package in.ineuron.question;
import java.util.*;
public class Question3 {
	public static int countStudentUnableEat(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<Integer>();
        int length = students.length;
        for (int i = 0; i < length; i++)
            queue.offer(students[i]);
        int index = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int student = queue.poll();
                if (student == sandwiches[index])
                    index++;
                else
                    queue.offer(student);
            }
            if (size == queue.size())
                break;
        }
        return queue.size();
    }
	public static void main(String[] args)
	  {
	    int students[] = {1,1,0,0};
	    int sandwiches[] = {0,1,0,1};
	    
	    System.out.println(countStudentUnableEat(students,sandwiches));
	  }
}
