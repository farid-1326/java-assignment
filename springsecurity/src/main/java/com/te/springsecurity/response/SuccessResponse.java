package com.te.springsecurity.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SuccessResponse<T>{

	
	public Integer count;
	
	public T t;
}
