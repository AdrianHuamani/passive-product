package com.bootcamp.passiveProduct.web;

import com.bootcamp.passiveProduct.domain.DebitCard;
import com.bootcamp.passiveProduct.service.DebitCardService;
import com.bootcamp.passiveProduct.web.contracts.DebitCardResponse;
import com.bootcamp.passiveProduct.web.mapper.DebitCardMapper;
import com.bootcamp.passiveProduct.web.routes.ApiRoutes;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import java.net.URI;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(ApiRoutes.uriBaseDebitCard)
@Tag(name = "DEBIT CARD", description = "debit card controller")
public class DebitCardController {

    private final DebitCardService debitCardService;

    private final DebitCardMapper debitCardMapper;

    @GetMapping

    public Maybe<ResponseEntity<Flowable<DebitCardResponse>>> findAll() {
        log.info("Find All Customer Type Controller executed");
        return debitCardService.findAll().share()
                .isEmpty()
                .flatMapMaybe(isEmpty -> {
                    if (isEmpty) {
                        return Maybe.just(ResponseEntity.noContent().build());
                    } else {
                        return Maybe.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
                                .body(debitCardService.findAll().map(debitCardMapper::entityToResponse)));
                    }
                });
    }

    @PostMapping
    public Single<ResponseEntity<DebitCardResponse>> save(@Valid @RequestBody DebitCard debitCardEntity,
                                                             final ServerHttpRequest req) {
        log.info("Save executed : " + debitCardEntity.toString());

        return debitCardService.save(debitCardEntity)
                .map(documentTypeEntity -> ResponseEntity.created(URI.create(req.getURI().toString().concat("/").concat(documentTypeEntity.getId())))
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(debitCardMapper.entityToResponse(documentTypeEntity)));
    }



    @GetMapping("/{customerInternalCode}")
    public Maybe<ResponseEntity<Flowable<DebitCardResponse>>> findByCustomerInternalCode(@PathVariable("customerInternalCode") String customerInternalCode) {
        return debitCardService.findByCustomerInternalCode(customerInternalCode).share()
                .isEmpty()
                .flatMapMaybe(isEmpty -> {
                    if (isEmpty) {
                        return Maybe.just(ResponseEntity.noContent().build());
                    } else {
                        return Maybe.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
                                .body(debitCardService.findByCustomerInternalCode(customerInternalCode).map(debitCardMapper::entityToResponse)));
                    }
                });
    }


}
