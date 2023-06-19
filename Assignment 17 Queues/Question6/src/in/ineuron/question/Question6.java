package in.ineuron.question;
import java.util.*;
public class Question6 {
	public static int[] deckRevealedIncreasing(int[] deck) {
	    final int n = deck.length;

	    Arrays.sort(deck);

	    Deque<Integer> q = new ArrayDeque<>();
	    q.addFirst(deck[n - 1]);

	    for (int i = n - 2; i >= 0; --i) {
	      q.addFirst(q.getLast());
	      q.pollLast();
	      q.addFirst(deck[i]);
	    }

	    for (int i = 0; i < n; ++i)
	      deck[i] = q.pollFirst();

	    return deck;
	  }
	public static void main(String[] args)
	  {
	    int deck[] = {17,13,11,2,3,5,7};
	    for (int k : deckRevealedIncreasing(deck)){

	    	System.out.println(k);

	    	}
	    
	  }
}
