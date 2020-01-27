import java.io.FileReader;
import java.net.URL;
import com.opencsv.CSVReader;

public class Dictionary {

    public void loadAlgs() {

        System.out.println("Begin loading algs...");
        //ArrayList<String> algs
        int counter = 0;
        try{
            URL url = getClass().getResource("en_US.dic");
            CSVReader reader = new CSVReader(new FileReader(new File(url.toURI()).getAbsolutePath()));
            String [] line;
            while ((line = reader.readNext()) != null) {
                String algorithmMod;
                algorithm = line[0];
                StringBuilder sb = new StringBuilder(algorithm);
                sb.deleteCharAt(4);
                sb.deleteCharAt(4);
                sb.deleteCharAt(4);
                algorithmMod = sb.toString();
                algs.add(algorithmMod);
                System.out.println(algs.get(counter));
                counter++;
            }
        } catch(IOException | URISyntaxException e){
            System.out.println("Failure! Something went wrong when loading the algs");
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}
