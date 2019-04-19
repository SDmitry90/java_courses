package by.itacademy.java.dserbunou.classroom.XSLT;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.xml.sax.SAXException;

public class XpathSample {

    public static void main(String[] args)
            throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        org.w3c.dom.Document xmlDocument = builder.parse(XpathSample.class.getResourceAsStream("epl.xml"));
        XPath xPath = XPathFactory.newInstance().newXPath();
        String expression = "/hello-world/greeting";
        System.out.println(xPath.compile(expression).evaluate(xmlDocument, XPathConstants.STRING));
    }

}
