package by.itacademy.java.dserbunou.classroom.XSLT.table;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XsltSample {
    // трансформация
    public static void main(final String[] args) throws TransformerException, FileNotFoundException {
        final StreamSource source = new StreamSource(XsltSample.class.getResourceAsStream("epl.xml"));
        final StreamSource stylesource = new StreamSource(XsltSample.class.getResourceAsStream("hello.xsl"));

        final TransformerFactory factory = TransformerFactory.newInstance();
        final Transformer transformer = factory.newTransformer(stylesource);

        final StreamResult result = new StreamResult(new FileOutputStream("index.html"));
        transformer.transform(source, result);

    }
}