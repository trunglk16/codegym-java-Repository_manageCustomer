package com.codegym.cms.service;

import com.codegym.cms.model.Province;

public interface ProvinceService {

    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province customer);

    void remove(Long id);

}
