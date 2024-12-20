package ru.mudan.testtodo.feign;

import com.google.common.io.CharStreams;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

@Component
public class FeignExceptionHandler implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        // Обрабатываем только ошибки сервера (5xx)
        if (response.status() >= 500) {
            return new ResponseStatusException(HttpStatus.valueOf(response.status()), readMessage(response));
        }
        return null;
    }
    private String readMessage(Response response){
        String message = null;
        Reader reader = null;
        try{
            reader = response.body().asReader(Charset.defaultCharset());
            message = CharStreams.toString(reader);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(reader!=null){
                    reader.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return message;
    }
}
