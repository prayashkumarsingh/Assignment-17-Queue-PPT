package in.ineuron.question;

private final LinkedList<Integer> timeFrames;

private int count;

public noOfCall() {
    this.timeFrames = new LinkedList<>();
}
public int ping(int t) {
    this.timeFrames.offer(t);
    ++this.count;

    int oldestTime = t - 3000;
    if (oldestTime < 0) {
        return this.count;
    }

    int lessElementsCount = 0;
    Iterator<Integer> it = this.timeFrames.iterator();
    while (it.hasNext()) {
        int currentTime = it.next();

        if (currentTime >= oldestTime) {
            break;
        }

        ++lessElementsCount;
    }

    return this.count - lessElementsCount;
    }
}
