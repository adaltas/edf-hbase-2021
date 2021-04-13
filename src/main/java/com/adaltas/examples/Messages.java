package com.adaltas.examples;

import java.io.IOException;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.filter.*;


import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.BasicConfigurator;

import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;


public class Messages {
    private HTable table;

    public Messages() throws IOException {
        // Get HTable handler
        Configuration config = HBaseConfiguration.create();
        // table = new HTable(config, "nom_de_la_table");
    }


    public String generateConversationKey(ArrayList<String> members) throws IOException {
        String key = "";
        // Sort members
        

        // Add members to the key
        

        // Prepend hash to better distribute the key
        

        return key;
    }

    public void insertMessage(String sender, String[] receivers, String message) throws IOException {
        // Send all members of conversation for key generation
            // String key = generateConversationKey(...);


        // Add timestamp suffix to the key
        
        // Create Put object to insert data
        

        // Validate insert
            //table.put(...)
    }


    public ResultScanner getConversation(String[] members) throws IOException {
        // Get conversation key
        
        // Create scan query to only get the right messages 
            //...
            // Scan scan = new Scan ...
            // ...
            //ResultScanner scanner = table.getScanner(scan);

        // return scanner;
        return null;
    }
}

