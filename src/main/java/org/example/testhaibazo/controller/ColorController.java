package org.example.testhaibazo.controller;

import org.example.testhaibazo.mapper.ColorMapper;
import org.example.testhaibazo.model.Color;
import org.example.testhaibazo.model.dto.ColorDTO;
import org.example.testhaibazo.service.IColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/colors")
public class ColorController {
    @Autowired
    private IColorService colorService;

    @GetMapping
    public ResponseEntity<Page<ColorDTO>> getColors(Pageable pageable) {
        Page<Color> colors = colorService.getColors(pageable);
        Page<ColorDTO> colorsDto = colors.map(ColorMapper.INSTANCE::colorToColorDTO);
        return ResponseEntity.ok(colorsDto);
    }

}
