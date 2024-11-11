package patterns.structuralpattern.decorator;

public class Application {
    public static void main(String[] args) {
        String salaryRecords = "Sensitive Salary Data";

        // Start with the basic FileDataSource
        DataSource source = new FileDataSource("salary.dat");

        // Then wrap in EncryptionDecorator on top of CompressionDecorator
        source = new EncryptionDecorator(source);

        // Wrap in CompressionDecorator first
        source = new CompressionDecorator(source);

        // Now, all layers of decoration are applied
        source.writeData(salaryRecords);

        // When reading, it will decrypt and then decompress
        System.out.println("Read data: " + source.readData());
    }
}
