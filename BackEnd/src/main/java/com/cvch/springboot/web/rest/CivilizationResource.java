package com.cvch.springboot.web.rest;

import com.cvch.springboot.domain.util.Message;
import com.cvch.springboot.service.CivilizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CivilizationResource {

    private final Logger log = LoggerFactory.getLogger(CivilizationResource.class);

    @Autowired
    private CivilizationService civilizationService;

    /**
     * {@code GET  /civilization} : get all the civilizations.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of civilizations in body.
     */
    @GetMapping("/civilizations")
    public ResponseEntity<Message> getAllCivilizations() {
        log.debug("REST request to get all Civilizations");
        Message mensaje;
        try {
            mensaje = new Message(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), "OK", null, civilizationService.getAllCivilizations());
            return new ResponseEntity<>(mensaje, HttpStatus.OK);
        } catch (Exception e) {
            log.error("EXCEPCION", e);
            mensaje = new Message(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), null, "Error getting civilizations", e.getLocalizedMessage());
            return new ResponseEntity<>(mensaje, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * {@code GET  /civilizations} : get all the civilization.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of pais in body.
     */
    @GetMapping("/civilization/{id}")
    public  ResponseEntity<Message> getCivilizationById(@PathVariable String id){
        log.debug("REST request to get all Civilizations");
        Message mensaje;
        try {
            mensaje = new Message(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), "OK", null, civilizationService.getCivilizationById(id));
            return new ResponseEntity<>(mensaje, HttpStatus.OK);
        } catch (Exception e) {
            log.error("EXCEPCION", e);
            mensaje = new Message(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), null, "Error getting civilization by id", e.getLocalizedMessage());
            return new ResponseEntity<>(mensaje, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
