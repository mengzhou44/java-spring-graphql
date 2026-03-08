package com.mengzhou.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;

import java.nio.charset.StandardCharsets;

@Controller
public class GraphqlUiController {

    @GetMapping(value = "/graphql-ui", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> graphqlUi() throws Exception {
        ClassPathResource resource = new ClassPathResource("static/graphql-ui.html");
        String html = StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
        return ResponseEntity.ok(html);
    }
}
