package keremcengiz0.msscbrewery.services;

import keremcengiz0.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
