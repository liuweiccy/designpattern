package com.liuwei.designpattern.facade.examplebase;

public class EncryptFacade extends AbstractEncryFacade {
    private FileReader fileReader;
    private FileWriter fileWriter;
    private Encrypt encrypt;

    public void encrypt(String formName, String toName) {
        fileReader = new FileReader();
        fileWriter = new FileWriter();
        encrypt = new Encrypt();

        fileReader.read(formName);
        encrypt.doEncrypt();
        fileWriter.writer(toName);
    }
}
