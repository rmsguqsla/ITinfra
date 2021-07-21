package kr.co.infracube.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.infracube.dto.AdminDto;
import kr.co.infracube.dto.CodeDto;
import kr.co.infracube.dto.CustomerDto;
import kr.co.infracube.dto.DeliveryDto;
import kr.co.infracube.mapper.MainMapper;

@Service("mainService")
public class MainService {
	@Autowired
	MainMapper mainmapper;
	
	public List<CodeDto> getGroupCode(CodeDto dto) throws Exception{
		return mainmapper.getGroupCode(dto);
	}
	
	public int insertCode(CodeDto dto) throws Exception{
		return mainmapper.insertCode(dto);
	}
	
	public CodeDto selectCode(CodeDto dto) throws Exception {
		return mainmapper.selectCode(dto);
	}
	
	public List<CodeDto> selectAllGTitle() throws Exception {
		return mainmapper.selectAllGTitle();
	}
	
	public int updateCode(CodeDto dto) throws Exception{
		return mainmapper.updateCode(dto);
	}
	
	public List<CodeDto> getBaseCode(CodeDto dto) throws Exception{
		return mainmapper.getBaseCode(dto);
	}
	
	public List<CodeDto> groupInfo() throws Exception{
		return mainmapper.groupInfo();
	}
	
	public List<CodeDto> selectAllBTitle() throws Exception {
		return mainmapper.selectAllBTitle();
	}
	
	public List<DeliveryDto> getDelivery(HashMap<String, String> paramMap) throws Exception{
		return mainmapper.getDelivery(paramMap);
	}
	
	public List<CustomerDto> customerInfo() throws Exception{
		return mainmapper.customerInfo();
	}
	
	public List<Map<String,String>> selectCustomerInfo(HashMap<String, String> paramMap) throws Exception{
		return mainmapper.selectCustomerInfo(paramMap);
	}
	
	public int processInsertDelivery(DeliveryDto dto) throws Exception{
		return mainmapper.processInsertDelivery(dto);
	}
	
	public DeliveryDto deliveryInfo(DeliveryDto dto) throws Exception{
		return mainmapper.deliveryInfo(dto);
	}
	public int processUpdateDelivery(DeliveryDto dto) throws Exception{
		return mainmapper.processUpdateDelivery(dto);
	}
	
	public AdminDto processLogin(AdminDto admin) throws Exception{
		return mainmapper.processLogin(admin);
	}
	public List<AdminDto> listAdmins(AdminDto dto) throws Exception{
		return mainmapper.listAdmins(dto);
	}
	public List<CustomerDto> listCustomers(HashMap<String, String> hashMap) throws Exception{
		return mainmapper.listCustomers(hashMap);
	}
	public int insertAdmin(AdminDto dto) throws Exception{
		return mainmapper.insertAdmin(dto);
	}
	public int insertCustomer(CustomerDto dto) throws Exception{
		return mainmapper.insertCustomer(dto);
	}
	public int updateAdmin(AdminDto dto) throws Exception{
		return mainmapper.updateAdmin(dto);
	}
	public int updateCustomer(CustomerDto dto) throws Exception{
		return mainmapper.updateCustomer(dto);
	}
	public int passwordChange(AdminDto dto) throws Exception{
		return mainmapper.passwordChange(dto);
	}
}
