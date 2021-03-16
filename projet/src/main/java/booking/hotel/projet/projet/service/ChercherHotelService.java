package booking.hotel.projet.projet.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ChercherHotelService {
    public Page<HotelsByChambreavailableDTO> chercherHotelsavailable(SearchRequestDTO searchRequest, Pageable pageable) throws SearchHotelException; 
    
}
