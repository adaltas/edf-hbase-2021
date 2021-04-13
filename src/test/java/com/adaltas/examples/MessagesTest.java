package com.adaltas.examples;

import java.io.IOException;

import static org.junit.Assert.*;


import com.google.common.annotations.VisibleForTesting;
import org.apache.hadoop.hbase.HBaseCommonTestingUtility;
import org.apache.hadoop.hbase.HBaseTestingUtility;
import org.apache.hadoop.hbase.util.Bytes;

import org.apache.hadoop.hbase.client.*;


import org.junit.Before;
import org.junit.Test;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.BasicConfigurator;

import com.adaltas.examples.Messages;

public class MessagesTest {
    private static HBaseTestingUtility utility;
    

    @Before
    public void setup() throws Exception {
        // Pour éliminer les logs d'informations et warnings:
        // Logger.getRootLogger().setLevel(Level.ERROR);

        utility = new HBaseTestingUtility();
        utility.startMiniCluster();
    }
    

    @Test
    public void testConversation() throws Exception {
       
    }

}
