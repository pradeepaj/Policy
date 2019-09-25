package com.hcl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.dto.TrendDto;
import com.hcl.entity.OrderDetails;
@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {

	@Query("SELECT NEW  com.hcl.dto.TrendDto(o.policyId, p.policyName,count(o.policyId))"
			+ " FROM OrderDetails o , Policy p WHERE o.policyId=p.policyId "
			+ " GROUP By o.policyId")
	public List<TrendDto> findAnalysis();

}
