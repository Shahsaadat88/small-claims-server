package com.allstate.smallclaimsserver.service;

import com.allstate.smallclaimsserver.domain.Claim;
import com.allstate.smallclaimsserver.exceptions.ClaimNotFoundException;

import java.util.List;

public interface ClaimServices {

    public List<Claim> getAllClaims();
    public List getByClaimNumberList(String claimNumber) throws ClaimNotFoundException;

    public List<Claim> getByState(String state);
}
