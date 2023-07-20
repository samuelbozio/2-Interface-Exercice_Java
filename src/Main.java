import java.util.Date;

public class Main {
    public static void main(String[] args) {


        DataBaseLoader dbl = new DataBaseLoader();
        FileLoader fl = new FileLoader();
        dbl.load();
        fl.load();
        dbl.removeDate();
        fl.removeDate();
        dbl.check();
        fl.check();
        DataLoader.retrieveMaxDataSize();
       


    }
}