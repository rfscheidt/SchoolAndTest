package br.com.animati;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.dcm4che2.data.DicomElement;
import org.dcm4che2.data.DicomObject;
import org.dcm4che2.io.DicomInputStream;

/**
 * Created by foka
 *
 */
public class App  {

	public static void main( String[] args ) {
		DicomInputStream din = null;
		DicomObject working = null;
		try {
			din = new DicomInputStream(new File("/Users/foka/Downloads/16431408040621202010191721.wl"));
			working = din.readDicomObject();
			Iterator<DicomElement> iter = working.iterator();
			while (iter.hasNext()) {
				DicomElement element = iter.next();
				System.out.println(element.toString());
			}
		} catch (IOException e) {
			System.out.println(e.getClass().getName() + " " + e.getMessage());
		}
	}
}
