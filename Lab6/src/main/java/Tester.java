import java.io.*;


public class Tester {
    public static void main(String[] args) {

        String string = "Hello";
        StringWriter out = new StringWriter(128);

        Coder coder = new Coder(out);

        coder.write(string);

        coder.close();

        StringReader in = new StringReader(coder.getString());
        Decoder decoder = new Decoder(in);


        System.out.println(out);

        int i = 0;

        while (i < out.getBuffer().length()) {
            System.out.print((char)decoder.read());
            i++;
        }

        decoder.close();

    }
}
