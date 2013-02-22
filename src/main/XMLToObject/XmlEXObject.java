package main.XMLToObject;


/**
 * Xml to object  / object to xml 
 * 
 * 2013/2/21
 * @author Zijun Chen
 */



import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class XmlEXObject {

 
 public static String object2XML(Object obj, String FileName)throws FileNotFoundException {

  File outPutFile = new File(FileName);
  BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outPutFile));
  XMLEncoder xmlEncoder = new XMLEncoder(bos);
  xmlEncoder.writeObject(obj);
  xmlEncoder.close();
  
  return outPutFile.getAbsolutePath();
 }

 
 public static Object xml2object(String FileName)throws FileNotFoundException {

  BufferedInputStream bis = new BufferedInputStream(new FileInputStream(FileName));
  XMLDecoder xmlDecoder = new XMLDecoder(bis); 
  Object obj = xmlDecoder.readObject();
  xmlDecoder.close();
  
  return obj;
 }
}