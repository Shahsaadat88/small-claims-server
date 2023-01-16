package com.allstate.smallclaimsserver.control;

import com.allstate.smallclaimsserver.domain.Claim;
import com.allstate.smallclaimsserver.exceptions.ClaimNotFoundException;
import com.allstate.smallclaimsserver.service.ClaimServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/Claim")
public class ClaimController {

    @Autowired
    private ClaimServices claimService;

    @GetMapping
    public List<Claim> getAllClaims(@RequestParam(value="state", required = false) String state){
        if (state == null){
            return claimService.getByState(state);
        }
        else{
            return claimService.getByState(state);
        }
    }

    @GetMapping("/{claimNumber}")
    public Claim findByClaimNumber (@PathVariable String claimNumber) throws ClaimNotFoundException {
        return (Claim) claimService.getByClaimNumberList(claimNumber);
    }
}
