package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class PensionerDetailService {
	
	List<PensionerDetail> details = new ArrayList<>();
	PensionerDetailService() {
		details.add(new PensionerDetail("vijaya", "1234567", "12348765", 85000, 3500, "self", "public"));
		details.add(new PensionerDetail("priyanka", "5437889", "12345678", 45000, 2500, "self", "private"));
		details.add(new PensionerDetail("aniket", "234351", "56781234", 65000, 4500, "family", "public"));
		details.add(new PensionerDetail("pooja", "6456234", "56784321", 50000, 2500, "family", "private"));
		
	}
	
	
	PensionerDetail getPensionerDetails(String aadharNumber) {
		List<PensionerDetail> detail = details.stream().filter(pensionDetail -> pensionDetail.getAadharNumber().equals(aadharNumber)).collect(Collectors.toList());
		if(detail.size() == 0) {
			return new PensionerDetail(false);
		}
		System.out.println(detail.get(0));
		return detail.get(0);
	}
}
