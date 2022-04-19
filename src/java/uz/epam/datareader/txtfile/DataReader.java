package java.uz.epam.datareader.txtfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class DataReader {
    List<String> list = new ArrayList<>();

    int[] array;
    public void readFromFile() {
        try {
            File file = new File("C:\\Users\\User\\IdeaProjects\\Subtask\\src\\java\\uz\\epam\\datareader\\txtfile\\Numbers");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String str;
            while ((str = br.readLine()) != null) {

                list.add(str);
            }
            array = new int[list.size()];
            for(int i=0;i<list.size();i++){
                array[i]=Integer.parseInt(list.get(i));
            }
            System.out.println(Arrays.toString(array));

        }catch (Exception e){
            System.out.println(e);
        }
    }

}
