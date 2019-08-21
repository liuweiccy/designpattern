package com.liuwei.designpattern.util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author liuwei2
 */
public class XMLUtil {

    public static final String CONFIG_XML = "src/main/resources/config.xml";

    public static String getChartType(String nodeName) {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File(CONFIG_XML));
            NodeList n1 = doc.getElementsByTagName(nodeName);
            Node classNode = n1.item(0).getFirstChild();
            return classNode.getNodeValue().trim();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
