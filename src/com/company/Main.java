package com.company;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        String s="";
        BufferedReader br=null;
        OutputStream fos=null;
        PrintWriter pw=null;
        AtomicInteger counter = new AtomicInteger(1);

        while (true) {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a text: ");
            s = br.readLine();

            if(s.equals("-1")){
                break;
            }

            /*LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH_mm_ss");
            String text = date.format(df);*/

            File file = new File("C:\\java\\WriteToFile\\file_" + counter.getAndIncrement() +".txt");

            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);

            pw.write(s);
            pw.flush();
        }
            br.close();
            fos.close();
            pw.close();
    }
}
