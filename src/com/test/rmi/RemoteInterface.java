package com.test.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface RemoteInterface extends Remote {

	public int doRemotePrint(String text) throws RemoteException;
	
	public List<String> getRemoteList() throws RemoteException;
}
