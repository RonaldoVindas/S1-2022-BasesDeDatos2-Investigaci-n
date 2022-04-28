package DBConnection;

import com.basesdatos2.ravendbprototipo.Agencia;
import com.basesdatos2.ravendbprototipo.Vehiculo;
import java.util.Arrays;
import java.util.List;
import net.ravendb.client.documents.IDocumentStore;
import net.ravendb.client.documents.operations.DeleteByQueryOperation;
import net.ravendb.client.documents.queries.IndexQuery;
import net.ravendb.client.documents.session.IDocumentSession;


public class RavenDBDataAccessObject {
    
    
    public static void InsertVehicle(String numChasis, String brand, String model, String year, String price, String color, String vehicleType, String condition ){
        IDocumentStore conexion = RavenDocumentStore.DocumentStoreHolder.getStore();
        try (IDocumentSession session = conexion.openSession()) {
            conexion.openSession();
            Vehiculo vehiculo = new Vehiculo(numChasis,brand,model,year,price,color,vehicleType,condition );
            
            session.store(vehiculo);  
            session.saveChanges(); 
            session.close();
            
            System.out.println("Vehiculo agregado existosamente");
        }
    }
    
    
    
    public static void DeleteVehicle(String pId){
        IDocumentStore conexion = RavenDocumentStore.DocumentStoreHolder.getStore();
            //session.delete("personas/1-A");

            conexion.operations().send(new DeleteByQueryOperation(new IndexQuery("from Vehiculos where numChasis = '" +  pId + "'")));
           
            System.out.println("Vehiculo eliminado existosamente"); 
              
        
    }
    
    
     public static void UpdateVehicle(String pId, String pNumChasis, String pBrand, String pModel, String pYear, String pPrice, String pColor, String pVehicleType){
        IDocumentStore conexion = RavenDocumentStore.DocumentStoreHolder.getStore();
        try (IDocumentSession session = conexion.openSession()) {
            conexion.openSession();
            
            Vehiculo vehiculo = session.load(Vehiculo.class, pId);
            vehiculo.setBrand(pBrand);
            vehiculo.setModel(pModel);
            vehiculo.setYear(pYear);
            vehiculo.setPrice(pPrice);
            vehiculo.setColor(pColor);
            vehiculo.setVehicleType(pVehicleType);

            
            session.saveChanges();
            //System.out.println(results.get(0).toString());           
            session.close();
            
            System.out.println("Vehiculo actualizado existosamente");
        }
    }     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    public static void InsertAgency(String legal_Id, String name, String phone, String email){
        IDocumentStore conexion = RavenDocumentStore.DocumentStoreHolder.getStore();
        try (IDocumentSession session = conexion.openSession()) {
            conexion.openSession();
            Agencia agencia = new Agencia(legal_Id,name,phone,email);
            
            session.store(agencia);  
            session.saveChanges(); 
            session.close();
            
            System.out.println("Agencia agregado existosamente");
        }
    }
    
    

        public static void DeleteAgency(String pId){
        IDocumentStore conexion = RavenDocumentStore.DocumentStoreHolder.getStore();
        try (IDocumentSession session = conexion.openSession()) {
            conexion.openSession();
            
            //session.delete("personas/1-A");
            session.delete(pId);
            session.saveChanges();
            
             session.close();
            System.out.println("Agencia eliminado existosamente");
    
        }
    }   
    
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
  public static List<Vehiculo> getVehicle(){
       IDocumentStore conexion = RavenDocumentStore.DocumentStoreHolder.getStore();
        try (IDocumentSession session = conexion.openSession()) {
             List<Vehiculo> results = session
             .query(Vehiculo.class)
             .toList();
          
             
             
             
          System.out.println("Consulta exitosa.");  
          return results;
        }
       }
        
        
    public static List<Vehiculo> getNewVehicles(){
       IDocumentStore conexion = RavenDocumentStore.DocumentStoreHolder.getStore();
        try (IDocumentSession session = conexion.openSession()) {
             List<Vehiculo> results = session.query(Vehiculo.class).whereIn("condition", Arrays.asList("Nuevo")).toList();

          System.out.println("Consulta exitosa.");  
          return results;
        }
       }     
        
       public static List<Vehiculo> getUsedVehicles(){
       IDocumentStore conexion = RavenDocumentStore.DocumentStoreHolder.getStore();
        try (IDocumentSession session = conexion.openSession()) {
             List<Vehiculo> results = session.query(Vehiculo.class).whereIn("condition", Arrays.asList("Usado")).toList();

          System.out.println("Consulta exitosa.");  
          return results;
        }
       }      
       
       public static List<Vehiculo> getPriceSortedVehicles(){
       IDocumentStore conexion = RavenDocumentStore.DocumentStoreHolder.getStore();
        try (IDocumentSession session = conexion.openSession()) {
             List<Vehiculo> results = session.query(Vehiculo.class).orderBy("price").toList();

          System.out.println("Consulta exitosa.");  
          return results;
        }
       } 
        
        
        
        
        
        
        
        
        
        
        
        
   
    

}
