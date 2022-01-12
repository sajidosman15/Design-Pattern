
package singletonpattern;

public class SingletonPattern {

    public static void main(String[] args) {
        Person sajid=new Person("Sajid",21);
        Person asif=new Person("Asif",24);
        
        Database database;
        database=Database.getInstance();
        
        database.insertIntoDatabase(asif);
        database.insertIntoDatabase(sajid);
    }
    
}
