package chatsystem;

import com.google.firebase.database.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Thread t=new Thread(new ShowDbChanges());

        t.run();
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}