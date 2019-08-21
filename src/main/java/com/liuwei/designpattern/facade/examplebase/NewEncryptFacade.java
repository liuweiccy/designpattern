package com.liuwei.designpattern.facade.examplebase;

public class NewEncryptFacade extends AbstractEncryFacade {
    private FileReader fileReader;
    private FileWriter fileWriter;
    private NewEncrypt encrypt;

    @Override
    public void encrypt(String formName, String toName) {
        fileReader = new FileReader();
        fileWriter = new FileWriter();
        encrypt = new NewEncrypt();

        fileReader.read(formName);
        encrypt.doEncrypt();
        fileWriter.writer(toName);
    }
}
