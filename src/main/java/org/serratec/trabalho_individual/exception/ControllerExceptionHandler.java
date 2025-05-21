package org.serratec.trabalho_individual.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            /* Eu utilizo o VSCode para fazer meus codigos, por algum motivo, ele cobra a utilização 
            do @NonNull para esse comando funcionar, de resto, ele funciona da mesma forma */
            @NonNull MethodArgumentNotValidException ex,
            @NonNull HttpHeaders headers,
            @NonNull HttpStatusCode status,
            @NonNull WebRequest request) {

        ErroResposta erroResposta = new ErroResposta(
                status.value(),
                "Existem Campos Inválidos, Confira o preenchimento",
                LocalDateTime.now(),
                ex.getBindingResult().getFieldErrors().stream()
                        .map(erro -> erro.getField() + ": " + erro.getDefaultMessage())
                        .toList());
        return super.handleExceptionInternal(ex, erroResposta, headers, status, request);
    }
}