package xmlandjson;


import net.sf.json.JSONObject;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author bce1100
 * @date 2018/8/8.
 */
public class Convert {
    public static void main(String[] args) {
        xmlToJson("test.xml");

    }

    /**
     * 我TM转爆
     * @param fileName
     */
    private static void xmlToJson(String fileName) {
        SAXReader reader = new SAXReader();
        File file = new File(fileName);
        Document document;
        try {
            document = reader.read(file);
            Element root = document.getRootElement();
            JSONObject json = new JSONObject();
            json.put(root.getName(),iterateElement(root));
            System.out.println(json.toString());
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }


    private static Map iterateElement(Element element) {
        List eList = element.elements();
        Element child;
        Map<String,List> jMap = new HashMap<>(16);
        List list;
        for (int i = 0; i < eList.size(); i++) {
            list = new LinkedList();
            child = (Element) eList.get(i);
            if ("".equals(child.getTextTrim())) {
                if (child.elements()==null||child.elements().size()==0) {
                    continue;
                }
                if (jMap.containsKey(child.getName())) {
                    list = jMap.get(child.getName());
                }
                list.add(iterateElement(child));
                jMap.put(child.getName(), list);
            } else {
                if (jMap.containsKey(child.getName())) {
                    list = jMap.get(child.getName());
                }
                list.add(child.getTextTrim());
                jMap.put(child.getName(), list);
            }
        }
        return jMap;
    }

}
