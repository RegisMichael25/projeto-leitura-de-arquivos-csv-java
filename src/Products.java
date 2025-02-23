import java.io.File;

public class Products {
    private static String fileProduct = "product.csv";
    private static String pathFileProduct =
            "C:" + File.separator +
            "Users" + File.separator +
            "Regis Michael" + File.separator +
            "WorkSpace" + File.separator +
            "java-editor-de-arquivos" + File.separator +
            "projeto-leitura-de-arquivos-csv-java" + File.separator +
            "dados" + File.separator + fileProduct;

    private String name;
    private int id;
    private float preco;;
// Constructor
    public Products(String name, int id, float preco) {
            this.name = name;
            this.id = id;
            this.preco = preco;
    }
// Getters e Setters Name e Id

    public String getFileProduct() {
        return fileProduct;
    }

    public void setFileProduct(String FileProduct) {
        this.fileProduct = fileProduct;
    }

    public static String getPathFileProduct() {
        return pathFileProduct;
    }

    public void setPathFileBooks(String pathFileProduct) {
        this.pathFileProduct = pathFileProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    // Methods

}

