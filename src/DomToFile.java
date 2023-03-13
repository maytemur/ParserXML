import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;
public class DomToFile {
    
    /** Creates a new instance of DomToFile */
    public static void main(String[]args) {
        try{
        DocumentBuilderFactory uretici=DocumentBuilderFactory.newInstance();
        DocumentBuilder yapici=uretici.newDocumentBuilder();
        Document dokuman=yapici.newDocument();
        
        Element root=dokuman.createElement("root");
        root.setAttribute("attr","value");
        Element test=dokuman.createElement("test");
        Text text=dokuman.createTextNode("deneme xml");
        
        test.appendChild(text);
        root.appendChild(test);
        dokuman.appendChild(root);
        
        TransformerFactory transformFactory=TransformerFactory.newInstance();
        Transformer transformer=transformFactory.newTransformer();
        
        DOMSource source=new DOMSource(dokuman);
        String cikis="C:\\NetbeansProjects\\ParserXML\\DOMTOFile.xml";
        StreamResult sonuc=new StreamResult(cikis);
        
        transformer.transform(source,sonuc);
        System.out.println("Dokuman dosyaya yazildi");
        
        
        }catch(Exception e){
        e.printStackTrace();
        }
    }
}
