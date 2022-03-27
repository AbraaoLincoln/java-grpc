package com.test;


import com.test.server.GreetingServiceGrpc;
import com.test.server.HelloRequest;
import com.test.server.HelloResponse;
import com.test.server.Status;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        System.out.println("creating channel...");
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        System.out.println("creating stub...");
        GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);

        System.out.println("calling rpc...");
        HelloResponse response = stub.greeting(HelloRequest.newBuilder()
                .setFirstname("Hello")
                .setLastname("World")
                .setAge("2022")
                .setStatus(Status.ONLINE)
                .build());

        System.out.println(response);
    }
}
