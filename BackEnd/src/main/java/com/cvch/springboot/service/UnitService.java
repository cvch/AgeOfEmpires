package com.cvch.springboot.service;

import com.cvch.springboot.service.dto.Civilization;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class UnitService {

    private final Logger log = LoggerFactory.getLogger(CivilizationService.class);

    @Autowired
    private RestTemplate restTemplate;

    public List<Civilization> getAllUnits() {
        String url = "https://age-of-empires-2-api.herokuapp.com/api/v1/units";
        ResponseEntity<String> civilizations = restTemplate.getForEntity(url, String.class);
        JSONObject jsonObject = new JSONObject(civilizations.getBody().toString());

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        log.debug(civilizations.toString());
        try {
            Map<?, ?> map = mapper.readValue(jsonObject.toString(), Map.class);
            List<Civilization> civilizationList = (List<Civilization>) map.get("civilizations");
            return civilizationList;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Civilization getCivilizationById(String id) {
        String url = "https://age-of-empires-2-api.herokuapp.com/api/v1/civilization/" + id;
        ResponseEntity<String> civilizations = restTemplate.getForEntity(url, String.class);
        JSONObject jsonObject = new JSONObject(civilizations.getBody().toString());
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        try {
            Civilization civilization = mapper.readValue(jsonObject.toString(), Civilization.class);
            return civilization;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
