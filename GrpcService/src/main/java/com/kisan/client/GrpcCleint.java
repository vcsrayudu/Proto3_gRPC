package com.kisan.client;

import com.kisan.proto.GrpcServiceGrpc;
import com.kisan.proto.LoginRequest;
import com.kisan.proto.LoginResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcCleint {
    public static void main(String str[])
    {
        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",9000)
                .usePlaintext()
                .build();
        System.out.println("Client is created");
        GrpcServiceGrpc.GrpcServiceBlockingStub syncClient=GrpcServiceGrpc.newBlockingStub(channel);
        LoginRequest request=LoginRequest.newBuilder().setPassword("subbu").setUserName("subbu").build();
        LoginResponse response=syncClient.getLogin(request);
        System.out.println("Response: "+response.getStatus());
        System.out.println("Channel shutdown requested");
        channel.shutdown();
        System.out.println("Channel shutdown");
    }
}
