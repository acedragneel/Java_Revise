package patterns.structuralpattern.decorator;

public class EncryptionDecorator extends DataSourceDecorator{
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    public void writeData(String data){
        String encryptedData = encrypt(data);
        System.out.println("Encrypting data: " + encryptedData);
        super.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String data = super.readData();
        return decrypt(data);
    }


    private String encrypt(String data){
        return "encrypted_" + data;
    }

    private String decrypt(String data){
        return data.replace("encrypted_","");
    }
}
