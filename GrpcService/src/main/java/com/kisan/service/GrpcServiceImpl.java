package com.kisan.service;

import com.kisan.proto.GrpcServiceGrpc;
import com.kisan.proto.LoginRequest;
import com.kisan.proto.LoginResponse;
import io.grpc.stub.StreamObserver;

public class GrpcServiceImpl extends GrpcServiceGrpc.GrpcServiceImplBase {
    @Override
    public void getLogin(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
        String loginUser =request.getUserName();
        String password= request.getPassword();
        LoginResponse loginResponse=LoginResponse.newBuilder().setStatus("Sucess").build();
        responseObserver.onNext(loginResponse);
        responseObserver.onCompleted();
        System.out.println("Request completed");
       // super.getLogin(request, responseObserver);
    }
}
