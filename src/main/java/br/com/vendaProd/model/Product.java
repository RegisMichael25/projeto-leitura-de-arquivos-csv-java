package main.java.br.com.vendaProd.model;
import java.io.File;
//C:\Users\Claudinei\projeto-leitura-de-arquivos-csv-java\dados
public class Product {
    private static final String FILE_NAME = "product.csv";
    private static final String FILE_PATH =
            "C:" + File.separator +
            "Users" + File.separator +
            "Claudinei" + File.separator +
            "projeto-leitura-de-arquivos-csv-java" + File.separator +
            "dados" + File.separator + FILE_NAME;

    private String name;
    private int id;
    private float preco;;
// Constructor
    public Product(String name, int id, float preco) {
            this.name = name;
            this.id = id;
            this.preco = preco;
    }

// Getters e Setters Name e Id
    public static String getFilePath() 
    {
        return FILE_PATH;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public float getPreco() 
    {
        return preco;
    }

    public void setPreco(float preco) 
    {
        this.preco = preco;
    }
    // Methods

}

