package com.nexus.retail.service;

import com.nexus.retail.model.User;
import com.nexus.retail.payload.AddressDTO;

import java.util.List;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO, User user);

    List<AddressDTO> getAddresses();
}
