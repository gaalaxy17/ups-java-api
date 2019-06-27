package com.gaalaxy.api.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.MessageDigest;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public List<UserEntity> getAll(){
        return userRepository.findAll();
    }

    public UserEntity authLogin(String dsUser, String dsPass){

        MessageDigest md = null;

        try{
            md = MessageDigest.getInstance("MD5");
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }

        md.update(dsPass.getBytes(),0,dsPass.length());

        String hash = new BigInteger(1,md.digest()).toString(16);

        try {
            UserEntity userData = userRepository.getUserEntityByDsUserAndDsPass(dsUser,hash);
            return userData;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }


    }

    public String createUser(UserEntity user){

        MessageDigest md = null;
        String hash = "";

        try{
            md = MessageDigest.getInstance("MD5");
            md.update(user.getDsPass().getBytes(),0,user.getDsPass().length());
            hash = new BigInteger(1,md.digest()).toString(16);
        }

        catch(Exception e){
            return "Ocorreu um erro inesperado, favor contatar o suporte!";
        }

        try{
            user.setFgIsAtivo(1);
            user.setDsPass(hash);
            userRepository.save(user);
            return "Usuário cadastrado com sucesso!";
        }
        catch(Exception e){
            return "Erro ao cadstrar usuário";
        }
    }


}
