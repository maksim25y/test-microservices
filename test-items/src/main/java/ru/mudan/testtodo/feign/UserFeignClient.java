package ru.mudan.testtodo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.mudan.testentity.entity.User;
@FeignClient(name = "test-users",fallback = UserFeignClientFallBack.class)
@Component
public interface UserFeignClient {
    @GetMapping("/users/{id}")
    ResponseEntity<User>findByUserId(@PathVariable("id") Long id);
}
@Component
class UserFeignClientFallBack implements UserFeignClient{
    @Override
    public ResponseEntity<User> findByUserId(Long id) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new User(id, "Сервис недоступен"));
    }
}
