package ru.mudan.testutils.resttemplate;

import org.springframework.stereotype.Component;
import ru.mudan.testentity.entity.User;
import org.springframework.web.reactive.function.client.WebClient;

@Component
//Синхронный запрос
public class UserWebClientBuilder {
    private static final String baseUrl = "http://localhost:8765/test-users/users";

    public boolean userExists(Long userId){
        try{
            User user = WebClient.create(baseUrl)
                    .get()//тип запроса
                    .uri("/"+userId)//доп часть
                    .retrieve()//вызов
                    .bodyToFlux(User.class)//тип результата
                    .blockFirst();//синхрон

            if(user!=null){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

}
