package DBConnection;

import net.ravendb.client.documents.DocumentStore;
import net.ravendb.client.documents.IDocumentStore;
import net.ravendb.client.documents.conventions.DocumentConventions;

public class DocumentStoreHolder {
    
    private static class DocumentStoreContainer{
    
    public static final IDocumentStore store = new DocumentStore("http://127.0.0.1:8080" ,  "Prototipo"); 
        DocumentConventions conventions = store.getConventions(); 
        static{
            store.initialize();                                   
        }
        
    }
    
    public static IDocumentStore getStore(){
        return DocumentStoreContainer.store;
    }
    
    
    
  
    
}
