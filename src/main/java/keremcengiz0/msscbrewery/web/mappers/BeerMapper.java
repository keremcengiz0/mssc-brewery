package keremcengiz0.msscbrewery.web.mappers;

import keremcengiz0.msscbrewery.domain.Beer;
import keremcengiz0.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
