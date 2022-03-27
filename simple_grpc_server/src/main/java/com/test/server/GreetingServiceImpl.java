package com.test.server;

import com.test.server.GreetingServiceGrpc.GreetingServiceImplBase;
import io.grpc.stub.StreamObserver;
import com.test.server.HelloRequest;
import com.test.server.HelloResponse;

public class GreetingServiceImpl extends GreetingServiceImplBase {

    @Override
    public void greeting(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        System.out.println(request);
        responseObserver.onNext(HelloResponse.newBuilder().setGreeting("eae").build());
        responseObserver.onCompleted();
    }
}
