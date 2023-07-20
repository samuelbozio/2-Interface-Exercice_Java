public interface DataLoader {

    int MAX_DATA_SIZE = 10;

    void load();
    default void check() {
        System.out.println("Check permissions");
    }

    static void retrieveMaxDataSize() {
        System.out.println("Retrieve MaxDataSize interface");
    }


}
