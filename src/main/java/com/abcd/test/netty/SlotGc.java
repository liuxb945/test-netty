package com.abcd.test.netty;

import java.io.IOException;

public class SlotGc{  
    public static void main(String[] args) throws IOException{  
        byte[] holder = new byte[32*1024*1024];  
        System.gc();  
        System.in.read();
    }  
}
