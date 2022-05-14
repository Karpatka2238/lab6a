package pl.lublin.wsei.java.cwiczenia.lab6a;

import java.io.*;

public class TestBufferedBinCopy {

    public static void main(String[] args) throws IOException {

        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        long startTime = System.nanoTime();

        try {
            in = new BufferedInputStream((new FileInputStream("sample_1920×1280(1).tiff")));
            out = new BufferedOutputStream((new FileOutputStream("img_copy.tiff")));

            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
        catch (IOException e) {
            System.out.println("IOException : "+e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (in != null) {
                in.close();
            }
        }
        long endTme = System.nanoTime();
        long timeElapsed = endTme - startTime;

        System.out.println("Czas wykonania w nanosekundach : " + timeElapsed);
        System.out.println("Czas wykonania w milisekundach : " + timeElapsed / 1000000);

    }

}
