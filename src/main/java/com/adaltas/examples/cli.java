package com.adaltas.examples;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import sun.awt.X11.XSystemTrayPeer;

import com.adaltas.examples.Messages;

import java.io.IOException;


@Command(name = "cli", version = "0.1", mixinStandardHelpOptions = true)
public class cli implements Runnable {
    @Option(names = "-s", required = true, description = "Sender")
    String sender;

    @Option(names = "-r", arity = "1..*", required = true, description = "Receiver")
    String[] receivers;

    @Option(names = "-m", required = true, description = "Message")
    String message;

    public static void main(String[] args) {
        CommandLine.run(new cli(), args);
    }

    @Override
    public void run() {
        System.out.println("Sending message");

        

    }
}
