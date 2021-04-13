 package com.adaltas.examples;
 import java.io.IOException;
 import org.apache.hadoop.hbase.HBaseConfiguration;
 import org.apache.hadoop.hbase.HColumnDescriptor;
 import org.apache.hadoop.hbase.HTableDescriptor;
 import org.apache.hadoop.hbase.client.HBaseAdmin;
 import org.apache.hadoop.hbase.TableName;
 import org.apache.hadoop.conf.Configuration;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.BasicConfigurator;

public class CreateTable {
  public static void main(String[] args) throws IOException {
    BasicConfigurator.configure();
    System.out.println("CreateTable start");

    String tableName = args[0].trim();

    // Instantiating configuration class
    Configuration config = HBaseConfiguration.create();
    System.out.println("Conf created");

    // Instantiating HbaseAdmin class
    HBaseAdmin admin = new HBaseAdmin(config);
    System.out.println("Admin created");

    // Instantiating table descriptor class
    HTableDescriptor tableDescriptor = new HTableDescriptor(TableName.valueOf(tableName));
    System.out.println("Descriptor created");


    // Adding column families to table descriptor
    tableDescriptor.addFamily(new HColumnDescriptor("cf"));
    System.out.println("CF added to descriptor");


     // Execute the table through admin
     admin.createTable(tableDescriptor);
     System.out.println("Table created ");

   }
}

