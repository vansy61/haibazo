package org.example.testhaibazo.controller;

import org.example.testhaibazo.mapper.StyleMapper;
import org.example.testhaibazo.model.Style;
import org.example.testhaibazo.model.dto.StyleDTO;
import org.example.testhaibazo.service.IStyleService;
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
@RequestMapping("/api/styles")
public class StyleController {
    @Autowired
    private IStyleService styleService;

    @GetMapping
    public ResponseEntity<Page<StyleDTO>> getStyles(Pageable pageable) {
        Page<Style> styles = styleService.getStyles(pageable);
        Page<StyleDTO> stylesDto = styles.map(StyleMapper.INSTANCE::styleToStyleDTO);
        return ResponseEntity.ok(stylesDto);
    }
}
