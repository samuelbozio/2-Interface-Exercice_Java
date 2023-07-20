public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading datas");
    }

    @Override
    public void removeDate() {
        System.out.println("Removing datas");
    }

    @Override
    public void check() {
        System.out.println("Check data permissions");
    }


}
