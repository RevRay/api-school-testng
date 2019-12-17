import products.Product;

import java.util.LinkedList;
import java.util.Queue;

public class StorageContainer {
    Container[] storage;

    public StorageContainer() {
        storage = new Container[]{
            new Container(),
            new Container(),
            new Container(),
            new Container()
        };
    }
}
