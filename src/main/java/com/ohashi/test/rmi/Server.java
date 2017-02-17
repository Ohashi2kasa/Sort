package com.ohashi.test.rmi;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 * Created by ohashi on 2017/02/01.
 */
public class Server implements Hello {
    public Server() throws RemoteException{}

    public String sayHello( ) {
        return "Hello, world!";
    }

    public static void main(String args[]) {

        try {
            // Bind the remote object's stub in the registry
            //Registry registry = LocateRegistry.getRegistry();extends UnicastRemoteObject
            Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Hello obj = new Server();
            //Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);
            //LocateRegistry.getRegistry().bind("Hello", stub);
            registry.bind("Hello", obj);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception:" + e.toString());
            e.printStackTrace( );
        }
    }
}
