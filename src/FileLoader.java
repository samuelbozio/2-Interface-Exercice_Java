import java.sql.SQLOutput;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading  data files");
    }

    @Override
    public void removeDate() {
        System.out.println("Removing data files");
    }

    @Override
    public void check() {
        System.out.println("Checking files permissions");
    }
}
