package in.ineuron.question;

import java.util.*;

public class Question7 {
	Deque<Integer> left;
    Deque<Integer> right;

    public void FrontMiddleBackQueue() {
        left = new LinkedList<>();
        right = new LinkedList<>();
    }

    public void pushFront(int val) {
        left.offerFirst(val);
        if (left.size() > right.size()) right.offerFirst(left.pollLast());
    }

    public void pushMiddle(int val) {
        if (left.size() == right.size()) right.offerFirst(val);
        else left.offerLast(val);
    }

    public void pushBack(int val) {
        if (left.size() < right.size()) left.offerLast(right.pollFirst());
        right.offerLast(val);
    }

    public int popFront() {
        if (left.size() < right.size()) left.offerLast(right.pollFirst());
        return left.isEmpty() ? -1 : left.pollFirst();
    }

    public int popMiddle() {
        if (left.size() == right.size()) return left.isEmpty() ? -1 : left.pollLast();
        else return right.isEmpty() ? -1 : right.pollFirst();
    }

    public int popBack() {
        if (left.size() == right.size() && !left.isEmpty()) right.offerFirst(left.pollLast());
        return right.isEmpty() ? -1 : right.pollLast();
    }
}
