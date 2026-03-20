package com.pos.fnet3.fnet3.controller;

import com.pos.fnet3.fnet3.service.FnetService;
import com.pos.fnet3.soap.GetInfoResponse;
import com.pos.fnet3.soap.SaleByCardResponse;
import com.pos.fnet3.soap.SynchroAndLoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/pos")
@CrossOrigin(origins = "*")
public class PosController {

    @Autowired
    private FnetService fnetService;

    @GetMapping("/cliente")
    public Map<String, Object> getCliente() {
        Map<String, Object> result = new HashMap<>();
        try {
            SynchroAndLoginResponse loginResp = fnetService.login();
            String sessionID = loginResp.getSessionID();

            GetInfoResponse infoResp = fnetService.getInfo(sessionID);

            result.put("success", true);
            result.put("sessionID", sessionID);
            result.put("customerID", infoResp.getCustomer().getId());
            result.put("nombre", infoResp.getCustomer().getPersonalInfo().getName());
            result.put("apellido", infoResp.getCustomer().getPersonalInfo().getSurname());
            result.put("puntos", infoResp.getCustomer().getBalanceData().getBalancePoints());

        } catch (Exception e) {
            result.put("success", false);
            result.put("error", e.getMessage());
        }
        return result;
    }

    @PostMapping("/venta")
    public Map<String, Object> realizarVenta(@RequestBody Map<String, Object> body) {
        Map<String, Object> result = new HashMap<>();
        try {
            String sessionID = (String) body.get("sessionID");
            long customerID = Long.parseLong(body.get("customerID").toString());
            double totalMoney = Double.parseDouble(body.get("totalMoney").toString());
            String notes = (String) body.get("notes");

            SaleByCardResponse saleResp = fnetService.sale(sessionID, customerID, totalMoney, notes);

            result.put("success", true);
            result.put("answerCode", saleResp.getAnswerCode());

        } catch (Exception e) {
            result.put("success", false);
            result.put("error", e.getMessage());
        }
        return result;
    }
}