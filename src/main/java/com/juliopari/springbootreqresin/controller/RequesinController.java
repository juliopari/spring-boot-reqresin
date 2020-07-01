package com.juliopari.springbootreqresin.controller;

import com.juliopari.springbootreqresin.dto.CreateUserRequest;
import com.juliopari.springbootreqresin.dto.CreateUserResponse;
import com.juliopari.springbootreqresin.dto.SingleUserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/*
https://www.javaguides.net/2019/02/spring-resttemplate-spring-rest-client-get-post-put-delete-example.html
https://howtodoinjava.com/spring-boot2/resttemplate/spring-restful-client-resttemplate-example/
https://reqres.in/
 */
@RestController
@RequestMapping("/requesin")
public class RequesinController {

    @GetMapping("/api/users/{id}")
    public SingleUserResponse getSingleUser(@PathVariable Integer id) {
        RestTemplate plantilla = new RestTemplate();
        SingleUserResponse resultado = plantilla.getForObject("https://reqres.in/api/users/" + id, SingleUserResponse.class);
        return resultado;
    }

    @PostMapping("/api/users")
    public CreateUserResponse postCreateUser(@RequestBody CreateUserRequest rq) {

        CreateUserRequest rqBackend = new CreateUserRequest();
        rqBackend.setJob(rq.getJob());
        rqBackend.setName(rq.getName());

        RestTemplate plantilla = new RestTemplate();
        CreateUserResponse resultado = plantilla.postForObject("https://reqres.in/api/users", rqBackend, CreateUserResponse.class);

        return resultado;
    }

}
