
package com.basesdatos2.ravendbprototipo;


import DBConnection.*;
import Views.MainMenu;
import java.util.List;
import net.ravendb.client.documents.DocumentStore;
import net.ravendb.client.documents.IDocumentStore;
import net.ravendb.client.documents.session.IDocumentSession;
import org.json.JSONObject;

/**
 *
 * @author rony1
 */
public class RavenDBPrototipo {

    public static void main(String[] args) {
        MainMenu result = new MainMenu();
        result.setVisible(true);
       
        //RavenDBDataAccessObject.InsertVehicle( "1234",  "Toyota",  "Celica GT",  "1995",  "$2000",  "Blanco",  "Deportivo" );
       
        //RavenDBDataAccessObject
        
        
        
        
        /*IDocumentStore conexion = RavenDocumentStore.DocumentStoreHolder.getStore();
        
        
        try (IDocumentSession session = conexion.openSession()) {
        
        
        conexion.openSession();
        
        
        /*
           
        //Consultas
        /*
     List<Persona> results = session
    .query(Persona.class)
    .whereEquals("apellido", "Rojas")
    .toList();
     
     System.out.println(results.get(0).getNombre());
        
        */
        
        /*
        
          List<Persona> results = session
        .query(Persona.class)
        .selectFields(Persona.class, "apellido")
        .whereEquals("nombre", "Ronaldo")
        .toList();
        System.out.println(results.get(0).toString());
*/
        //Actualización 
        /*
        Persona persona = session.load(Persona.class, "Vindas");
        System.out.println(persona);
        persona.setNombre("Ramiro");
        session.saveChanges();
        //System.out.println(results.get(0).toString());
        
        
        //Borrado
        /*
        session.delete("personas/1-A");
        session.saveChanges();
        
    }
}*/
    
}
}
