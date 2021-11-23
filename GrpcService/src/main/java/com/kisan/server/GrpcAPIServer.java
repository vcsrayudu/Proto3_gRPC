package com.kisan.server;


import com.kisan.service.GrpcServiceImpl;
import com.kisan.service.GrpcStreamServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcAPIServer {
    public static void main(String str[]) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9000)
                .addService(new GrpcServiceImpl())
                .addService(new GrpcStreamServiceImpl())
        .build();

        server.start();
        System.out.println("Server started");
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("Server shutdown requested");
            server.shutdown();
            System.out.println("Server shutdown successfully");
        }));
        server.awaitTermination();
    }
}
