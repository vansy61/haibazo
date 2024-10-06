package org.example.testhaibazo.service.impl;

import org.example.testhaibazo.model.Color;
import org.example.testhaibazo.repository.ColorRepository;
import org.example.testhaibazo.service.IColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ColorService implements IColorService {
    @Autowired
    private ColorRepository colorRepository;


    @Override
    public Page<Color> getColors(Pageable pageable) {
        return colorRepository.findAll(pageable);
    }
}
