package gov.nysenate.openleg.lucene;

import java.util.Collection;
import org.apache.lucene.document.Field;

public interface LuceneObject {
	String lucene_oid();
	String lucene_osearch();
	String lucene_otype();
	
	java.lang.reflect.Field[] lucene_fields();
	
	Collection<Field> getLuceneFields();
}