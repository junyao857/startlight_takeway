package com.sky.service;

import com.sky.entity.AddressBook;

import java.util.List;

/**
 * @author LDQ
 * @date 2024/4/12
 * @description
 */
public interface AddressBookService {

    List<AddressBook> list(AddressBook addressBook);

    void save(AddressBook addressBook);

    AddressBook getById(Long id);

    void update(AddressBook addressBook);

    void setDefault(AddressBook addressBook);

    void deleteById(Long id);

}
