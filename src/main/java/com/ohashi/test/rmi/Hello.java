package com.ohashi.test.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by ohashi on 2017/02/01.
 */
public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}
