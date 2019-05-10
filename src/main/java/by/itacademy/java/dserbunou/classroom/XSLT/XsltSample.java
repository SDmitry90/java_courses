package by.itacademy.java.dserbunou.classroom.XSLT;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XsltSample {
    // трансформация
    public static void main(final String[] args) throws TransformerException {
        final StreamSource source = new StreamSource(XsltSample.class.getResourceAsStream("xml-source.xml"));
        final StreamSource stylesource = new StreamSource(XsltSample.class.getResourceAsStream("hello.xsl"));

        final TransformerFactory factory = TransformerFactory.newInstance();
        final Transformer transformer = factory.newTransformer(stylesource);

        final StreamResult result = new StreamResult(System.out);
        transformer.transform(source, result);

    }
}