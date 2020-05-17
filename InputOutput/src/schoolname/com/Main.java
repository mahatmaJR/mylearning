package schoolname.com;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InOutput rk = new InOutput();
        //rk.readWriteKeyboard();
        rk.bufferedInputOutput();
    }

}

class InOutput{
    public void fileInputOutputStream() throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("C:\\Users\\lenovo\\IdeaProjects\\InputOutput\\src\\schoolname\\com\\input.txt");
            out = new FileOutputStream("C:\\Users\\lenovo\\IdeaProjects\\InputOutput\\src\\schoolname\\com\\output.txt");

            int c;

            while ((c = in.read()) != -1){
                out.write(c);
                System.out.println(c);
            }
        } finally {
            if(in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }
        }
    }

    public void fileReaderWriter() throws IOException {
        FileReader inRead = null;
        FileWriter outWrite = null;
        try {
            inRead = new FileReader("C:\\Users\\lenovo\\IdeaProjects\\InputOutput\\src\\schoolname\\com\\Syllabus.ppt");
            outWrite = new FileWriter("C:\\Users\\lenovo\\IdeaProjects\\InputOutput\\src\\schoolname\\com\\output.txt");


            int d;

            while ((d = inRead.read()) != -1) {
                outWrite.write(d);
            }
        } finally {
            if (inRead != null){inRead.close();}
            if (outWrite != null){outWrite.close();}
        }
    }

    public void readWriteKeyboard() throws IOException {
        InputStreamReader keyboard = null;

        try {
            keyboard = new InputStreamReader(System.in);
            System.out.println("Enter any Character, or 'q' to quit.");

            char c;
            do {
                c = (char)keyboard.read();
                System.out.println(c);
            }
            while (c != 'q');
        }
        finally {
            if (keyboard != null) {
                keyboard.close();
            }
        }
    }

    public void bufferedInputOutput() throws IOException {
        InputStream inStream = null;
        BufferedInputStream bis = null;

        try {
            inStream = new FileInputStream("C:\\Users\\lenovo\\IdeaProjects\\InputOutput\\src\\schoolname\\com\\input.txt");
            bis = new BufferedInputStream(inStream);

            while (bis.available() > 0) {
                char c;
                c = (char)bis.read();

                System.out.println("Char: " + c);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            if (inStream != null){
                inStream.close();
            }
            if (bis != null){
                bis.close();
            }
        }
    }
}
