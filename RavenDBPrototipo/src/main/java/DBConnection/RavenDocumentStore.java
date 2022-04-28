package DBConnection;

import com.basesdatos2.ravendbprototipo.Vehiculo;
import net.ravendb.client.documents.DocumentStore;
import net.ravendb.client.documents.IDocumentStore;
import net.ravendb.client.documents.conventions.DocumentConventions;
import net.ravendb.client.documents.session.IDocumentSession;

public class RavenDocumentStore {
    
    public static class DocumentStoreHolder {

    private static IDocumentStore store;

    static {
        store = new DocumentStore(new String[]{ "http://127.0.0.1:8080" }, "Prototipo");
        
        store.initialize(); 
        
        System.out.println("Conectado exitosamente a RavenDB");
    }
    
    
    public static IDocumentStore getStore() {
        return store;
    }
    
    }    

    
    
}
