package booking.hotel.projet.projet.Dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import booking.hotel.projet.projet.model.Hotel;



@Repository 

public interface HotelRepository extends PagingAndSortingRepository<Hotel, Long>  {


    @Query("Select h from Hotel h where h.hotelId in(:hotelIds) ")
    Page<Hotel> findAllByHotelId(@Param("hotelIds") List<Long> hotelIds, Pageable pageable);

    
    
}
