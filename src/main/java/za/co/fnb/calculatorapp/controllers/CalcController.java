package za.co.fnb.calculatorapp.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.fnb.calculatorapp.controllers.dto.RequestDTO;
import za.co.fnb.calculatorapp.controllers.dto.ResponseDTO;
import za.co.fnb.calculatorapp.services.CalcService;

@RestController
@RequestMapping("v1/api/")
public class CalcController {

    private CalcService calcService;

    private static Logger logger = LoggerFactory.getLogger(CalcController.class);

    @Autowired
    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @PostMapping("add")
    public ResponseEntity<ResponseDTO> add(@RequestBody RequestDTO requestDTO) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Answer is : " + Integer.toString(calcService.add(requestDTO.getNum1(), requestDTO.getNum2())));
        logger.info("{}",calcService.add(requestDTO.getNum1(), requestDTO.getNum2()));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("multiply")
    public ResponseEntity<ResponseDTO> multiply(@RequestBody RequestDTO requestDTO) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Answer is : " + Integer.toString(calcService.multiply(requestDTO.getNum1(), requestDTO.getNum2())));
        logger.info("{}",calcService.multiply(requestDTO.getNum1(), requestDTO.getNum2()));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("subtract")
    public ResponseEntity<ResponseDTO> subtract(@RequestBody RequestDTO requestDTO) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Answer is : " + Integer.toString(calcService.subStract(requestDTO.getNum1(), requestDTO.getNum2())));
        logger.info("{}",calcService.subStract(requestDTO.getNum1(), requestDTO.getNum2()));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("divide")
    public ResponseEntity<ResponseDTO> divide(@RequestBody RequestDTO requestDTO) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Answer is : " + Integer.toString(calcService.divide(requestDTO.getNum1(), requestDTO.getNum2())));
        logger.info("{}",calcService.divide(requestDTO.getNum1(), requestDTO.getNum2()));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

}
