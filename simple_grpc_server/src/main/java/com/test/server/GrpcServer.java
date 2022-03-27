package com.test.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Build server");
        Server server = ServerBuilder.forPort(8080)
                .addService(new GreetingServiceImpl())
                .build();

        System.out.println("Starting grpc server");
        server.start();
        server.awaitTermination();
    }
}
