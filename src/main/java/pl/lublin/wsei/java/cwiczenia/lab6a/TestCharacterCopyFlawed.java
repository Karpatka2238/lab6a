package pl.lublin.wsei.java.cwiczenia.lab6a;

import java.io.*;
import java.time.Instant;

public class TestCharacterCopyFlawed {

        public static void main(String[] args) throws IOException {

            BufferedReader in = null;
            BufferedWriter out = null;

            long startTime = Instant.now().toEpochMilli();


            try {
                in = new BufferedReader(new FileReader(""))
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
                if (out != null) {
                    out.close();
                }
            }

            System.out.println("Czas wykonania: " + (System.currentTimeMillis()-startTime) + "ms");


        }

    }

}
