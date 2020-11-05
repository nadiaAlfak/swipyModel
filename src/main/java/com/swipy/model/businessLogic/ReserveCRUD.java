package com.swipy.model.businessLogic;

import com.swipy.model.dto.ReserveDto;
import com.swipy.model.entity.Reserve;
import com.swipy.model.mapper.ReserveDtoToReserveMapper;
import com.swipy.model.repository.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ReserveCRUD {
    @Autowired
    public void setReserveRepository(ReserveRepository reserveRepository) {
        this.reserveRepository = reserveRepository;
    }

    ReserveRepository reserveRepository;
    public boolean save(ReserveDto reserveDto){
        Reserve reserve= ReserveDtoToReserveMapper.INSTANCE.reserve(reserveDto);
    }

}
