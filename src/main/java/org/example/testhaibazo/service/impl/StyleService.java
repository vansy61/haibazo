package org.example.testhaibazo.service.impl;

import org.example.testhaibazo.model.Style;
import org.example.testhaibazo.repository.StyleRepository;
import org.example.testhaibazo.service.IStyleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StyleService implements IStyleService {
    @Autowired
    private StyleRepository styleRepository;

    @Override
    public Page<Style> getStyles(Pageable pageable) {
        return styleRepository.findAll(pageable);
    }
}
