public class MultithreadingSearch {
    //Given a large file of integers, search for a particular element in it using multi-threading.
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numberToFind = 10;
        threadCreation(myArray, 2, false, numberToFind);

    }

    private static void threadCreation(int[] myArray, int numberOfThreads, boolean found, int numberToFind) {
        int myArraySize = myArray.length-1;
        int startPosition = 0;
        int lengthOfEachThread = myArraySize / numberOfThreads;
        int endPosition = startPosition + lengthOfEachThread;
        for (int i = 0; i < numberOfThreads; i++) {
            MyRunnableThread runnableThread = new MyRunnableThread(i+1 + " thread", myArray, found, numberToFind, startPosition, endPosition);
            startPosition += (lengthOfEachThread+1);
            endPosition += (lengthOfEachThread+1);
        }
    }
}

class MyRunnableThread implements Runnable {
    private boolean found;
    private int numberToFind;
    private String name;
    //Thread class needed to spawn the thread
    private Thread thread;
    private int[] myArray;
    private int start;
    private int end;

    //constructor to create and start threads
    public MyRunnableThread(String name, int[] myArray, boolean found, int numberToFind, int start, int end) {
        thread = new Thread(this, name);
        this.name = name;
        this.myArray = myArray;
        this.found = found;
        this.numberToFind = numberToFind;
        this.start = start;
        this.end = end;
        thread.start();
    }

    //run each thread with a try/catch
    @Override
    public void run() {
        try {
            //System.out.println(start);
            //System.out.println(end);
            for (int i = start; i <= end; i++) {
                if (myArray[i] == numberToFind) {
                    found = true;
                    System.out.println("Thread " + this.name + " found the number: " + myArray[i]);
                }
            }
            if (!found) {
                System.out.println("Thread " + this.name + " can't find your missing number!");
            }

        } catch (Exception e) {
            System.out.println("Exception in thread");
        }
        System.out.println("Found = " + found);
    }
}