package com.bootcamp.passiveProduct.web.mapper;

import com.bootcamp.passiveProduct.domain.Account;
import com.bootcamp.passiveProduct.domain.DebitCard;
import com.bootcamp.passiveProduct.web.contracts.DebitCardResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-07T08:59:52-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class DebitCardMapperImpl implements DebitCardMapper {

    @Override
    public DebitCardResponse entityToResponse(DebitCard source) {
        if ( source == null ) {
            return null;
        }

        DebitCardResponse debitCardResponse = new DebitCardResponse();

        debitCardResponse.setCardNumber( source.getCardNumber() );
        debitCardResponse.setCustomerInternalCode( source.getCustomerInternalCode() );
        debitCardResponse.setExpiryDate( source.getExpiryDate() );
        debitCardResponse.setCvv( source.getCvv() );
        debitCardResponse.setCardType( source.getCardType() );
        debitCardResponse.setStatus( source.getStatus() );
        List<Account> list = source.getAccounts();
        if ( list != null ) {
            debitCardResponse.setAccounts( new ArrayList<Account>( list ) );
        }

        return debitCardResponse;
    }

    @Override
    public void update(DebitCard entity, DebitCard updateEntity) {
        if ( updateEntity == null ) {
            return;
        }

        entity.setCardNumber( updateEntity.getCardNumber() );
        entity.setCustomerInternalCode( updateEntity.getCustomerInternalCode() );
        entity.setExpiryDate( updateEntity.getExpiryDate() );
        entity.setCvv( updateEntity.getCvv() );
        entity.setCardType( updateEntity.getCardType() );
        entity.setStatus( updateEntity.getStatus() );
        if ( entity.getAccounts() != null ) {
            List<Account> list = updateEntity.getAccounts();
            if ( list != null ) {
                entity.getAccounts().clear();
                entity.getAccounts().addAll( list );
            }
            else {
                entity.setAccounts( null );
            }
        }
        else {
            List<Account> list = updateEntity.getAccounts();
            if ( list != null ) {
                entity.setAccounts( new ArrayList<Account>( list ) );
            }
        }
    }
}
