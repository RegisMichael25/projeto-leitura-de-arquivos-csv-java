import javax.swing.plaf.ProgressBarUI;
import java.io.*;

public class FileService {
    public static void writeFile(String file) {
        File newFile = new File(file);
        Products addProduct;
        try{
            FileWriter fileWriter = new FileWriter(newFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            addProduct = new Products(JOptionPaneFunctions.inputNome(), JOptionPaneFunctions.inputId(), JOptionPaneFunctions.inputPreco());

            bufferedWriter.write(addProduct.getId() + ";" + addProduct.getName() + ";" + addProduct.getPreco());
            bufferedWriter.newLine();



            bufferedWriter.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile(String file) {
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            while((linha = bufferedReader.readLine()) != null)  {
                System.out.println(linha);
            }

            bufferedReader.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
