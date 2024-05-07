import java.io.*;
import java.util.ArrayList;

public  class Utility {
    public void FileWrite(String filename,String data){
        try {
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (IOException e) {
            System.out.println("exception caught");
        }
    }
    public void fileRead(String filename){
        String data ="";
        ArrayList<String> data1=null;
        try {
           data1=new ArrayList<>();
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line="";
            while((line=br.readLine())!=null){
                data+=line;
            }

            for(String word:data.split(";")){
                data1.add(word);
            }

        for(String word:data1){
            System.out.println(word);
        }

        } catch (IOException e) {
            System.out.println("exception caught");
        }
    }
}
