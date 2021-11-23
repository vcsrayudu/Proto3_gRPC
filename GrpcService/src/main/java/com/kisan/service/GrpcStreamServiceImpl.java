package com.kisan.service;

import com.kisan.proto.GrpcStreamServiceGrpc;
import com.kisan.proto.LoginRequest;
import com.kisan.proto.LoginResponse;
import io.grpc.stub.StreamObserver;

public class GrpcStreamServiceImpl extends GrpcStreamServiceGrpc.GrpcStreamServiceImplBase {
    @Override
    public void getLogin(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
       try {
           for (int i = 0; i < 10; i++) {
               LoginResponse response = LoginResponse.newBuilder().setStatus("Password").build();
               responseObserver.onNext(response);
               Thread.sleep(100);
           }
       }
       catch (Exception e){}
        responseObserver.onCompleted();


        //super.getLogin(request, responseObserver);
    }
}
