package com.allstate.smallclaimsserver.service;

import com.allstate.smallclaimsserver.data.ClaimRepository;
import com.allstate.smallclaimsserver.domain.Claim;
import com.allstate.smallclaimsserver.exceptions.ClaimNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimServiceImpl implements ClaimServices{

    @Autowired
    private ClaimRepository claimRepository;

    @Override
    public List<Claim> getAllClaims() {
        return null;
    }

    @Override
    public List getByClaimNumberList(String claimNumber) throws ClaimNotFoundException {
        return null;
    }

    @Override
    public List<Claim> getByState(String state) {
        return null;
    }
}
