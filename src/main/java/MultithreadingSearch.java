public class MultithreadingSearch {
    //Given a large file of integers, search for a particular element in it using multi-threading.
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 0;
        //create two instances of MyRunnableThread (automatically start using the constructor)
        MyRunnableThread runnable1 = new MyRunnableThread("First", myArray, start);
        MyRunnableThread runnable2 = new MyRunnableThread("second", myArray, start);

    }

    //main class with method that takes in int[] and the target int

    //set max number threads to four

    //set boolean found to false

    //give each thread the part of the array that it should search through

    //return boolean found as true if int found

}

class MyRunnableThread implements Runnable {
    //Thread class needed to spawn the thread
    private Thread thread;
    private int[] myArray;
    private int start;
    private int end;
    private int[] smallArray;

    //construct and start threads
    public MyRunnableThread(String name, int[] myArray, int start) {
        thread = new Thread(this, name);
        this.myArray=myArray;
        this.start=start;
        thread.start();
    }

    //run each thread with a try/catch
    @Override
    public void run() {
        try {
            if (start==0){
                start++;
                System.arraycopy(myArray, 0, smallArray, (myArray.length/2), myArray.length/2);
                for (int x : this.smallArray) {
                    System.out.println(x);
                }
            }


        } catch (Exception e) {
            System.out.println("Exception in thread");
        }
    }

}