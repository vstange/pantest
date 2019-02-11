package de.vstange;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * For PAN test corpus.
 * <p>
 * Directories to look at:
 * a. /home/vincent/test/pan13/01-no-plagiarism
 * - hold no plagiarism whatsoever
 * - look at total document
 * b. /home/vincent/test/pan13/02-no-obfuscation
 * - only hold "plagiarism"?
 * - look at total document and at text snippet
 * c. /home/vincent/test/pan13/03-random-obfuscation
 * - text / plagiarism is disguised
 * - look at total document and at text snippet
 *
 * @author Vincent Stange
 */
public class Main {

    private static final String PATH = "/home/vincent/test/pan13/";

    public static void main(String[] args) throws IOException {
        String fileNameSrc = "source-document00832.txt";
        String fileNameSus = "suspicious-document00006.txt";

        String textSrc = FileUtils.readFileToString(new File(PATH + "src/" + fileNameSrc), StandardCharsets.UTF_8);
        String textSus = FileUtils.readFileToString(new File(PATH + "susp/" + fileNameSus), StandardCharsets.UTF_8);

        List<Feature> listeVonFeatures = loadFeatures(datei);
        for (Feature feature : listeVonFeatures) {

            int offsetSrc = 941;
            int lengthSrc = 375;
            String subtextSrc = textSrc.substring(offsetSrc, lengthSrc + offsetSrc);

            int offsetSus = 8808;
            int lengthSus = 394;
            String subtextSus = textSus.substring(offsetSus, lengthSus + offsetSus);

            // >> subtext to sherlock
        }


        XPathExpression expr = xPath.compile("//feature");
        NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);

        for (int i = 0; i < nodes.getLength(); i++) {
            Element node = (Element) nodes.item(i);

            String source_reference = node.getAttribute("source_reference");
            String source_offset = node.getAttribute("source_offset");
            String source_length = node.getAttribute("source_length");
            //
            //
            //
            //

            Foobar foobar = new Foobar(source_reference, source_offset, source_length, ...);
            // >> return foobar

            // igrendwo anders wo du dein foobar hast
            String source_length1 = foobar.getSource_length();
            String source_reference1 = foobar.getSource_reference();


            xmlData.append(xPath.compile("/document/@reference").evaluate(document) + ";" + xPath.compile("/document/feature/@source_reference").evaluate(document)
                    + ";" + nodes.item(i).getNodeValue() + ";");
        }
        //System.out.println("");

        Iterator<File> panIterator2 = FileUtils.iterateFiles(PANobfuscationDir, null, false);
        String PANobfus = "";
        List<Foobar> meineNoObfuscationFoobars = new ArrayList<>();
        while (panIterator2.hasNext()){
            File panFile2 = panIterator2.next();
            Foobar foobar = readXMLFile(panFile2) + "\n";
            foobar.setSourceFile(panFile2.getAbsolutePath());
            meineNoObfuscationFoobars.add(foobar);
        }

        for(Foobar foobar : meineNoObfuscationFoobars) {
            String sourceDatei = FileUtils.readFileToString(new File(foobar.getAbsolutePathSource()), StandardCharsets.UTF_8);
        }


        // mit der liste meineNoObfuscationFoobars arbeiten

        System.out.println("finish");

    }
}
