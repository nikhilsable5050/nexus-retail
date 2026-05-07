package com.nexus.retail.service;

import com.nexus.retail.model.User;
import com.nexus.retail.payload.AddressDTO;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO, User user);
}
