package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dto.TrendDto;
import com.hcl.repository.OrderDetailsRepository;

/***
 * 
 * @author Pradeep
 *@param  trendRange
 *@retun List<trendDto>
 */ 


@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	private OrderDetailsRepository orderRepo;

	@Override
	public List<TrendDto> trendAnalysis() {
		return orderRepo.findAnalysis();
		
	}

}
