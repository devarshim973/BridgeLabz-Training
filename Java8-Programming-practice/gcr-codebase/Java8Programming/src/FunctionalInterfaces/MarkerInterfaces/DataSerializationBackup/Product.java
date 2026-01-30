package FunctionalInterfaces.MarkerInterfaces.DataSerializationBackup;

public class Product implements BackupSerializable {

    private int productId;
    private String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{productId=" + productId + ", productName='" + productName + "'}";
    }
}
