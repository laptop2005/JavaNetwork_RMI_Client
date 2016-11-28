package com.test.rmi.client;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.util.ArrayList;

import com.test.rmi.RemoteInterface;

public class RemoteClient{

	public static void main(String[] args) {
		try{
			System.setSecurityManager(new RMISecurityManager());
			RemoteInterface remote = (RemoteInterface) Naming.lookup("rmi://localhost/remote");
			
			int i = remote.doRemotePrint("리모트 테스트");
			ArrayList<String> list = (ArrayList<String>) remote.getRemoteList();
			for(String item:list){
				System.out.println(item);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
