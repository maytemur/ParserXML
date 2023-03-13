import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class StringToXmlFile {
    public static void main(String[]args) {
        try{
            String s="<test><message>heeeellloo</message></test>";
            
            TransformerFactory factory=TransformerFactory.newInstance();
            Transformer transformer=factory.newTransformer();
            
            StringReader reader=new StringReader(s);
            StreamSource source=new StreamSource(reader);
            
            String cikis="C:\\NetbeansProjects\\ParserXML\\StringToFile.xml";
            StreamResult sonuc=new StreamResult(cikis);
            
            transformer.transform(source, sonuc);
            System.out.println("XML dosyaya yazildi");
            }catch(Exception ex){
            ex.printStackTrace();
            }
          }
    }