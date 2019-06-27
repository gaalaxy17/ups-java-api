package com.gaalaxy.api.User;

import java.util.List;

import com.gaalaxy.api.Commons.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
@RequestMapping(path = "user", headers = "Accept=application/json")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(path="getall")
    public List<UserEntity> getAllUsers(){
        return userService.getAll();
    }

    @PostMapping(path="auth")
    public ResponseModel authLogin(@RequestBody UserEntity user){

        ResponseModel responseModel = new ResponseModel();
        String msg = "";
        UserEntity userData;

        try {
            userData = userService.authLogin(user.getDsUser(), user.getDsPass());
            responseModel.setData(userData);
            responseModel.setMessage(msg);
            responseModel.setResponseStatus(200);
            return responseModel;
        }
        catch (Exception e){
            msg = "Erro ao realizar autenticação do usuário!";
            responseModel.setMessage(msg);
            responseModel.setResponseStatus(404);
            return responseModel;
        }

    }

    @PostMapping(path="signup")
    public ResponseModel signUp(@RequestBody UserEntity user){

        ResponseModel responseModel = new ResponseModel();
        String msg = "";

        try{
            msg = userService.createUser(user);
            responseModel.setMessage(msg);
            responseModel.setResponseStatus(200);
            return responseModel;
        }
        catch (Exception e){
            responseModel.setMessage("Ocorreu um erro ao cadastrar o usuário");
            responseModel.setResponseStatus(400);
            return responseModel;
        }

    }


}
