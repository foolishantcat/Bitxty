//package com.filedata;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.util.List;
//
//import org.xmlpull.v1.XmlPullParser;
//import android.util.Xml;
//import com.RSS.RssItem;
//
//public class PullXMLReader {
//
//	public static List<RssItem> readRssXML(String path) {
//		File file = new File(path);
//		FileInputStream inStream = new FileInputStream(file);
//		XmlPullParser parser = Xml.newPullParser();
//		try {
//			parser.setInput(inStream, "UTF-8");
//			int eventType = parser.getEventType();
//			RssItem currentPerson = null;
//			List<RssItem> persons = null;
////			while (eventType != XmlPullParser.END_DOCUMENT) {
////				switch (eventType) {
////				case XmlPullParser.START_DOCUMENT:// �ĵ���ʼ�¼�,���Խ������ݳ�ʼ������
////					persons = new List<RssItem>();
////					break;
////				case XmlPullParser.START_TAG:// ��ʼԪ���¼�
////					String name = parser.getName();
////					if (name.equalsIgnoreCase("person")) {
////						currentPerson = new RssItem();
////						currentPerson.setId(new Integer(parser
////								.getAttributeValue(null, "id")));
////					} else if (currentPerson != null) {
////						if (name.equalsIgnoreCase("name")) {
////							currentPerson.setName(parser.nextText());// ���������TextԪ��,����������ֵ
////						} else if (name.equalsIgnoreCase("age")) {
////							currentPerson.setAge(new Short(parser.nextText()));
////						}
////					}
////					break;
////				case XmlPullParser.END_TAG:// ����Ԫ���¼�
////					if (parser.getName().equalsIgnoreCase("person")
////							&& currentPerson != null) {
////						persons.add(currentPerson);
////						currentPerson = null;
////					}
////					break;
////				}
////				eventType = parser.next();
////			}
//			inStream.close();
//			return persons;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//	public void readRssxml(String path)
//	{
//		File file = new File(path);
//		FileInputStream inStream = new FileInputStream(file);
//		XmlPullParser parser = Xml.newPullParser();
//		try {
//			parser.setInput(inStream, "UTF-8");
//			int eventType = parser.getEventType();
//			RssItem currentPerson = null;
//			List<RssItem> persons = null;
//			while (eventType != XmlPullParser.END_DOCUMENT) {
//				switch (eventType) {
//				case XmlPullParser.START_DOCUMENT:// �ĵ���ʼ�¼�,���Խ������ݳ�ʼ������
//					persons = new List<RssItem>();
//					break;
//				case XmlPullParser.START_TAG:// ��ʼԪ���¼�
//					String name = parser.getName();
//					if (name.equalsIgnoreCase("person")) {
//						currentPerson = new RssItem();
//						currentPerson.setId(new Integer(parser
//								.getAttributeValue(null, "id")));
//					} else if (currentPerson != null) {
//						if (name.equalsIgnoreCase("name")) {
//							currentPerson.setName(parser.nextText());// ���������TextԪ��,����������ֵ
//						} else if (name.equalsIgnoreCase("age")) {
//							currentPerson.setAge(new Short(parser.nextText()));
//						}
//					}
//					break;
//				case XmlPullParser.END_TAG:// ����Ԫ���¼�
//					if (parser.getName().equalsIgnoreCase("person")
//							&& currentPerson != null) {
//						persons.add(currentPerson);
//						currentPerson = null;
//					}
//					break;
//				}
//				eventType = parser.next();
//			}
//			inStream.close();
//			return persons;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//		
//	}
//
//}