package com.liuwei.designpattern.proxy.example2;

public class DocumentDAO implements AbstractDocumentDAO {
    @Override
    public boolean deleteDocumentById(String documentId) {
        System.out.println("删除文档：" + documentId);
        return false;
    }
}
