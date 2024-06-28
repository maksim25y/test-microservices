package ru.mudan.testtodo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ru.mudan.testentity.entity.User;

@FeignClient(name = "test-users")
public interface UserFeignClient {
    @GetMapping("/users/{id}")
    ResponseEntity<User>findByUserId(@PathVariable("id") Long id);
}
