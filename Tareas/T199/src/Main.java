public class Main {

    public static void main(String[] args) {
        CreateSequentialFile.openFile(); // No se inicia ObjectOutputStream , nos da la excepcion NullPoint
        CreateSequentialFile.addRecords();
        CreateSequentialFile.closeFile();
    }
}
