package com.swipy.model.businessLogic;

import com.swipy.model.dto.AddressDto;
import com.swipy.model.entity.Address;
import com.swipy.model.mapper.AddressDtoToAddressMapper;
import com.swipy.model.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressCRUD {

        @Autowired
        public void setUserRepository(AddressRepository addressRepository) {
            this.addressRepository = addressRepository;
        }

        AddressRepository addressRepository;

        public boolean save(AddressDto addressDto){
            Address address= AddressDtoToAddressMapper.INSTANCE.address(addressDto);
            try {
                addressRepository.save(address);
                return true;
            }
            catch (Exception ex){
                return false;
            }

        }



    }


